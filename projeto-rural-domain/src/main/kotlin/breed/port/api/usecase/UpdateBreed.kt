package breed.port.api.usecase

import breed.model.Breed

interface UpdateBreed {
    fun updateBreed(breedId: String, breed: Breed): Breed
}