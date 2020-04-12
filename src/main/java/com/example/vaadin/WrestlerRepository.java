package com.example.vaadin;

import com.example.vaadin.model.Wrestler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WrestlerRepository extends JpaRepository<Wrestler, Integer> {

}
