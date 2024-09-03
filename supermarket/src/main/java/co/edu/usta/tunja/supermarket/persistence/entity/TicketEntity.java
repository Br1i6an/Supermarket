package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TICKET")

public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Integer id;

    @Column(name = "half_payment", nullable = true)
    private double halfPayment;

    @Column(name = "ticket_date",length = 45, nullable = false)
    private String ticketDate;

    @OneToMany(mappedBy = "ticketEntity")
    private List<TicketDetailEntity> ticketDetailEntityList;

    @ManyToOne
    @JoinColumn(name = "fk_id_person_cashier", insertable = false, updatable = false, nullable = false)
    private PersonEntity personCashierEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_person_customer", insertable = false, updatable = false, nullable = false)
    private PersonEntity personCustomerEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getHalfPayment() {
        return halfPayment;
    }

    public void setHalfPayment(double halfPayment) {
        this.halfPayment = halfPayment;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public List<TicketDetailEntity> getTicketDetailEntityList() {
        return ticketDetailEntityList;
    }

    public void setTicketDetailEntityList(List<TicketDetailEntity> ticketDetailEntityList) {
        this.ticketDetailEntityList = ticketDetailEntityList;
    }

    public PersonEntity getPersonCashierEntity() {
        return personCashierEntity;
    }

    public void setPersonCashierEntity(PersonEntity personCashierEntity) {
        this.personCashierEntity = personCashierEntity;
    }

    public PersonEntity getPersonCustomerEntity() {
        return personCustomerEntity;
    }

    public void setPersonCustomerEntity(PersonEntity personCustomerEntity) {
        this.personCustomerEntity = personCustomerEntity;
    }
}
