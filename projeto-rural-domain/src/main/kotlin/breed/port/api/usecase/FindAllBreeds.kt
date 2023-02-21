package breed.port.api.usecase

import breed.model.Breed

interface FindAllBreeds {
    fun findAllBreeds(): Collection<Breed>
}