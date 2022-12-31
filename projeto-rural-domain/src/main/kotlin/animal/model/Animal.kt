package animal.model

import animal.exception.MonitoringAlreadyPresentException
import breed.model.Breed
import farm.model.Farm
import monitoring.model.Monitoring
import java.time.LocalDateTime

data class Animal(
    val id: String,
    val name: String,
    val gender: String,
    val acquisitionDate: LocalDateTime,
    val saleDate: LocalDateTime,
    val acquisitionPrice: Double,
    val salePrice: Double,
    val breed: Breed,
    val monitorings: MutableCollection<Monitoring>,
    val farm: Farm
) {

    fun addMonitoring(monitoring: Monitoring) {
        val sameIdMonitorings = monitorings.filter { it.id == monitoring.id }
        if(sameIdMonitorings.isEmpty())
            this.monitorings.add(monitoring)
        else
            throw MonitoringAlreadyPresentException("Monitoring with ID: ${monitoring.id} already present.")
    }

}
