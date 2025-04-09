package edu;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculator extends JFrame {
	private JTextField txtDisplay;
	private JTextArea txtHistory;
	private String phepTinh = "";
	private double s1 = 0, s2 = 0;
	private String bieuThuc = "";
	private boolean isErrorState = false;

	public Calculator() {
		// PHÁT
	}

	private void handleInput(String input) {
		// THÂN
		if (isErrorState) {
			txtDisplay.setText("");
			bieuThuc = "";
			isErrorState = false;
		}

		switch (input) {
		case "C":
			txtDisplay.setText("");
			bieuThuc = "";
			break;
		case "=":
			calculate();
			break;
		case "+":
		case "-":
		case "*":
		case "/":
		case "^":
			try {
				s1 = Double.parseDouble(txtDisplay.getText());
				phepTinh = input;
				bieuThuc = txtDisplay.getText() + " " + input + " ";
				txtDisplay.setText("");
			} catch (NumberFormatException e) {
				showError("Invalid input");
			}
			break;
		case "√":
			try {
				double val = Double.parseDouble(txtDisplay.getText());
				if (val < 0)
					throw new ArithmeticException();
				double result = Math.sqrt(val);
				txtDisplay.setText(String.valueOf(result));
				txtHistory.append("√" + val + " = " + result + "\n");
			} catch (Exception e) {
				showError("Invalid input");
			}
			break;
		default:
			txtDisplay.setText(txtDisplay.getText() + input);
		}
	}

	private void calculate() {

	}

	private void showError(String message) {
		// MINH
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Calculator::new);
	}
}