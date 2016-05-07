package com.natidze.irakli.assign2.model;

import java.io.Serializable;

/**
 * Created by Irakli on 01.05.2016.
 */
public class PlayerModel implements Serializable {
    private String name;
    private String image;
    private String description;

    public PlayerModel(String name, String image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "PlayerModel{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
