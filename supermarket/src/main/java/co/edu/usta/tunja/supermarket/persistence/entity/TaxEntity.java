package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TAX")

public class TaxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tax")
    private Integer id;

    @Column(name = "tax_value", nullable = false)
    private float taxValue;

    @Column(name = "tax_name", length = 45, nullable = false)
    private String taxName;

    @Column(name = "creation_date", nullable = false)
    private String creationDate;

    @OneToMany(mappedBy = "taxEntity")
    private List<TaxPriceProductEntity> taxPriceProductEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(float taxValue) {
        this.taxValue = taxValue;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public List<TaxPriceProductEntity> getTaxPriceProductEntityList() {
        return taxPriceProductEntityList;
    }

    public void setTaxPriceProductEntityList(List<TaxPriceProductEntity> taxPriceProductEntityList) {
        this.taxPriceProductEntityList = taxPriceProductEntityList;
    }
}
