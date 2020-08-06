package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {

	public static void main(String[] args) {
		
	String input = JOptionPane.showInputDialog("When is your birthday? Type it in this way: (mm/dd). For example, (05/23)");
		
	if(input.equals("8/6")) {
		
		JOptionPane.showMessageDialog(null, "Happy birthday!");
			
	}
	else {
		
		JOptionPane.showMessageDialog(null, "Have a very awesome UNbirthday!");
	}
	}
}
