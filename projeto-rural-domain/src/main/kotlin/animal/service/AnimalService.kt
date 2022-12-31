package animal.service

import animal.model.request.AnimalRequest
import animal.model.response.AnimalResponse
import animal.port.`in`.usecase.*
import animal.port.out.repository.AnimalRepository
import monitoring.model.request.MonitoringRequest

class AnimalService(
    private val animalRepository: AnimalRepository
) : GetAnimalsUseCase, GetAnimalByIdUseCase, GetAnimalByNameUseCase, SaveAnimalUseCase,
    UpdateAnimalUseCase, DeleteAnimalUseCase, AddMonitoringUseCase {

    override fun getAllAnimals(): Collection<AnimalResponse> {
        return animalRepository.findAllAnimals().map { AnimalResponse.fromDomainAnimal(it) }
    }

    override fun getAnimalById(animalId: String): AnimalResponse {
        return AnimalResponse.fromDomainAnimal(animalRepository.findAnimalById(animalId))
    }

    override fun getAnimalByName(animalName: String): AnimalResponse {
        return AnimalResponse.fromDomainAnimal(animalRepository.findAnimalByName(animalName))
    }

    override fun saveAnimal(animal: AnimalRequest): AnimalResponse {
        return AnimalResponse.fromDomainAnimal(animalRepository.saveAnimal(animal.toDomainAnimal()))
    }

    override fun updateAnimal(animalId: String, animal: AnimalRequest): AnimalResponse {
        return AnimalResponse.fromDomainAnimal(animalRepository.updateAnimal(animalId, animal.toDomainAnimal()))
    }

    override fun deleteAnimal(animalId: String) {
        animalRepository.deleteAnimalById(animalId)
    }

    override fun addMonitoring(animalId: String, monitoring: MonitoringRequest): AnimalResponse {
        val foundAnimal = animalRepository.findAnimalById(animalId)
        foundAnimal.addMonitoring(monitoring.toDomainMonitoring())
        return AnimalResponse.fromDomainAnimal(foundAnimal)
    }

}
