package com.example.teatroracleprojekt.Model;

import jakarta.persistence.*;

@Entity
@Table(name="AKTOR")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AKTOR_ID")
    private int id;
    @Column(name = "IMIE")
    private String name;
    @Column(name = "NAZWISKO")
    private String lastName;

    public User() {
    }

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public User(String imie, String nazwisko) {
        this.name = imie;
        this.lastName = nazwisko;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
