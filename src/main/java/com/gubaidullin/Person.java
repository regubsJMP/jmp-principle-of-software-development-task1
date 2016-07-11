package com.gubaidullin;

/**
 * Created by Renat_Gubaidullin on 7/10/2016.
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Person(String name, String surname, int age, int userId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
