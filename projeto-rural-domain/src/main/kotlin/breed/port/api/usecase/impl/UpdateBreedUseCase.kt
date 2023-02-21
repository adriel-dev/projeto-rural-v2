package breed.port.api.usecase.impl

import breed.model.Breed
import breed.port.api.usecase.UpdateBreed
import breed.port.spi.persistence.BreedRepository

class UpdateBreedUseCase(
    private val breedRepository: BreedRepository
) : UpdateBreed {

    override fun updateBreed(breedId: String, breed: Breed): Breed {
        return breedRepository.updateBreed(breedId, breed)
    }

}