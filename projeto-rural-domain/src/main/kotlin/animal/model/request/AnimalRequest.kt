package animal.model.request

import animal.model.Animal
import breed.model.Breed
import farm.model.Farm
import monitoring.model.Monitoring
import java.time.LocalDateTime

class AnimalRequest(
    val id: String,
    val name: String,
    val gender: String,
    val acquisitionDate: LocalDateTime,
    val saleDate: LocalDateTime,
    val acquisitionPrice: Double,
    val salePrice: Double,
    val breed: Breed,
    val monitorings: MutableCollection<Monitoring>,
    val farm: Farm
) {

    fun toDomainAnimal(): Animal {
        return Animal(
            this.id,
            this.name,
            this.gender,
            this.acquisitionDate,
            this.saleDate,
            this.acquisitionPrice,
            this.salePrice,
            this.breed,
            this.monitorings,
            this.farm
        )
    }

}
