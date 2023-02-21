package animal.port.api.usecase

import animal.model.Animal

interface SaveAnimal {
    fun saveAnimal(animal: Animal): Animal
}