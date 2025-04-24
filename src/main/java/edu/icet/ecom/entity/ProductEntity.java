package edu.icet.ecom.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductEntity {
    private Long id;

    private  String name;

    private  String description;

    private String imageURL;

    private Double unitPrice;

    private Integer stock;
}
