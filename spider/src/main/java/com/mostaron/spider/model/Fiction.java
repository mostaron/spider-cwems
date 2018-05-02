package com.mostaron.spider.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="t_fiction")
public class Fiction {

    @Id
    Long id;
    String name;
    String author;

}
