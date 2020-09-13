package info.sanaebadi.repository.dataSource

import info.sanaebadi.domain.repository.CacheStrategy
import info.sanaebadi.repository.dataSource.base.BaseDataSourceFactory
import io.reactivex.Completable
import javax.inject.Inject

class ProductDataSourceFactory @Inject constructor() : BaseDataSourceFactory<ProductDataSource> {

    override fun create(cacheStrategy: CacheStrategy?, vararg params: String?): ProductDataSource {
        return PlaceOnlineDataSource()
    }

    override fun deleteCache(): Completable? {
        return null
    }
}