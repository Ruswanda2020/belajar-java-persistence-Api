package progremmerbeginner.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer {

    @Id
    private String id;

    private String name;

    @Column(name = "primary_email")
    private String primaryEmail;

    private Integer age;

    private Boolean married;

    @Enumerated(EnumType.STRING)
    private CustomersType type;

    @Transient
    private String fullName;

}