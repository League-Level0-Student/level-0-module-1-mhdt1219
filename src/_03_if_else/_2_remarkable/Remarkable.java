package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String matthew = "Matthew can solve a Rubik's Cube in 10 seconds";
		String jerry = "Jerry is a third degree black belt in Taekwondo";
		String christopher = "Christopher has played the cello for 8 years";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		for (;;) {

			String input = JOptionPane
					.showInputDialog("Please enter a name. Enter either the name, Matthew, Jerry, or Christopher");
			// 3. In a pop-up, tell the user what is remarkable about that person.
			if (input.equals("Matthew") || input.equals("matthew")) {

				JOptionPane.showMessageDialog(null, matthew);
				break;
				
			} else if (input.equals("Jerry") || input.equals("jerry")) {

				JOptionPane.showMessageDialog(null, jerry);
				break;

			} else if (input.equals("Christopher") || input.equals("christopher")) {

				JOptionPane.showMessageDialog(null, christopher);
				break;
				
			} else {
				JOptionPane.showMessageDialog(null, "Error! Make sure you have entered the name correctly!");
			}

		}
	
	}
}
