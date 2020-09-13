package info.sanaebadi.mapper

import info.sanaebadi.domain.model.product.Product
import info.sanaebadi.domain.model.product.ProductItem
import info.sanaebadi.domain.model.product.ProductModelItem
import info.sanaebadi.entity.product.ProductEntity
import info.sanaebadi.entity.product.ProductItemEntity
import info.sanaebadi.mapper.base.DataLayerMapper
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductMapper @Inject constructor() : DataLayerMapper<ProductItemEntity, ProductItem> {

    fun toDomain(productEntity: ProductEntity): Product {
        val productItemModel: List<ProductModelItem> = ArrayList<ProductModelItem>()

        for (productItem in productEntity.productEntityItem!!){

        }

        return Product()
    }

    override fun toDomain(e: ProductItemEntity?): ProductItem {
        return ProductItem(e!!.commercialName, e.icon, e.id)
    }

    override fun toEntity(d: ProductItem?): ProductItemEntity? {
        return null
    }
}