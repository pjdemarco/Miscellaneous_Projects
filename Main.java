package com.patrick;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    League chalupaBatman = new League("Chalupa Batman's Justice League");
	    chalupaBatman.addTeam(new Team("Patrick"));
        chalupaBatman.addTeam(new Team("Andrew"));
        chalupaBatman.addTeam(new Team("Hunter"));
        chalupaBatman.addTeam(new Team("Kevin"));
        chalupaBatman.addTeam(new Team("Chris"));
        chalupaBatman.addTeam(new Team("Mike"));
        chalupaBatman.addTeam(new Team("Kody"));
        chalupaBatman.addTeam(new Team("Ben"));

        System.out.println(chalupaBatman.getName());
        System.out.println("Original Order");
        for(int i = 0; i < chalupaBatman.getLeague().size(); i++) {
            System.out.println((i+1) + ". " + chalupaBatman.getLeague().get(i).getTeamName());
        }
        System.out.println();
        System.out.println("*****************");
        System.out.println("Shuffled Draft Order");
        Collections.shuffle(chalupaBatman.getLeague());
        for(int i = 0; i < chalupaBatman.getLeague().size(); i++) {
            System.out.println((i+1) + ". " + chalupaBatman.getLeague().get(i).getTeamName());
        }

    }

}
