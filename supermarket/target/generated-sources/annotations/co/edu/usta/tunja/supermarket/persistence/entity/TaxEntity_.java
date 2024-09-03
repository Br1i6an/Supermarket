package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.TaxPriceProductEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(TaxEntity.class)
public class TaxEntity_ { 

    public static volatile ListAttribute<TaxEntity, TaxPriceProductEntity> taxPriceProductEntityList;
    public static volatile SingularAttribute<TaxEntity, Float> taxValue;
    public static volatile SingularAttribute<TaxEntity, Integer> id;
    public static volatile SingularAttribute<TaxEntity, String> creationDate;
    public static volatile SingularAttribute<TaxEntity, String> taxName;

}