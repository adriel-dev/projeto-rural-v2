package animal.model

import breed.model.Breed
import farm.model.Farm
import monitoring.model.Monitoring
import java.time.LocalDateTime

data class Animal(
    val id: String,
    val name: String,
    val gender: String,
    val acquisitionDate: LocalDateTime,
    val saleDate: LocalDateTime,
    val acquisitionPrice: Double,
    val salePrice: Double,
    val breed: Breed,
    val monitorings: Collection<Monitoring>,
    val farm: Farm
)   
