package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer= new JTextField(20);
	JButton button = new JButton();
	
	public static void main(String[] args) {
	
		Binary_Converter bc = new Binary_Converter();
		bc.createUI();
		
	}

public void createUI(){
	frame.isVisible();
	
	panel.isVisible();
	answer.isVisible();

	button.isVisible();
	button.addMouseListener(this);
	
}

String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
}

