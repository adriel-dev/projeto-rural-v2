package animal.port.api.usecase.impl

import animal.model.Animal
import animal.port.api.usecase.FindAllAnimals
import animal.port.spi.persistence.AnimalRepository

class FindAllAnimalsUseCase(
    private val animalRepository: AnimalRepository
) : FindAllAnimals {

    override fun findAllAnimals(): Collection<Animal> {
        return animalRepository.findAllAnimals()
    }

}