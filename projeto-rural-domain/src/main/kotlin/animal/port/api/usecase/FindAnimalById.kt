package animal.port.api.usecase

import animal.model.Animal

interface FindAnimalById {
    fun findAnimalById(animalId: String): Animal
}