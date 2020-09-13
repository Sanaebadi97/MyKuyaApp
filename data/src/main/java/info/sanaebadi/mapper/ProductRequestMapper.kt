package info.sanaebadi.mapper

import info.sanaebadi.domain.model.product.ProductRequest
import info.sanaebadi.entity.product.ProductRequestEntity
import info.sanaebadi.mapper.base.DataLayerMapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRequestMapper @Inject constructor() :
    DataLayerMapper<ProductRequestEntity, ProductRequest> {

    override fun toDomain(e: ProductRequestEntity?): ProductRequest? {
        return null
    }

    override fun toEntity(d: ProductRequest?): ProductRequestEntity {
        return ProductRequestEntity(d!!.lat, d.lng)
    }


}