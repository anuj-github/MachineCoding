package com.design.ludo.manager;

import com.design.ludo.interafce.IBoard;
import com.design.ludo.interafce.IDice;
import com.design.ludo.interafce.IPlayer;

import java.util.Queue;

public class SnakeNLadderManager {
    IBoard board;
    Queue<IPlayer> players;
    IDice dice;
    boolean  gameCompleted;

    public SnakeNLadderManager(IBoard board, Queue<IPlayer> players, IDice dice){
        this.board = board;
        this.players = players;
        this.dice = dice;
    }

    boolean isGameCompleted(){
        return gameCompleted;
    }


    public void play(){
        while(!isGameCompleted()){
            IPlayer player = players.poll();
            int val = dice.roll();
            move(player, val);
            players.add(player);
        }
    }

    private void move(IPlayer player, int newPos) {

        int oldPos = player.getPosition();
        newPos = oldPos+newPos;
        if(newPos>board.getMaxValue()) return;
        int snakePos = board.containSnake(newPos);
        int ladderPos = board.containLadder(newPos);
        while (snakePos != -1 || ladderPos != -1) {
            if (snakePos != -1) {
                System.out.println(player +" Snake bite");
                newPos = snakePos;
                ladderPos = board.containLadder(newPos);
                snakePos = -1;
            }
            if (ladderPos != -1) {
                System.out.println(player +" Ladder Up");
                newPos = ladderPos;
                snakePos = board.containSnake(newPos);
                ladderPos = -1;
            }
        }
        player.setPosition(newPos);
        System.out.println(player+" move to " + newPos);
        if(newPos==100) {
            gameCompleted = true;
            player.setWon();
            System.out.println("Player has won " + player);
        }
    }
}
