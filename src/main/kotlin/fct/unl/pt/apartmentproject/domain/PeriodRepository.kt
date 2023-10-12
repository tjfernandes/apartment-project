package fct.unl.pt.apartmentproject.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.repository.CrudRepository

@Entity
data class Period(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long
)
interface PeriodRepository: CrudRepository<Period, Long> {
}