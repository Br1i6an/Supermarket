package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TAX_PRICE_PRODUCT")

public class TaxPriceProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tax_price_product")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_id_tax", insertable = false, updatable = false, nullable = false)
    private TaxEntity taxEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_price_product", insertable = false, updatable = false, nullable = false)
    private PriceProductEntity priceProductEntity;

    @OneToMany(mappedBy = "taxPriceProductEntity")
    private List<TicketDetailEntity> ticketDetailEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TaxEntity getTaxEntity() {
        return taxEntity;
    }

    public void setTaxEntity(TaxEntity taxEntity) {
        this.taxEntity = taxEntity;
    }

    public PriceProductEntity getPriceProductEntity() {
        return priceProductEntity;
    }

    public void setPriceProductEntity(PriceProductEntity priceProductEntity) {
        this.priceProductEntity = priceProductEntity;
    }

    public List<TicketDetailEntity> getTicketDetailEntityList() {
        return ticketDetailEntityList;
    }

    public void setTicketDetailEntityList(List<TicketDetailEntity> ticketDetailEntityList) {
        this.ticketDetailEntityList = ticketDetailEntityList;
    }
}
