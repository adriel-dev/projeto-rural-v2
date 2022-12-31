package owner.model

import farm.model.Farm
import java.time.LocalDate

data class Owner(
    val id: String,
    val name: String,
    val lastName: String,
    val birthDate: LocalDate
)
