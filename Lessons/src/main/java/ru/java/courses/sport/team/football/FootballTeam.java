package ru.java.courses.sport.team.football;

import java.util.ArrayList;

public class FootballTeam {

    private ArrayList<FootballPlayer> players;

    private String name;

    private Coach coach;

    private int MaxPlayersCount=20;

    public FootballTeam(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У команды всегда должно быть имя!");
        }
        this.name = name;
        players=new ArrayList<>();
    }

    public void addPlayer(FootballPlayer player) {
        if (players.size() >= MaxPlayersCount) {
            throw new IllegalArgumentException("Игроков в команде может быть не больше 20");
        }
        players.add(player);
    }

    public void addPlayers(FootballPlayer ... addPlayers) {
        if (players.size() + addPlayers.length >= 20) {
            throw new IllegalArgumentException("Игроков в команде может быть не больше 20");
        }

        for(int i = 0; i<addPlayers.length; i++){
            players.add(addPlayers[i]);
        }
    }

    public void removePlayer(FootballPlayer player) {
        players.remove(player);
        player.setActive(false);
    }

    public int getPlayersCount() { return players.size(); }

    public int getScore() {
        int score = 0;
        for (FootballPlayer player : players) {
            score += player.getGoals();
        }
        return score;
    }

    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У команды всегда должно быть имя!");
        }
        this.name = name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public int getMaxPlayersCount() {
        return MaxPlayersCount;
    }

}
