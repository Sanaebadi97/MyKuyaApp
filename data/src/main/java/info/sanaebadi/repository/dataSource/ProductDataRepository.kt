package info.sanaebadi.repository.dataSource

import info.sanaebadi.domain.model.product.Product
import info.sanaebadi.domain.model.product.ProductRequest
import info.sanaebadi.domain.repository.CacheStrategy
import info.sanaebadi.domain.repository.ProductRepository
import info.sanaebadi.mapper.ProductMapper
import info.sanaebadi.mapper.ProductRequestMapper
import io.reactivex.Single
import javax.inject.Inject

class ProductDataRepository @Inject constructor(
    private val productDataSourceFactory: ProductDataSourceFactory,
    private val productMapper: ProductMapper,
    private val productRequestMapper: ProductRequestMapper,
) : ProductRepository {
    override fun getPromotedPlaces(request: ProductRequest): Single<Product> {
        return productDataSourceFactory.create(CacheStrategy.ONLINE_FIRST)
            .getPromotedPlaces(productRequestMapper.toEntity(request)).map { data ->
            productMapper.toDomain(data)

        }
    }


}
