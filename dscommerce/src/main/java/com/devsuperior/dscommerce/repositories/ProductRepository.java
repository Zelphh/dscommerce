package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT obj from Product obj " +
            "JOIN FETCH obj.categories c " +
            "WHERE UPPER(obj.name) LIKE UPPER(CONCAT('%', :name, '%')) " +
            "AND UPPER(c.name) LIKE UPPER(CONCAT('%', :category, '%'))")
    Page<Product> searchByQueryParams(String name, String category, Pageable pageble);
}
