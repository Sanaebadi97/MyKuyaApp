package info.sanaebadi.entity.product

import info.sanaebadi.entity.base.BaseEntity

data class ProductRequestEntity(
    val lat: Double,
    val lng: Double,

    ) : BaseEntity {

}