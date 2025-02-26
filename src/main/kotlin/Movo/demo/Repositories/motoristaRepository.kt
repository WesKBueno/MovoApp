package Movo.demo.Repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MotoristaRepository : JpaRepository<Motorista, Long> {
    fun findByCpf(cpf: String): Motorista?
    fun findByEmail(email: String): Motorista?
}
