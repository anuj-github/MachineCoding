package com.design.ludo.model;

import com.design.ludo.interafce.IPlayer;

public class Player implements IPlayer {

    private long id;
    private int pos;
    private  boolean won;
    private String name;

    public Player(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public int getPosition() {
        return pos;
    }

    @Override
    public void setPosition(int pos) {
        this.pos = pos;
    }

    @Override
    public boolean hasWon() {
        return won;
    }

    @Override
    public void setWon() {
        won = true;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
