package employee.model

import farm.model.Farm
import java.time.LocalDate

data class Employee(
    val id: String,
    val name: String,
    val lastName: String,
    val birthDate: LocalDate,
    val role: String,
    val salary: Double,
    val farm: Farm
)
