package edu.icet.ecom.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Long id;

    private  String name;

    private  String description;

    private String imageURL;

    private Double unitPrice;

    private Integer stock;
}
