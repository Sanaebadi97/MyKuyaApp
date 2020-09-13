package info.sanaebadi.domain.model.product

import info.sanaebadi.domain.model.base.BaseDomainModel


class Product : ArrayList<ProductModelItem>()

data class ProductModelItem(
    val categoryName: String,
    val productItemEntities: List<ProductItem>
) : BaseDomainModel

data class ProductItem(
    val commercialName: String,
    val icon: String,
    val id: Int
) : BaseDomainModel