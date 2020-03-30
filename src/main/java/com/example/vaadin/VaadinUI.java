package com.example.vaadin;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class VaadinUI extends VerticalLayout {

    public VaadinUI() {
        Button addButton = new Button("Add Wrestler", event -> {
            UI.getCurrent().navigate("add");
        });

        Button showListButton = new Button("Show all Wrestlers", event -> {
            UI.getCurrent().navigate("list");
        });

        add(addButton, showListButton);


    }


}
