package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")

public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer id;

    @Column(name = "product_name", length = 45, nullable = false)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "fk_id_product_type", insertable = false, updatable = false, nullable = false)
    private ProductTypeEntity productTypeEntity;

    @OneToMany(mappedBy = "productEntity")
    private List<ProductProviderEntity> productProviderEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductTypeEntity getProductTypeEntity() {
        return productTypeEntity;
    }

    public void setProductTypeEntity(ProductTypeEntity productTypeEntity) {
        this.productTypeEntity = productTypeEntity;
    }

    public List<ProductProviderEntity> getProductProviderEntityList() {
        return productProviderEntityList;
    }

    public void setProductProviderEntityList(List<ProductProviderEntity> productProviderEntityList) {
        this.productProviderEntityList = productProviderEntityList;
    }
}
