package farm.model

import animal.model.Animal
import employee.model.Employee
import owner.model.Owner

data class Farm(
    val id: String,
    val name: String,
    val address: String,
    val city: String,
    val state: String,
    val animals: Collection<Animal>,
    val employees: Collection<Employee>,
    val owner: Owner
)
