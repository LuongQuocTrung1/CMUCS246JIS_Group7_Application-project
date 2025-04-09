package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Calculator extends JFrame {
	private JTextField txtDisplay;
    private JTextArea txtHistory;
    private String phepTinh = "";
    private double s1 = 0, s2 = 0;
    private String bieuThuc = "";
    private boolean isErrorState = false;

    public Calculator() {
        setTitle("Máy tính tùy chỉnh");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        txtDisplay = new JTextField();
        txtDisplay.setEditable(false);
        txtDisplay.setFont(new Font("Arial", Font.BOLD, 24));
        add(txtDisplay, BorderLayout.NORTH);

        txtHistory = new JTextArea();
        txtHistory.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtHistory);
        scrollPane.setPreferredSize(new Dimension(400, 100));
        add(scrollPane, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] buttons = {"7", "8", "9", "➗", "4", "5", "6", "✖️", "1", "2", "3", "➖", "0", ".", "=", "➕", "√", "^", "%", "C"};

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            buttonPanel.add(btn);

            btn.addActionListener(e -> handleInput(btn.getText()));
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    
}
