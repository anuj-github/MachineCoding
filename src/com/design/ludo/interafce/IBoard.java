package com.design.ludo.interafce;

public interface IBoard {

    int MAX_VALUE = 100;
    void setSize(int max);
    void setSnakes(int start, int end);
    void setLadder(int start, int end);
    int containSnake(int pos);
    int containLadder(int pos);
    int getMaxValue();
}
