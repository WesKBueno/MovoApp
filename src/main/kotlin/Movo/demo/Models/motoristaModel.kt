package Movo.demo.Models

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "motorista")
data class Motorista(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val nome: String,

    @Column(nullable = false, unique = true, length = 14)
    val cpf: String,

    @Column(nullable = false, unique = true, length = 11)
    val cnh: String,

    @Column(nullable = false, length = 2)
    val categoriaCnh: String,

    @Column(nullable = false)
    val dataValidadeCnh: LocalDate,

    @Column(nullable = false, length = 15)
    val telefone: String,

    @Column(nullable = false, unique = true, length = 100)
    val email: String,

    @Column(nullable = false)
    val senha: String,

    @Column(name = "data_criacao")
    val dataCriacao: LocalDateTime = LocalDateTime.now(),

    @ManyToOne
    @JoinColumn(name = "role_id")
    val role: Role? = null
)


