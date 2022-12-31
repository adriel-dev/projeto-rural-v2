package animal.port.`in`.usecase

import animal.model.response.AnimalResponse
import animal.model.request.AnimalRequest
import monitoring.model.request.MonitoringRequest

interface GetAnimalsUseCase {
    fun getAllAnimals(): Collection<AnimalResponse>
}

interface GetAnimalByIdUseCase {
    fun getAnimalById(animalId: String): AnimalResponse
}

interface GetAnimalByNameUseCase {
    fun getAnimalByName(animalName: String): AnimalResponse
}

interface SaveAnimalUseCase {
    fun saveAnimal(animal: AnimalRequest): AnimalResponse
}

interface UpdateAnimalUseCase {
    fun updateAnimal(animalId: String, animal: AnimalRequest): AnimalResponse
}

interface DeleteAnimalUseCase {
    fun deleteAnimal(animalId: String)
}

interface AddMonitoringUseCase {
    fun addMonitoring(animalId: String, monitoring: MonitoringRequest): AnimalResponse
}
