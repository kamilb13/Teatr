package com.example.teatroracleprojekt.Repository;

import com.example.teatroracleprojekt.Model.Client;
import jakarta.persistence.Column;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface KlientRepo extends JpaRepository<Client, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Client SET imieKlienta = :imie, nazwiskoKlienta = :nazwisko, emailKlienta = :email WHERE id = :id")
    void editUser(int id, String imie, String nazwisko, String email);
}

