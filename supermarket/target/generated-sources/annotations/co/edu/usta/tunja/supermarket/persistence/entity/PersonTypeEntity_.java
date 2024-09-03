package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonPersonTypeEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(PersonTypeEntity.class)
public class PersonTypeEntity_ { 

    public static volatile SingularAttribute<PersonTypeEntity, String> personTypeName;
    public static volatile SingularAttribute<PersonTypeEntity, Integer> id;
    public static volatile ListAttribute<PersonTypeEntity, PersonPersonTypeEntity> personPersonTypeEntityList;

}