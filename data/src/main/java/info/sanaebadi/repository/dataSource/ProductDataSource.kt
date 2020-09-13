package info.sanaebadi.repository.dataSource

import info.sanaebadi.entity.product.ProductEntity
import info.sanaebadi.entity.product.ProductRequestEntity
import io.reactivex.Single

interface ProductDataSource {
    fun getPromotedPlaces(request: ProductRequestEntity): Single<ProductEntity>
}