


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        

        // EURO to LEK 
        JTextField euroField1 = new JTextField();
        euroField1.setBounds(30, 20, 200, 30);
        frame.add(euroField1);

        JLabel euroLabel1 = new JLabel("EURO");
        euroLabel1.setBounds(280, 20, 120, 30);
        frame.add(euroLabel1);

        JLabel outputLabel1 = new JLabel("Converted Currency From EURO To LEK Will Appear Here.");
        outputLabel1.setBounds(30, 60, 340, 30);
        frame.add(outputLabel1);

        JButton button1 = new JButton("Convert");
        button1.setBounds(50, 100, 100, 30);
        frame.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double euro = Double.parseDouble(euroField1.getText());
                    double rate = 99.70;  
                    double convertedAmount = euro * rate;
                    outputLabel1.setText(String.format("%.2f LEK", convertedAmount));
                } catch (NumberFormatException ex) {
                    outputLabel1.setText("Please enter a valid number.");
                }
            }
        });

        // LEK to EURO 
        JTextField lekField = new JTextField();
        lekField.setBounds(30, 150, 200, 30);
        frame.add(lekField);

        JLabel lekLabel = new JLabel("LEK");
        lekLabel.setBounds(280, 150, 120, 30);
        frame.add(lekLabel);

        JLabel outputLabel2 = new JLabel("Converted Currency From LEK To EURO Will Appear Here.");
        outputLabel2.setBounds(30, 190, 340, 30);
        frame.add(outputLabel2);

        JButton button2 = new JButton("Convert");
        button2.setBounds(50, 220, 100, 30);
        frame.add(button2);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    double lek = Double.parseDouble(lekField.getText());
                    double rate = 0.010;  
                    double convertedAmount = lek * rate;
                    outputLabel2.setText(String.format("%.2f EURO", convertedAmount));
                } catch (NumberFormatException ex) {
                    outputLabel2.setText("Please enter a valid number.");
                }
            }
        });

        // EURO to USD 
        JTextField euroField2 = new JTextField();
        euroField2.setBounds(30, 280, 200, 30);
        frame.add(euroField2);

        JLabel euroLabel2 = new JLabel("EURO");
        euroLabel2.setBounds(280, 280, 120, 30);
        frame.add(euroLabel2);

        JLabel outputLabel3 = new JLabel("Converted Currency From EURO To USD Will Appear Here.");
        outputLabel3.setBounds(30, 320, 340, 30);
        frame.add(outputLabel3);

        JButton button3 = new JButton("Convert");
        button3.setBounds(50, 350, 100, 30);
        frame.add(button3);

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double euro = Double.parseDouble(euroField2.getText());
                    double rate = 1.11; 
                    double convertedAmount = euro * rate;
                    outputLabel3.setText(String.format("%.2f USD", convertedAmount));
                } catch (NumberFormatException ex) {
                    outputLabel3.setText("Please enter a valid number.");
                }
            }
        });

        // USD to EURO 
        JTextField usdField = new JTextField();
        usdField.setBounds(30, 400, 200, 30);
        frame.add(usdField);

        JLabel usdLabel = new JLabel("USD");
        usdLabel.setBounds(280, 400, 120, 30);
        frame.add(usdLabel);

        JLabel outputLabel4 = new JLabel("Converted Currency From USD To EURO Will Appear Here.");
        outputLabel4.setBounds(30, 440, 340, 30);
        frame.add(outputLabel4);

        JButton button4 = new JButton("Convert");
        button4.setBounds(50, 470, 100, 30);
        frame.add(button4);

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    double usd = Double.parseDouble(usdField.getText());
                    double rate = 0.90;  
                    double convertedAmount = usd * rate;
                    outputLabel4.setText(String.format("%.2f EURO", convertedAmount));
                } catch (NumberFormatException ex) {
                    outputLabel4.setText("Please enter a valid number.");
                }
            }
        });


        // EURO to YEN
        JTextField euroField3 = new JTextField();
        euroField3.setBounds(470, 20, 200, 30);
        frame.add(euroField3);

        JLabel euroLabel3 = new JLabel("EURO");
        euroLabel3.setBounds(700, 20, 120, 30);
        frame.add(euroLabel3);

        JLabel outputLabel5 = new JLabel("Converted Currency From EURO To YEN Will Appear Here.");
        outputLabel5.setBounds(470, 60, 340, 30);
        frame.add(outputLabel5);

        JButton button5 = new JButton("Convert");
        button5.setBounds(500, 97, 100, 30);
        frame.add(button5);

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double euro = Double.parseDouble(euroField3.getText());
                    double rate = 157.50;  // Conversion rate from EURO to YEN
                    double convertedAmount = euro * rate;
                    outputLabel5.setText(String.format("%.2f YEN", convertedAmount));
                } catch (NumberFormatException ex) {
                    outputLabel5.setText("Please enter a valid number.");
                }
            }
        });

        //YEN to EURO
        JTextField yenField = new JTextField();
        yenField.setBounds(470, 150, 200, 30);
        frame.add(yenField);

        JLabel yenLabel = new JLabel("YEN");
        yenLabel.setBounds(700, 150, 120, 30);
        frame.add(yenLabel);

        JLabel outputLabel6 = new JLabel("Converted Currency From YEN To EURO Will Appear Here.");
        outputLabel6.setBounds(450, 190, 340, 30);
        frame.add(outputLabel6);

        JButton button6 = new JButton("Convert");
        button6.setBounds(500, 220, 100, 30);
        frame.add(button6);

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    double yen = Double.parseDouble(yenField.getText());
                    double rate = 0.0063;  
                    double convertedAmount = yen * rate;
                    outputLabel6.setText(String.format("%.2f EURO", convertedAmount));
                } catch (NumberFormatException ex) {
                    outputLabel6.setText("Please enter a valid number.");
                }
            }
        });


        // Clear last button
        JButton clearLastButton = new JButton("Clear Last");
        clearLastButton.setBounds(30, 550, 700, 30);
        frame.add(clearLastButton);

        clearLastButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!outputLabel6.getText().contains("Appear")) {
                    outputLabel6.setText("Converted Currency From YEN To EURO Will Appear Here.");
                } else if (!outputLabel5.getText().contains("Appear")) {
                    outputLabel5.setText("Converted Currency From EURO To YEN Will Appear Here.");
                } else if (!outputLabel4.getText().contains("Appear")) {
                    outputLabel4.setText("Converted Currency From USD To EURO Will Appear Here.");
                } else if (!outputLabel3.getText().contains("Appear")) {
                    outputLabel3.setText("Converted Currency From EURO To USD Will Appear Here.");
                } else if (!outputLabel2.getText().contains("Appear")) {
                    outputLabel2.setText("Converted Currency From LEK To EURO Will Appear Here.");
                } else if (!outputLabel1.getText().contains("Appear")) {
                    outputLabel1.setText("Converted Currency From EURO To LEK Will Appear Here.");
                }
            }
        });

        // Clear all button
        JButton clearAllButton = new JButton("Clear All");
        clearAllButton.setBounds(30, 600, 700, 30);
        frame.add(clearAllButton);

        clearAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputLabel1.setText("Converted Currency From EURO To LEK Will Appear Here.");
                outputLabel2.setText("Converted Currency From LEK To EURO Will Appear Here.");
                outputLabel3.setText("Converted Currency From EURO To USD Will Appear Here.");
                outputLabel4.setText("Converted Currency From USD To EURO Will Appear Here.");
                outputLabel5.setText("Converted Currency From EURO To YEN Will Appear Here.");
                outputLabel6.setText("Converted Currency From YEN To EURO Will Appear Here.");
            }
        });

        frame.setVisible(true);
        

        
        
    }
}
