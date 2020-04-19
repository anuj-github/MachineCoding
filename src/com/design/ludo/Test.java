package com.design.ludo;

import com.design.ludo.interafce.IBoard;
import com.design.ludo.interafce.IDice;
import com.design.ludo.interafce.IPlayer;
import com.design.ludo.manager.SnakeNLadderManager;
import com.design.ludo.model.Player;
import com.design.ludo.model.SixFaceDice;
import com.design.ludo.model.SnakeBoard;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String args[]){

        IBoard board = new SnakeBoard();
        setSnaked(board);
        setLadder(board);
        Queue<IPlayer> players = new LinkedList<>();
        players.add(new Player(123, "Anuj"));
        players.add(new Player(213, "Ramjan"));
        players.add(new Player(1234, "Viswa"));
        players.add(new Player(2134, "Lucky"));
        IDice dice = new SixFaceDice();

        SnakeNLadderManager snm = new SnakeNLadderManager(board, players, dice);
        snm.play();
    }

    private static void setSnaked(IBoard board) {
        board.setSnakes(50, 21);
        board.setSnakes(62, 2);
        board.setSnakes(81, 9);
        board.setSnakes(93, 32);
        board.setSnakes(96, 28);
        board.setSnakes(43, 10);


    }
    private static void setLadder(IBoard board) {
        board.setLadder(8, 42);
        board.setLadder(21, 63);
        board.setLadder(38, 78);
        board.setLadder(13, 53);
        board.setLadder(41, 82);
    }
}
