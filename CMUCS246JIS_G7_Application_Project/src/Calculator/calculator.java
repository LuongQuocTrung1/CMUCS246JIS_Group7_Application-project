package Calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class calculator extends JFrame {
	 private JTextField txtDisplay;
	    private JTextArea txtHistory;
	    private String phepTinh = "";
	    private double s1 = 0, s2 = 0;
	    private String bieuThuc = "";
	    private boolean isErrorState = false;

	    public calculator() {
	    	//PHÁT
	    }

	    private void handleInput(String input) {
	    	//THÂN
	    }

	    private void calculate() {
	    	//MINH
	    }

	    private void showError(String message) {
	    	//MINH
	    }   

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(calculator::new);
	    }
}
