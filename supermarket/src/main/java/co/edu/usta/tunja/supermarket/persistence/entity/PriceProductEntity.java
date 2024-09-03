package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PRICE_PRODUCT")

public class PriceProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_price_product")
    private Integer id;

   @Column(name = "sale_price", nullable = false)
    private double salePrice;

    @Column(name = "shop_price", nullable = false)
    private double shopPrice;

    @Column(name = "start_date", nullable = false)
    private String startDate;

    @Column(name = "user_update", length = 45, nullable = false)
    private String userUpdate;

    @Column(name = "date_update", nullable = false)
    private String dateUpdate;

    @ManyToOne
    @JoinColumn(name = "fk_id_product_provider", insertable = false, updatable = false, nullable = false)
    private ProductProviderEntity productProviderEntity;

    @OneToMany(mappedBy = "priceProductEntity")
    private List<TaxPriceProductEntity> priceProductEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public ProductProviderEntity getProductProviderEntity() {
        return productProviderEntity;
    }

    public void setProductProviderEntity(ProductProviderEntity productProviderEntity) {
        this.productProviderEntity = productProviderEntity;
    }

    public List<TaxPriceProductEntity> getPriceProductEntityList() {
        return priceProductEntityList;
    }

    public void setPriceProductEntityList(List<TaxPriceProductEntity> priceProductEntityList) {
        this.priceProductEntityList = priceProductEntityList;
    }
}
