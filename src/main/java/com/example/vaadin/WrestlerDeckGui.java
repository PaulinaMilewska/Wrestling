package com.example.vaadin;

import com.example.vaadin.model.Wrestler;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("list")
public class WrestlerDeckGui extends VerticalLayout {

    @Autowired
    public WrestlerDeckGui(WrestlerDeck wrestlerDeck) {
        Button returnButton = new Button("Menu", event -> {
            UI.getCurrent().navigate("");
        });

        add(returnButton);

        Grid<Wrestler> grid = new Grid<>(Wrestler.class);
        grid.setItems(wrestlerDeck.getWrestlerList());

        grid.removeColumnByKey("image");
        grid.addColumn(new ComponentRenderer<>(wrestler -> {
                    Image image = new Image(wrestler.getImage(), wrestler.getName() );
                    return image;
                })).setHeader("Image");

        add(grid);
    }
}
