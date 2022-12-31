package breed.model

import species.model.Species

data class Breed(
    val id: String,
    val name: String,
    val species: Species
)
