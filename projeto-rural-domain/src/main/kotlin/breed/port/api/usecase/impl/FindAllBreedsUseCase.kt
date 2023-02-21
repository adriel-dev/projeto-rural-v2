package breed.port.api.usecase.impl

import breed.model.Breed
import breed.port.api.usecase.FindAllBreeds
import breed.port.spi.persistence.BreedRepository

class FindAllBreedsUseCase(
    private val breedRepository: BreedRepository
) : FindAllBreeds {

    override fun findAllBreeds(): Collection<Breed> {
        return breedRepository.findAllBreeds()
    }

}