package com.omid.bookservice;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String writer;

    private String warehouseAddress;

    private Integer count;

    @Enumerated(EnumType.STRING)
    private Category category;
}
