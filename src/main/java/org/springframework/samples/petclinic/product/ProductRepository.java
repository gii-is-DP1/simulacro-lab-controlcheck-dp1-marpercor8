package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.pet.Pet;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Integer> {
    List<Product> findAll();


    @Query("Select productType from Product product")
    List<ProductType> findAllProductTypes();

    Optional<Product> findById(int id);



    Product findByName(String name);

    @Query("Select productType from Product product where product.productType.name LIKE :name")
    ProductType getProductType(String name);
}
