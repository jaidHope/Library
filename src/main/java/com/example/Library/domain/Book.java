package com.example.Library.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Book {

    @Id
    private Long id;
    private String name;
    private String author;
    private int year;
    private String genre;

}
