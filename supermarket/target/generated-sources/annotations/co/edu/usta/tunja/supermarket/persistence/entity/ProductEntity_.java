package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.ProductProviderEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.ProductTypeEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(ProductEntity.class)
public class ProductEntity_ { 

    public static volatile SingularAttribute<ProductEntity, ProductTypeEntity> productTypeEntity;
    public static volatile SingularAttribute<ProductEntity, Integer> id;
    public static volatile SingularAttribute<ProductEntity, String> productName;
    public static volatile ListAttribute<ProductEntity, ProductProviderEntity> productProviderEntityList;

}