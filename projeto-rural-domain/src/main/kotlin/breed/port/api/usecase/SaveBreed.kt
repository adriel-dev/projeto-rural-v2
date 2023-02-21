package breed.port.api.usecase

import breed.model.Breed

interface SaveBreed {
    fun saveBreed(breed: Breed): Breed
}