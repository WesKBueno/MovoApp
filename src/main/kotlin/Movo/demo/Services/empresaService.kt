package Movo.demo.Services

import Movo.demo.Models.Empresa
import Movo.demo.Repositories.EmpresaRepository
import Movo.demo.Repositories.RoleRepository
import Movo.demo.DTO.EmpresaDTO
import Movo.demo.DTO.toDTO
import org.springframework.stereotype.Service

@Service
class EmpresaService(
    private val empresaRepository: EmpresaRepository,
    private val roleRepository: RoleRepository
) {

    fun listarTodos(): List<EmpresaDTO> =
        empresaRepository.findAll().map { it.toDTO() }

    fun buscarPorId(id: Long): EmpresaDTO? =
        empresaRepository.findById(id).orElse(null)?.toDTO()

    fun cadastrar(empresa: Empresa): EmpresaDTO {
        val roleEmpresa = roleRepository.findByNome("EMPRESA")
            ?: throw RuntimeException("Role EMPRESA não encontrada")
        val novaEmpresa = empresa.copy(role = roleEmpresa)
        return empresaRepository.save(novaEmpresa).toDTO()
    }

    fun deletar(id: Long) {
        empresaRepository.deleteById(id)
    }
}
