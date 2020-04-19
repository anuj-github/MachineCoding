package com.design.ludo.model;

import com.design.ludo.interafce.IDice;

import java.util.Random;

public class SixFaceDice implements IDice {

    int maxValue = MAX_VALUE;
    Random random = new Random();

    @Override
    public void setRange(int max) {
        maxValue = max;
    }

    @Override
    public int roll() {
        return random.nextInt(maxValue) + 1;
    }
}
