package com.company;

public class Main {

    public static void main(String[] args) {
        RugbyPlayer joe = new RugbyPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        FootballPlayer beckham = new FootballPlayer("Beckham");

        Team<RugbyPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> footballTeam = new Team<>("Manchester United");
        footballTeam.addPlayer(beckham);

        Team<RugbyPlayer> melbourne = new Team<>("Melbourne");
        RugbyPlayer banks = new RugbyPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<RugbyPlayer> hawthorn = new Team<>("Hawthorn");
        Team<RugbyPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matcHResult(fremantle, 1, 0);
        hawthorn.matcHResult(adelaideCrows, 3, 8);

        adelaideCrows.matcHResult(fremantle, 2, 1);
//        adelaideCrows.matcHResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
    }
}
