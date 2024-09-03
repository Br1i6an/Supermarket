package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketDetailEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(TicketEntity.class)
public class TicketEntity_ { 

    public static volatile ListAttribute<TicketEntity, TicketDetailEntity> ticketDetailEntityList;
    public static volatile SingularAttribute<TicketEntity, PersonEntity> personCashierEntity;
    public static volatile SingularAttribute<TicketEntity, Double> halfPayment;
    public static volatile SingularAttribute<TicketEntity, Integer> id;
    public static volatile SingularAttribute<TicketEntity, String> ticketDate;
    public static volatile SingularAttribute<TicketEntity, PersonEntity> personCustomerEntity;

}