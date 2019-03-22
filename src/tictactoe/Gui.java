/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Gui{
    JFrame window = new JFrame("Tic Tac Toe");
    JButton [][] boardnew =new JButton[3][3];
    public Gui(){
        super();    
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(4,3));
    }
    void updaterGui(String player)
    {
        if(player.equals("X"))
             JOptionPane.showMessageDialog(null,"Player 1"+" won");
        else
            JOptionPane.showMessageDialog(null,"Player 2"+" won");
    }

    public void setWindow(JButton button) {
        this.window.add(button);
    }

    public void setBoard(JButton button,int i,int j) {
        this.boardnew[i][j] = button;
    }
    void setGui(){
        this.window.setVisible(true);
    } 
    void addButtons(JButton button)
    {
            this.window.add(button);
    }
    void restart()
    {
        this.window.dispose();
    }
    void noResult()
    {
        JOptionPane.showMessageDialog(null,"Match Drawn :(");
    }
}
