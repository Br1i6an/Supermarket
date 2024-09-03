package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.ProductProviderEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TaxPriceProductEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(PriceProductEntity.class)
public class PriceProductEntity_ { 

    public static volatile SingularAttribute<PriceProductEntity, Double> shopPrice;
    public static volatile SingularAttribute<PriceProductEntity, String> userUpdate;
    public static volatile SingularAttribute<PriceProductEntity, Double> salePrice;
    public static volatile SingularAttribute<PriceProductEntity, String> dateUpdate;
    public static volatile ListAttribute<PriceProductEntity, TaxPriceProductEntity> priceProductEntityList;
    public static volatile SingularAttribute<PriceProductEntity, ProductProviderEntity> productProviderEntity;
    public static volatile SingularAttribute<PriceProductEntity, Integer> id;
    public static volatile SingularAttribute<PriceProductEntity, String> startDate;

}