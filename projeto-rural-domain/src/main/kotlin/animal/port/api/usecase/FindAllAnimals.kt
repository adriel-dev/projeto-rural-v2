package animal.port.api.usecase

import animal.model.Animal

interface FindAllAnimals {
    fun findAllAnimals(): Collection<Animal>
}