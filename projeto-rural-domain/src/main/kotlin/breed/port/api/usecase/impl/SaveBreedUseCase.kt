package breed.port.api.usecase.impl

import breed.model.Breed
import breed.port.api.usecase.SaveBreed
import breed.port.spi.persistence.BreedRepository

class SaveBreedUseCase(
    private val breedRepository: BreedRepository
) : SaveBreed {

    override fun saveBreed(breed: Breed): Breed {
        return breedRepository.saveBreed(breed)
    }

}