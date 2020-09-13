package info.sanaebadi.repository.dataSourceImpl

import info.sanaebadi.entity.product.ProductEntity
import info.sanaebadi.entity.product.ProductRequestEntity
import info.sanaebadi.networking.base.AbstractService
import info.sanaebadi.networking.retrofit.ProductRetrofitService
import info.sanaebadi.repository.dataSource.ProductDataSource
import io.reactivex.Single

class ProductOnlineDataSource :
    AbstractService<ProductRetrofitService>(ProductRetrofitService::class.java), ProductDataSource {

    override fun getPromotedPlaces(request: ProductRequestEntity): Single<ProductEntity> {
        return service.getPromotedPlaces(request.lat, request.lng)
    }


}