package monitoring.model

import animal.model.Animal
import java.time.LocalDateTime

data class Monitoring(
    val id: String,
    val animal: Animal,
    val accomplishedDate: LocalDateTime,
    val height: Double,
    val weight: Double,
    val dewormed: Boolean
)
