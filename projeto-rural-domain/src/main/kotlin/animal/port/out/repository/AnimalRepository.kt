package animal.port.out.repository

import animal.model.Animal

interface AnimalRepository {

    fun findAllAnimals(): Collection<Animal>
    fun findAnimalById(animalId: String): Animal
    fun findAnimalByName(animalName: String): Animal
    fun saveAnimal(animal: Animal): Animal
    fun updateAnimal(animalId: String, animal: Animal): Animal
    fun deleteAnimalById(animalId: String)

}
