/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class Player {
    private String currentplayer;
    private boolean winnerFound;
    
    public Player()
    {   
    }

    public String getCurrentplayer() {
        return currentplayer;
    }

    public boolean isWinnerFound() {
        return winnerFound;
    }

    public void setCurrentplayer(String currentplayer) {
        this.currentplayer = currentplayer;
    }

    public void setWinnerFound(boolean winnerFound) {
        this.winnerFound = winnerFound;
    }
}
