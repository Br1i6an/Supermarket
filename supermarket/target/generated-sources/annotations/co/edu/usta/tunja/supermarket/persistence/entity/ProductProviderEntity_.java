package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PriceProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.ProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.ProviderEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(ProductProviderEntity.class)
public class ProductProviderEntity_ { 

    public static volatile ListAttribute<ProductProviderEntity, PriceProductEntity> priceProductEntityList;
    public static volatile SingularAttribute<ProductProviderEntity, ProviderEntity> providerEntity;
    public static volatile SingularAttribute<ProductProviderEntity, ProductEntity> productEntity;
    public static volatile SingularAttribute<ProductProviderEntity, Integer> id;
    public static volatile SingularAttribute<ProductProviderEntity, Integer> stock;
    public static volatile SingularAttribute<ProductProviderEntity, Integer> barCode;

}