package com.example.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;

public class Login {

    LoginForm component = new LoginForm();


    component.addLoginListener(e -> {
        boolean isAuthenticated = authenticate(e);
        if (isAuthenticated) {
            navigateToMainPage();
        } else {
            component.setError(true);
        }
    });

}
