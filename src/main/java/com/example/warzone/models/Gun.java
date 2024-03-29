package com.example.warzone.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Gun extends Base {
    @OneToMany(mappedBy = "gun")
    private List<NerfsAndBuffs> nerfsAndBuffs;
    @OneToOne(mappedBy = "gun")
    private LoadoutGun loadoutGun;
    @OneToMany(mappedBy = "gun")
    private List<Camo> camo;
    private String name;
    private String category;
    private String gameRepresents;

    public Gun() {
    }

    public Gun(String name, String category, String gameRepresents) {
        this.name = name;
        this.category = category;
        this.gameRepresents = gameRepresents;
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

    public List<Camo> getCamo() {
        return camo;
    }

    public void setCamo(List<Camo> camo) {
        this.camo = camo;
    }

    public LoadoutGun getLoadoutGun() {
        return loadoutGun;
    }

    public void setLoadoutGun(LoadoutGun loadoutGun) {
        this.loadoutGun = loadoutGun;
    }

    public String getGameRepresents() {
        return gameRepresents;
    }

    public void setGameRepresents(String gameRepresents) {
        this.gameRepresents = gameRepresents;
    }
}
