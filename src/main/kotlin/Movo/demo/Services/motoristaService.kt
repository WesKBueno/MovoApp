package Movo.demo.Services

import Movo.demo.DTO.MotoristaDTO
import Movo.demo.Models.Motorista
import Movo.demo.Repositories.MotoristaRepository
import Movo.demo.Repositories.RoleRepository
import org.springframework.stereotype.Service

@Service
class MotoristaService(
    private val motoristaRepository: MotoristaRepository,
    private val roleRepository: RoleRepository
) {

    fun listarTodos(): List<MotoristaDTO> {
        return motoristaRepository.findAll().map { it.toDTO() }
    }

    fun buscarPorId(id: Long): MotoristaDTO? {
        return motoristaRepository.findById(id).orElse(null)?.toDTO()
    }

    fun cadastrar(motorista: Motorista): MotoristaDTO {
        // Busca a role MOTORISTA
        val roleMotorista = roleRepository.findByNome("MOTORISTA")
            ?: throw RuntimeException("Role MOTORISTA não encontrada")

        // Cria um novo objeto motorista com a role atribuída.
        val novoMotorista = motorista.copy(role = roleMotorista)

        return motoristaRepository.save(novoMotorista).toDTO()
    }

    fun deletar(id: Long) {
        motoristaRepository.deleteById(id)
    }
}

fun Motorista.toDTO(): MotoristaDTO {
    return MotoristaDTO(
        id = this.id,
        nome = this.nome,
        cpf = this.cpf,
        cnh = this.cnh,
        categoriaCnh = this.categoriaCnh,
        dataValidadeCnh = this.dataValidadeCnh,
        telefone = this.telefone,
        email = this.email
    )
}

