package com.example.vaadin.model;

public class Wrestler {

    private String name;
    private WrestlingOrganisationType wrestlingOrganisationType;
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WrestlingOrganisationType getWrestlingOrganisationType() {
        return wrestlingOrganisationType;
    }

    public void setWrestlingOrganisationType(WrestlingOrganisationType wrestlingOrganisationType) {
        this.wrestlingOrganisationType = wrestlingOrganisationType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
