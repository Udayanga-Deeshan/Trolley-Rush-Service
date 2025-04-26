package edu.icet.ecom.entity;

import edu.icet.ecom.util.ProductCategory;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String name;

    private ProductCategory category;

    private  String description;

    private String imageURL;

    private Double unitPrice;

    private Integer stock;
}
