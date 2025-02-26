package Movo.demo.Utils

import jakarta.persistence.Column
import jakarta.persistence.Embeddable


@Embeddable
data class Endereco(
    @Column(name = "rua", nullable = false, length = 150)
    val rua: String,

    @Column(name = "bairro", nullable = false, length = 100)
    val bairro: String,

    @Column(name = "numero", nullable = false, length = 20)
    val numero: String,

    @Column(name = "cidade", nullable = false, length = 100)
    val cidade: String,

    @Column(name = "uf", nullable = false, length = 2)
    val uf: String,

    @Column(name = "complemento", length = 150)
    val complemento: String? = null,

    @Column(name = "cep", length = 10)
    val cep: String? = null
)
