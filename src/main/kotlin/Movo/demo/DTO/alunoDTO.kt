package Movo.demo.DTO

import Movo.demo.Models.Aluno
import Movo.demo.Utils.Endereco

fun Endereco.toDTO(): EnderecoDTO {
    return EnderecoDTO(
        rua = this.rua,
        bairro = this.bairro,
        numero = this.numero,
        cidade = this.cidade,
        uf = this.uf,
        complemento = this.complemento,
        cep = this.cep
    )
}

fun Aluno.toDTO(): AlunoDTO {
    return AlunoDTO(
        id = this.id,
        nome = this.nome,
        cpf = this.cpf,
        email = this.email,
        telefone = this.telefone,
        endereco = this.endereco.toDTO(),
        universidade = this.universidade,
        genero = this.genero
    )
}


data class EnderecoDTO(
    val rua: String,
    val bairro: String,
    val numero: String,
    val cidade: String,
    val uf: String,
    val complemento: String? = null,
    val cep: String? = null
)

data class AlunoDTO(
    val id: Long?,
    val nome: String,
    val cpf: String,
    val email: String,
    val telefone: String,
    val endereco: EnderecoDTO,
    val universidade: String,
    val genero: String
)
