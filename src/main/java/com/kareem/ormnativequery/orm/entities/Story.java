package com.kareem.ormnativequery.orm.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Story {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    @Column(nullable = false)
    private Long userId;
    private String name;
    private String description;

    public Story(long id,long user_id,String name,String desc){
        this.Id = id;
        this.name = name;
        this.description = desc;
        this.userId = user_id;
    }

    public Story(long user_id,String name,String desc){
        this.name=name;
        this.userId=user_id;
        this.description=desc;
    }
}
