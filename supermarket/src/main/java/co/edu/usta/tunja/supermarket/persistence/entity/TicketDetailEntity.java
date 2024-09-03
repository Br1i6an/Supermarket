package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "TICKET_DETAIL")
public class TicketDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket_detail")
    private Integer id;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "devolution_request", length = 45, nullable = true)
    private String devolutionRequest;

    @Column(name = "devolution_approved", length = 45, nullable = true)
    private String devolutionApproved;

    @ManyToOne
    @JoinColumn(name = "fk_id_tax_price_product", insertable = false, updatable = false, nullable = false)
    private TaxPriceProductEntity taxPriceProductEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_ticket", insertable = false, updatable = false, nullable = false)
    private TicketEntity ticketEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_person_administrator", insertable = false, updatable = false, nullable = true)
    private PersonEntity personAdministratorEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDevolutionRequest() {
        return devolutionRequest;
    }

    public void setDevolutionRequest(String devolutionRequest) {
        this.devolutionRequest = devolutionRequest;
    }

    public String getDevolutionApproved() {
        return devolutionApproved;
    }

    public void setDevolutionApproved(String devolutionApproved) {
        this.devolutionApproved = devolutionApproved;
    }

    public TaxPriceProductEntity getTaxPriceProductEntity() {
        return taxPriceProductEntity;
    }

    public void setTaxPriceProductEntity(TaxPriceProductEntity taxPriceProductEntity) {
        this.taxPriceProductEntity = taxPriceProductEntity;
    }

    public TicketEntity getTicketEntity() {
        return ticketEntity;
    }

    public void setTicketEntity(TicketEntity ticketEntity) {
        this.ticketEntity = ticketEntity;
    }

    public PersonEntity getPersonAdministratorEntity() {
        return personAdministratorEntity;
    }

    public void setPersonAdministratorEntity(PersonEntity personAdministratorEntity) {
        this.personAdministratorEntity = personAdministratorEntity;
    }

    //   INT NOT NULL,
    //   INT NULL


}
