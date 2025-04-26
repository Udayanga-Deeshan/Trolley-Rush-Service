package edu.icet.ecom.dto;

import edu.icet.ecom.util.ProductCategory;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Integer id;

    private  String name;

    private ProductCategory category;

    private  String description;

    private String imageURL;

    private Double unitPrice;

    private Integer stock;
}
