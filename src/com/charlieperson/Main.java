package com.charlieperson;

import javax.swing.*;

public class Main {
	private static JButton button;

    public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    button = new JButton("AYYY!!!! It's my first Java Button!!!");

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    frame.getContentPane().add(button);

	    frame.setSize(300, 300);
	    frame.setVisible(true);
    }
}
