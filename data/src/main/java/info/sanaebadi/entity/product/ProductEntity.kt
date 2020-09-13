package info.sanaebadi.entity.product

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import info.sanaebadi.entity.base.BaseEntity


data class ProductEntity(val productEntityItem: ProductEntityItem) : BaseEntity

@JsonClass(generateAdapter = true)
data class ProductEntityItem(
    @Json(name = "categoryName")
    val categoryName: String,
    @Json(name = "products")
    val productItemEntities: List<ProductItemEntity>
) : BaseEntity

@JsonClass(generateAdapter = true)
data class ProductItemEntity(
    @Json(name = "commercialName")
    val commercialName: String,
    @Json(name = "icon")
    val icon: String,
    @Json(name = "id")
    val id: Int
) : BaseEntity