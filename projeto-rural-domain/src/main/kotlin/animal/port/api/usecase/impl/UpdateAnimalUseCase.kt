package animal.port.api.usecase.impl

import animal.model.Animal
import animal.port.api.usecase.UpdateAnimal
import animal.port.spi.persistence.AnimalRepository

class UpdateAnimalUseCase(
    private val animalRepository: AnimalRepository
) : UpdateAnimal {

    override fun updateAnimal(animalId: String, animal: Animal): Animal {
        return animalRepository.updateAnimal(animalId, animal)
    }

}