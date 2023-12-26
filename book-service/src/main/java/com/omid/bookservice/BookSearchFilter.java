package com.omid.bookservice;

import lombok.Data;

@Data
public class BookSearchFilter {
    private String title;
    private String warehouseAddress;
    private Integer count ;
    private String writer;
}
