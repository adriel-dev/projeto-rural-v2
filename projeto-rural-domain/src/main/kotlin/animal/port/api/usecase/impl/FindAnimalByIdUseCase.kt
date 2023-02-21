package animal.port.api.usecase.impl

import animal.model.Animal
import animal.port.api.usecase.FindAnimalById
import animal.port.spi.persistence.AnimalRepository

class FindAnimalByIdUseCase(
    private val animalRepository: AnimalRepository
) : FindAnimalById {

    override fun findAnimalById(animalId: String): Animal {
        return animalRepository.findAnimalById(animalId)
    }

}