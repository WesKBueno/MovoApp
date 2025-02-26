package Movo.demo.DTO

import Movo.demo.Models.Empresa
import Movo.demo.Utils.Endereco

data class EmpresaDTO(
    val id: Long?,
    val nome: String,
    val cnpj: String,
    val email: String,
    val telefone: String,
    val endereco: EnderecoDTO
)

fun Empresa.toDTO(): EmpresaDTO {
    return EmpresaDTO(
        id = this.id,
        nome = this.nome,
        cnpj = this.cnpj,
        email = this.email,
        telefone = this.telefone,
        endereco = this.endereco.toDTO()
    )
}
