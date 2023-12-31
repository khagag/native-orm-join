package com.kareem.ormnativequery.orm.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_account")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    private String name;
    private String phone;
    private Double lenght;
    private Date date_of_birth;

    public User(){
    }

    public User(long id,String name,String phone,Double lenght,Date dateOfBirth){
        this.Id = id;
        this.name = name;
        this.phone = phone;
        this.lenght = lenght;
        this.date_of_birth = dateOfBirth;
    }

    public User(String name,String phone,Double lenght,Date dateOfBirth){
        this.name = name;
        this.phone = phone;
        this.lenght = lenght;
        this.date_of_birth = dateOfBirth;
    }  
}
