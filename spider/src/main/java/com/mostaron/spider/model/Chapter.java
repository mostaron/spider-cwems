package com.mostaron.spider.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="t_chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="chapter_order")
    Integer order;

    @Column(name="chapter_name")
    String name;
    String content;
}
