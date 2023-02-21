package animal.port.api.usecase.impl

import animal.model.Animal
import animal.port.api.usecase.SaveAnimal
import animal.port.spi.persistence.AnimalRepository

class SaveAnimalUseCase(
    private val animalRepository: AnimalRepository
) : SaveAnimal {

    override fun saveAnimal(animal: Animal): Animal {
        return animalRepository.saveAnimal(animal)
    }

}