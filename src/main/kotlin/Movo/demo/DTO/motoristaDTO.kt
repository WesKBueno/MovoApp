package Movo.demo.DTO

import java.time.LocalDate

data class MotoristaDTO(
    val id: Long?,
    val nome: String,
    val cpf: String,
    val cnh: String,
    val categoriaCnh: String,
    val dataValidadeCnh: LocalDate,
    val telefone: String,
    val email: String
)
