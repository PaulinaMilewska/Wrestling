package com.example.vaadin;

import com.example.vaadin.model.Wrestler;
import com.example.vaadin.model.WrestlingOrganisationType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WrestlerDeck {
    private List<Wrestler> wrestlerList;


    public WrestlerDeck() {
        this.wrestlerList = new ArrayList<>();
    }

    public List<Wrestler> getWrestlerList() {
        return wrestlerList;
    }

    public void setWrestlerList(List<Wrestler> wrestlerList) {
        this.wrestlerList = wrestlerList;
    }
}
