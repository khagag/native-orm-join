package com.kareem.ormnativequery.orm.entities;

import java.sql.Date;
import java.util.List;


public class UserJoin {
    private Long Id;
    private Long userId;
    private String name;
    private String phone;
    private Double lenght;
    private Date date_of_birth;
    private List<Story> stories;

    public UserJoin(long id,String name,String phone,Double lenght,Date dateOfBirth){
        this.Id = id;
        this.name = name;
        this.phone = phone;
        this.lenght = lenght;
        this.date_of_birth = dateOfBirth;
    }

    public UserJoin(String name,String phone,Double lenght,Date dateOfBirth){
        this.name = name;
        this.phone = phone;
        this.lenght = lenght;
        this.date_of_birth = dateOfBirth;
    }  
}
