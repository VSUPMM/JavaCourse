package ru.java.courses.sport.team.football;

public class FootballPlayer extends Athlete {

    private int goals;

    private PlayerRole role;

    public FootballPlayer(String name, PlayerRole role) {

        super(name);

        if (role == null) {
            throw new IllegalArgumentException("У игрока всегда должна быть роль!");
        }
        this.role = role;

        this.goals = 0;
    }

    /**
     * Игрок зарабатывает очки
     */
    public void score(){ if (super.isActive()) goals++; };

    /**
     * @return текущее количество заработанных очков
     */

    public int getGoals(){ return goals; }

    public PlayerRole getRole() { return role; }

    public void setRole(PlayerRole role) {
        if (role == null) {
            throw new IllegalArgumentException("У игрока всегда должна быть роль!");
        }
        this.role = role;
    }
}
