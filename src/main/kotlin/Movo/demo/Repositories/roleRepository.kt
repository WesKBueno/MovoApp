package Movo.demo.Repositories

import Movo.demo.Models.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<Role, Long> {
    fun findByNome(nome: String): Role?
}
