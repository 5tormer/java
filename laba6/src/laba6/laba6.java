package laba6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class laba6 extends JFrame
{
    private JLabel label = new JLabel("Угадаешь число от 1 до 10?");
    private JButton guessButton = new JButton("guess");
    private JButton resetButton = new JButton("reset");
    private JTextField field = new JFormattedTextField();
    private int i=0;
    private int a = 0;
    private boolean win;
    public laba6()
    {
        super("Угадай число");
        this.setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(650,300,644,320);
        label.setBounds(200, 60, 230, 50);
        field.setBounds(200, 100, 230, 30);
        guessButton.setBounds(200, 137, 111, 40);
        resetButton.setBounds(318, 137, 111, 40);
        add(guessButton);
        add(resetButton);
        add(label);
        add(field);
        a = 1 + (int) (Math.random()*20);
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s = field.getText();
            int n = Integer.parseInt(s);
            if(!win) {
                if (i >= 3) {
                    JOptionPane.showMessageDialog(laba6.this, "Ты истратил свои три попытки. Не расстраивайся, повезет в другой раз :)");
                    JOptionPane.showMessageDialog(laba6.this, "Чтобы играть снова, нажми reset");
                    field.setText("");
                    //System.exit(0);
                } else if (n == a) {
                    JOptionPane.showMessageDialog(laba6.this, "Ого! Ты угадал! Молодец!");
                    JOptionPane.showMessageDialog(laba6.this, "Чтобы играть снова, нажми reset");
                    field.setText("");
                    win = true;
                } else {
                    if(n>a)
                        JOptionPane.showMessageDialog(laba6.this, "Неправильно! Попробуй еще раз!\nЗагаданное число меньше.");
                    else
                        JOptionPane.showMessageDialog(laba6.this, "Неправильно! Попробуй еще раз!\nЗагаданное число больше.");
                    field.setText("");
                    field.requestFocusInWindow();
                    i++;
                }
            }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i=0;
                a = 1 + (int) (Math.random()*20);
                win = false;
            }
        });
    }


    public static void main(String[] args)
    {
	    new laba6().setVisible(true);
    }
}
