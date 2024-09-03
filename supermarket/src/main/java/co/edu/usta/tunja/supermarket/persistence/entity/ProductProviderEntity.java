package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT_PROVIDER")

public class ProductProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_provider")
    private Integer id;

    @Column(name = "bar_code", length = 45, nullable = false)
    private Integer barCode;

    @Column(name = "stock", length = 45, nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "fk_id_product",  insertable = false, updatable = false, nullable = false)
    private ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_provider",  insertable = false, updatable = false, nullable = false)
    private ProviderEntity providerEntity;

    @OneToMany(mappedBy = "productProviderEntity")
    private List<PriceProductEntity> priceProductEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBarCode() {
        return barCode;
    }

    public void setBarCode(Integer barCode) {
        this.barCode = barCode;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public ProviderEntity getProviderEntity() {
        return providerEntity;
    }

    public void setProviderEntity(ProviderEntity providerEntity) {
        this.providerEntity = providerEntity;
    }

    public List<PriceProductEntity> getPriceProductEntityList() {
        return priceProductEntityList;
    }

    public void setPriceProductEntityList(List<PriceProductEntity> priceProductEntityList) {
        this.priceProductEntityList = priceProductEntityList;
    }
}
