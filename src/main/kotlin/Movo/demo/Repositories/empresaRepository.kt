package Movo.demo.Repositories

import Movo.demo.Models.Empresa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmpresaRepository : JpaRepository<Empresa, Long> {
    fun findByCnpj(cnpj: String): Empresa?
    fun findByEmail(email: String): Empresa?
}
