package com.design.ludo.interafce;

public interface IDice {

    int MAX_VALUE = 6;
    void setRange(int max);
    int roll();
}
