package animal.port.spi.persistence

import animal.model.Animal

interface AnimalRepository {
    fun saveAnimal(animal: Animal): Animal
    fun updateAnimal(animalId: String, animal: Animal): Animal
    fun findAnimalById(animalId: String): Animal
    fun findAllAnimals(): Collection<Animal>
    fun deleteAnimalById(animalId: String)
}