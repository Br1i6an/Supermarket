package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PriceProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TaxEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketDetailEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(TaxPriceProductEntity.class)
public class TaxPriceProductEntity_ { 

    public static volatile ListAttribute<TaxPriceProductEntity, TicketDetailEntity> ticketDetailEntityList;
    public static volatile SingularAttribute<TaxPriceProductEntity, PriceProductEntity> priceProductEntity;
    public static volatile SingularAttribute<TaxPriceProductEntity, Integer> id;
    public static volatile SingularAttribute<TaxPriceProductEntity, TaxEntity> taxEntity;

}