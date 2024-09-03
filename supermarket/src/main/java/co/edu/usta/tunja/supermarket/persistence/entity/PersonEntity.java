package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PERSON")

public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Integer id;

    @Column(name = "person_name", length = 45 , nullable = false)
    private String personName;

    @Column(name = "person_last_name", length = 45 , nullable = false)
    private String personLastName;

    @Column(name = "person_phone", length = 10 , nullable = true)
    private String personPhone;

    @Column(name = "person_address", length = 45 , nullable = true)
    private String personAddress;

    @Column(name = "dni", length = 45, nullable = true)
    private String dni;

    @OneToMany(mappedBy = "personAdministratorEntity")
    private List<TicketDetailEntity> ticketDetailEntityList;

    @OneToMany(mappedBy = "personCashierEntity")
    private List<TicketEntity> ticketCashierEntityList;

    @OneToMany(mappedBy = "personCustomerEntity")
    private List<TicketEntity> ticketCustomerEntityList;

    @OneToMany(mappedBy = "personEntity")
    private List<PersonPersonTypeEntity> personPersonTypeEntityList;

    //fk_id_person_type INT NOT NULL
}
