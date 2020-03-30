package com.example.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("hello")
@StyleSheet("/css/style.css")
public class ProjectGui extends VerticalLayout {

    public ProjectGui() {
        TextField textFieldHello = new TextField("Hello");
        Button buttonHello = new Button("Hello", new Icon(VaadinIcon.AIRPLANE));
        Label label = new Label();

        buttonHello.addClickListener(buttonClickEvent -> {label.setText("Hello "+ textFieldHello.getValue());
        add(new Image("https://media.tenor.com/images/1170597818a37a7c6e3e1d4baeb6e2eb/tenor.gif", "hello"));
        });

        add(textFieldHello, buttonHello, label);

    }




}
