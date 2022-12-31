package animal.model.response

import animal.model.Animal
import breed.model.Breed
import farm.model.Farm
import monitoring.model.Monitoring
import java.time.LocalDateTime

class AnimalResponse(
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

    companion object {
        fun fromDomainAnimal(animal: Animal): AnimalResponse {
            return AnimalResponse(
                animal.id,
                animal.name,
                animal.gender,
                animal.acquisitionDate,
                animal.saleDate,
                animal.acquisitionPrice,
                animal.salePrice,
                animal.breed,
                animal.monitorings,
                animal.farm
            )
        }
    }

}
