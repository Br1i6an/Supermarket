package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PROVIDER")

public class ProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provider")
    private Integer id;

    @Column(name = "name_provider", length = 45, nullable = false)
    private String providerName;

    @Column(name = "nit", length = 45, nullable = false)
    private String providerNit;

    @Column(name = "url", length = 45, nullable = true)
    private String providerUrl;

    @Column(name = "address", length = 45, nullable = false)
    private String providerAddress;

    @Column(name = "phone_number", length = 45, nullable = false)
    private String providerPhone;

    @OneToMany(mappedBy = "providerEntity")
    private List<ProductProviderEntity> providerEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderNit() {
        return providerNit;
    }

    public void setProviderNit(String providerNit) {
        this.providerNit = providerNit;
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public List<ProductProviderEntity> getProviderEntityList() {
        return providerEntityList;
    }

    public void setProviderEntityList(List<ProductProviderEntity> providerEntityList) {
        this.providerEntityList = providerEntityList;
    }
}
