package breed.port.spi.persistence

import breed.model.Breed

interface BreedRepository {
    fun findAllBreeds(): Collection<Breed>
    fun findBreedById(breedId: String): Breed
    fun saveBreed(breed: Breed): Breed
    fun updateBreed(breedId: String, breed: Breed): Breed
}