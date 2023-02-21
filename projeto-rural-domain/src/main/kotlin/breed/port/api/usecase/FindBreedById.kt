package breed.port.api.usecase

import breed.model.Breed

interface FindBreedById {
    fun findBreedById(breedId: String): Breed
}