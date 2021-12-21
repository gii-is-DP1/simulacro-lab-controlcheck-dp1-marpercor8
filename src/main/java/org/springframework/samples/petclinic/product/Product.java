package org.springframework.samples.petclinic.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Size(min = 3, max = 50)
    String name;

    @Min(0)
    double price;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "id", name = "productId")
    ProductType productType;
}
