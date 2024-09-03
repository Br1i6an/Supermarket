package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TaxPriceProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-06T10:52:06")
@StaticMetamodel(TicketDetailEntity.class)
public class TicketDetailEntity_ { 

    public static volatile SingularAttribute<TicketDetailEntity, String> devolutionApproved;
    public static volatile SingularAttribute<TicketDetailEntity, Integer> amount;
    public static volatile SingularAttribute<TicketDetailEntity, TaxPriceProductEntity> taxPriceProductEntity;
    public static volatile SingularAttribute<TicketDetailEntity, PersonEntity> personAdministratorEntity;
    public static volatile SingularAttribute<TicketDetailEntity, TicketEntity> ticketEntity;
    public static volatile SingularAttribute<TicketDetailEntity, String> devolutionRequest;
    public static volatile SingularAttribute<TicketDetailEntity, Integer> id;

}