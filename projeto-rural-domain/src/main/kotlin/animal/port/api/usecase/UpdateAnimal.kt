package animal.port.api.usecase

import animal.model.Animal

interface UpdateAnimal {
    fun updateAnimal(animalId: String, animal: Animal): Animal
}