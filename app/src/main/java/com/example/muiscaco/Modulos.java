package com.example.muiscaco;

public class Modulos {
    String title;
    String description;
    int idResource;

    public Modulos(String title, String description, int idResource){
        this.title=title;
        this.description=description;
        this.idResource=idResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdResource() {
        return idResource;
    }

    public void setIdResource(int idResource) {
        this.idResource = idResource;
    }

}
