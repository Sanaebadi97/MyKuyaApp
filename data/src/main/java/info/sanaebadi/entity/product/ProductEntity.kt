package info.sanaebadi.entity.product
import com.squareup.moshi.JsonClass

import com.squareup.moshi.Json


class ProductEntity : ArrayList<ProductEntityItem>()

@JsonClass(generateAdapter = true)
data class ProductEntityItem(
    @Json(name = "categoryName")
    val categoryName: String,
    @Json(name = "products")
    val productItemEntities: List<ProductItemEntity>
)

@JsonClass(generateAdapter = true)
data class ProductItemEntity(
    @Json(name = "commercialName")
    val commercialName: String,
    @Json(name = "icon")
    val icon: String,
    @Json(name = "id")
    val id: Int
)