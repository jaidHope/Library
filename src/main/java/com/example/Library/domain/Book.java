package com.example.Library.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book {

    private String name;
    private String author;
    private int year;
    private String genre;

    }
