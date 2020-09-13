package info.sanaebadi.networking.retrofit

import info.sanaebadi.entity.product.ProductEntity
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductRetrofitService {
    @GET("product/catalog")

    fun getPromotedPlaces(
        @Query("lat") latNum: Double,
        @Query("lng") lngNumb: Double
    ): Single<ProductEntity>
}

