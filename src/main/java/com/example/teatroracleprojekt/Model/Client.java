package com.example.teatroracleprojekt.Model;

import jakarta.persistence.*;

@Entity
@Table(name="KLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KLIENT_ID")
    private int id;
    @Column(name = "IMIE")
    private String imieKlienta;
    @Column(name = "NAZWISKO")
    private String nazwiskoKlienta;

    @Column(name = "EMAIL")
    private String emailKlienta;

    public Client(){

    }

    public Client(int id, String imieKlienta, String nazwiskoKlienta, String emailKlienta) {
        this.id = id;
        this.imieKlienta = imieKlienta;
        this.nazwiskoKlienta = nazwiskoKlienta;
        this.emailKlienta = emailKlienta;
    }

    public Client(String imieKlienta, String nazwiskoKlienta, String emailKlienta) {
        this.imieKlienta = imieKlienta;
        this.nazwiskoKlienta = nazwiskoKlienta;
        this.emailKlienta = emailKlienta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImieKlienta() {
        return imieKlienta;
    }

    public void setImieKlienta(String imieKlienta) {
        this.imieKlienta = imieKlienta;
    }

    public String getNazwiskoKlienta() {
        return nazwiskoKlienta;
    }

    public void setNazwiskoKlienta(String nazwiskoKlienta) {
        this.nazwiskoKlienta = nazwiskoKlienta;
    }

    public String getEmailKlienta() {
        return emailKlienta;
    }

    public void setEmailKlienta(String emailKlienta) {
        this.emailKlienta = emailKlienta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", imieKlienta='" + imieKlienta + '\'' +
                ", nazwiskoKlienta='" + nazwiskoKlienta + '\'' +
                ", emailKlienta='" + emailKlienta + '\'' +
                '}';
    }
}
