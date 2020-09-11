package info.sanaebadi.mapper.base;


import info.sanaebadi.domain.model.base.BaseDomainModel;
import info.sanaebadi.entity.base.BaseEntity;

public interface DataLayerMapper<E extends BaseEntity, D extends BaseDomainModel> {

    D toDomain(E e);

    E toEntity(D d);

}
