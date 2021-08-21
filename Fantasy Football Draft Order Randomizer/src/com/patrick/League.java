package com.patrick;

import java.util.ArrayList;

public class League {
    private String name;
    private ArrayList<Team> league;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Team> getLeague() {
        return league;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeague(ArrayList<Team> league) {
        this.league = league;
    }
    
    public void addTeam(Team name) {
        this.league.add(name);
    }
}
