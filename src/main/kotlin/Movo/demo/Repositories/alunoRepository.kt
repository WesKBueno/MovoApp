package Movo.demo.Repositories

import Movo.demo.Models.Aluno
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AlunoRepository : JpaRepository<Aluno, Long> {
    fun findByCpf(cpf: String): Aluno?
    fun findByEmail(email: String): Aluno?
}
