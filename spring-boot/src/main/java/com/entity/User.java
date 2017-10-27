package com.entity;
import java.io.Serializable;

public class User implements Serializable{
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private String address;
    private Double height;



    public void setId(Long id){this.id = id;}
    public Long getId(){return this.id;}


    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}


    public void setSex(String sex){this.sex = sex;}
    public String getSex(){return this.sex;}


    public void setAge(Integer age){this.age = age;}
    public Integer getAge(){return this.age;}


    public void setAddress(String address){this.address = address;}
    public String getAddress(){return this.address;}


    public void setHeight(Double height){this.height = height;}
    public Double getHeight(){return this.height;}

}