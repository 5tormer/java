package laba5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class laba5 extends JFrame
{
    private JLabel label = new JLabel("Название картинки: ");
    private JButton button = new JButton("go!");
    private JTextField field = new JFormattedTextField();
    private JLabel imgLabel;
    Scanner in = new Scanner(System.in);

    public laba5()
    {
        super("Image printer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBounds(650,300,644,320);
        this.setResizable(false);
        setLayout(null);
        Font font = new Font("font", Font.BOLD, 17);
        Font font2 = new Font("font2", Font.PLAIN, 11);
        label.setBounds(200, 50, 230, 50);
        label.setFont(font);
        //button.setPreferredSize(new Dimension(70, 100));
        button.setFont(font);
        button.setBounds(200, 137, 230, 40);
        field.setFont(font2);
        //field.setPreferredSize(new Dimension(70, 100));
        field.setBounds(200, 100, 230, 30);
        add(button);
        add(label);
        add(field);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFrame frame2 = new JFrame("Картинка");
                frame2.setVisible(true);
                frame2.setResizable(false);
                frame2.setExtendedState(MAXIMIZED_BOTH);
                String adress = "photo\\"+field.getText();
                imgLabel = new JLabel("", new ImageIcon(getClass().getResource(adress+".jpg")), SwingConstants.CENTER);
                frame2.add(imgLabel);

            }
        });
    }
    public static void main(String[] args)
    {
        laba5 laba5 = new laba5();
    }
}
