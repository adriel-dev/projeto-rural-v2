package breed.port.api.usecase.impl

import breed.model.Breed
import breed.port.api.usecase.FindBreedById
import breed.port.spi.persistence.BreedRepository

class FindBreedByIdUseCase(
    private val breedRepository: BreedRepository
) : FindBreedById {

    override fun findBreedById(breedId: String): Breed {
        return breedRepository.findBreedById(breedId)
    }

}