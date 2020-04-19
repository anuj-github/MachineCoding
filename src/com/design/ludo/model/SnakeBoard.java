package com.design.ludo.model;

import com.design.ludo.interafce.IBoard;

import java.util.HashMap;

public class SnakeBoard implements IBoard {

    int maxValue = MAX_VALUE;
    HashMap<Integer, Integer> snakes = new HashMap<>();
    HashMap<Integer, Integer> ladders = new HashMap<>();

    @Override
    public void setSize(int max) {
        maxValue = max;
    }

    @Override
    public void setSnakes(int start, int end) {
        if(start<=end) return;
         snakes.put(start, end);
    }

    @Override
    public void setLadder(int start, int end) {
        if(start>=end) return;
        ladders.put(start, end);
    }

    @Override
    public int containSnake(int pos) {
        return snakes.getOrDefault(pos, -1);
    }

    @Override
    public int containLadder(int pos) {
        return ladders.getOrDefault(pos, -1);
    }

    @Override
    public int getMaxValue() {
        return maxValue;
    }
}
