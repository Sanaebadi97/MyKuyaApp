package info.sanaebadi.domain.model.product

import info.sanaebadi.domain.model.base.BaseDomainModel

data class ProductRequest(
    val lat: Double,
    val lng: Double
) : BaseDomainModel {

}