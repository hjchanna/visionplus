/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.config;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mohan
 */
public class TicTacToe extends JPanel implements Runnable {

    private static final int[] NUMBERS = new int[]{4, 9, 2, 3, 5, 7, 8, 1, 6};
    //
    boolean computer = false;
    //
    private ArrayList<Integer> playerIds = new ArrayList<>();
    private ArrayList<Integer> computerIds = new ArrayList<>();
    private Map<Integer, JButton> buttons = new HashMap<>();

    public TicTacToe() {
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(3, 3));

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton();
            button.setName(String.valueOf(NUMBERS[i - 1]));
            buttons.put(Integer.valueOf(button.getName()), button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    newMove(Integer.valueOf(((JButton) e.getSource()).getName()));
                }
            });

            add(button);
        }
    }

    private void newMove(int id) {
        ArrayList<Integer> arrayList = computer ? computerIds : playerIds;
        arrayList.add(id);

        JButton button = buttons.get(id);
        button.setText(computer ? "O" : "X");

        Integer marks = getMarks(arrayList);
        if (marks == 15) {
            JOptionPane.showMessageDialog(this, computer ? "Computer" : "Player" + "Wins");
        }

        computer = !computer;
        if (computer) {
            //make computer move
            int playerMarks = getMarks(playerIds);
            int computerMarks = getMarks(computerIds);

            //diffence
            if (!isUsed(15 - playerMarks) && (15 - playerMarks) < 10) {
                newMove(15 - playerMarks);
            } else {
                //offence

            }
        }
    }

    private int getMarks(ArrayList<Integer> arrayList) {
        Integer total = 0;

        for (Integer integer : arrayList) {
            total += integer;
        }

        return total;
    }

    private boolean isUsed(int mark) {
        for (Integer computerId : computerIds) {
            if (computerId == mark) {
                return true;
            }
        }

        for (Integer playerId : playerIds) {
            if (playerId == mark) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void run() {
        JFrame frame = new JFrame();
        frame.setContentPane(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }

    public static void main(String[] args) {
        new TicTacToe().run();
    }
}
