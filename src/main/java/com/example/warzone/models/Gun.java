package com.example.warzone.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Gun extends Base {
    @OneToMany(mappedBy = "gun")
    private List<NerfsAndBuffs> nerfsAndBuffs;
    @OneToOne(mappedBy = "gun")
    private LoadoutGun loadoutGun;
    private String name;
    private String category;

    @OneToMany(mappedBy = "gun")
    private List<GameRepresent> gameRepresent;

    protected Gun() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<NerfsAndBuffs> getNerfsAndBuffs() {
        return nerfsAndBuffs;
    }

    public void setNerfsAndBuffs(List<NerfsAndBuffs> nerfsAndBuffs) {
        this.nerfsAndBuffs = nerfsAndBuffs;
    }

    public LoadoutGun getLoadoutGun() {
        return loadoutGun;
    }

    public void setLoadoutGun(LoadoutGun loadoutGun) {
        this.loadoutGun = loadoutGun;
    }

    public List<GameRepresent> getGameRepresent() {
        return gameRepresent;
    }

    public void setGameRepresents(List<GameRepresent> gameRepresent) {
        this.gameRepresent = gameRepresent;
    }
}
