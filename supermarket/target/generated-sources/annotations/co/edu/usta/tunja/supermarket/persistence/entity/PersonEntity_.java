package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonPersonTypeEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketDetailEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(PersonEntity.class)
public class PersonEntity_ { 

    public static volatile SingularAttribute<PersonEntity, String> personName;
    public static volatile SingularAttribute<PersonEntity, String> personPhone;
    public static volatile ListAttribute<PersonEntity, TicketDetailEntity> ticketDetailEntityList;
    public static volatile SingularAttribute<PersonEntity, String> personAddress;
    public static volatile ListAttribute<PersonEntity, TicketEntity> ticketCashierEntityList;
    public static volatile ListAttribute<PersonEntity, TicketEntity> ticketCustomerEntityList;
    public static volatile SingularAttribute<PersonEntity, String> personLastName;
    public static volatile SingularAttribute<PersonEntity, Integer> id;
    public static volatile ListAttribute<PersonEntity, PersonPersonTypeEntity> personPersonTypeEntityList;
    public static volatile SingularAttribute<PersonEntity, String> dni;

}