package info.sanaebadi.domain.repository

import info.sanaebadi.domain.model.product.Product
import info.sanaebadi.domain.model.product.ProductRequest
import io.reactivex.Single

interface  ProductRepository {
    fun getPromotedPlaces(request: ProductRequest): Single<Product>
}