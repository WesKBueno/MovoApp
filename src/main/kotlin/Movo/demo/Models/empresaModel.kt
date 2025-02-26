package Movo.demo.Models

import Movo.demo.Utils.Endereco
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "empresa")
data class Empresa(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, length = 150)
    val nome: String,

    @Column(nullable = false, unique = true, length = 18)
    val cnpj: String,

    @Column(nullable = false, unique = true, length = 100)
    val email: String,

    @Column(nullable = false, length = 15)
    val telefone: String,

    @Embedded
    val endereco: Endereco,

    @Column(nullable = false)
    val senha: String,

    @Column(name = "data_criacao")
    val dataCriacao: LocalDateTime = LocalDateTime.now(),

    @ManyToOne
    @JoinColumn(name = "role_id")
    val role: Role? = null
)
