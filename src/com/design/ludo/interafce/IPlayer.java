package com.design.ludo.interafce;

public interface IPlayer {

    long getId();
    int getPosition();
    void setPosition(int pos);
    boolean hasWon();
    void setWon();
}
