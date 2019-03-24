/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PlayerController extends JFrame{
    Player player=new Player();
    Gui gui;
    JButton [][] board=new JButton[3][3];
    public PlayerController()
    {
        player.setCurrentplayer("X");
        player.setWinnerFound(false);
        gui=new Gui();
        this.makeBoard();
        gui.setGui();
    }
    
    public void changePlayer(){
        if(player.getCurrentplayer().equals("X"))
            player.setCurrentplayer("O");
        else
            player.setCurrentplayer("X");
    }
    public void winnerFound(){
        //Check if Match is Drawn
         if (board[0][0].getText()!=("") && (board[0][1].getText() == null ? ("") != null : !board[0][1].getText().equals("")) && board[0][2].getText() !=("")
             && board[1][0].getText()!=("") && board[1][1].getText()!=("") && board[1][2].getText() !=("")
             && board[2][0].getText()!=("") && board[2][1].getText()!=("") && board[2][2].getText() !=("")) {
            gui.noResult();
        }
         
         // Checking for Winner
         // All the rows
         else if (board[0][0].getText().equals(player.getCurrentplayer()) && board[0][1].getText().equals(player.getCurrentplayer()) && board[0][2].getText().equals(player.getCurrentplayer())) {
            gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
        else if (board[1][0].getText().equals(player.getCurrentplayer()) && board[1][1].getText().equals(player.getCurrentplayer()) && board[1][2].getText().equals(player.getCurrentplayer())) {
            gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
        else if (board[2][0].getText().equals(player.getCurrentplayer()) && board[2][1].getText().equals(player.getCurrentplayer()) && board[2][2].getText().equals(player.getCurrentplayer())) {
           gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
        
        // All the column
        else if (board[0][0].getText().equals(player.getCurrentplayer()) && board[1][0].getText().equals(player.getCurrentplayer()) && board[2][0].getText().equals(player.getCurrentplayer())) {
            gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
        else if (board[0][1].getText().equals(player.getCurrentplayer()) && board[1][1].getText().equals(player.getCurrentplayer()) && board[2][1].getText().equals(player.getCurrentplayer())) {
           gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
        else if (board[0][2].getText().equals(player.getCurrentplayer()) && board[1][2].getText().equals(player.getCurrentplayer()) && board[2][2].getText().equals(player.getCurrentplayer())) {
           gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
        //All the Diagonal
        else if (board[0][0].getText().equals(player.getCurrentplayer()) && board[1][1].getText().equals(player.getCurrentplayer()) && board[2][2].getText().equals(player.getCurrentplayer())) {
           gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
        else if (board[0][2].getText().equals(player.getCurrentplayer()) && board[1][1].getText().equals(player.getCurrentplayer()) && board[2][0].getText().equals(player.getCurrentplayer())) {
            gui.updaterGui(player.getCurrentplayer());
            player.setWinnerFound(true);
        }
    }
    
    void makeBoard(){
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                JButton button=new JButton();
                button.setFont(new Font(Font.MONOSPACED,Font.BOLD,120));
                button.setBackground(Color.darkGray);
                button.setForeground(Color.cyan);
                gui.setBoard(button, i, j);
                board[i][j]=button;
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(((JButton)e.getSource()).getText().equals("") && player.isWinnerFound()==false)
                        {
                            button.setText(player.getCurrentplayer());
                            winnerFound();
                            changePlayer();
                        }
                    }     
                });
                gui.setWindow(button);
            }   
        }
            JButton restart=new JButton();
            restart.setText("Restart Game");
            restart.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.restart();
                new PlayerController();
            }
            });

            JButton Information=new JButton();
            Information.setFont(new Font(Font.MONOSPACED,Font.ROMAN_BASELINE,12));
            Information.setText("Moeed Raza = X ");
            Information.setBackground(Color.white);
            
            JButton Information2=new JButton();
            Information2.setFont(new Font(Font.DIALOG,Font.ROMAN_BASELINE,12));
            Information2.setText("Ahmed Shahwaiz = O ");
            Information2.setBackground(Color.white);
            
            gui.addButtons(Information);
            gui.addButtons(restart);
            gui.addButtons(Information2);
    }
}
