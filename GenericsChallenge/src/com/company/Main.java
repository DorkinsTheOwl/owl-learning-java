package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<RugbyPlayer>> rugbyLeague = new League<>("RLIF");
        Team<RugbyPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<RugbyPlayer> melbourne = new Team<>("Melbourne");
        Team<RugbyPlayer> hawthorn = new Team<>("Hawthorn");
        Team<RugbyPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matcHResult(fremantle, 1, 0);
        hawthorn.matcHResult(adelaideCrows, 3, 8);
        adelaideCrows.matcHResult(fremantle, 2, 1);

        rugbyLeague.add(adelaideCrows);
        rugbyLeague.add(melbourne);
        rugbyLeague.add(hawthorn);
        rugbyLeague.add(fremantle);

//        rugbyLeague.add(baseballTeam);
        rugbyLeague.showLeagueTable();
    }
}
