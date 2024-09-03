package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.ProductProviderEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(ProviderEntity.class)
public class ProviderEntity_ { 

    public static volatile SingularAttribute<ProviderEntity, String> providerPhone;
    public static volatile SingularAttribute<ProviderEntity, String> providerAddress;
    public static volatile ListAttribute<ProviderEntity, ProductProviderEntity> providerEntityList;
    public static volatile SingularAttribute<ProviderEntity, String> providerNit;
    public static volatile SingularAttribute<ProviderEntity, Integer> id;
    public static volatile SingularAttribute<ProviderEntity, String> providerName;
    public static volatile SingularAttribute<ProviderEntity, String> providerUrl;

}