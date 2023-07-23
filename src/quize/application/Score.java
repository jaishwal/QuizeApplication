package quize.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    JLabel heading,lblscore;
    JButton submit,exit;


    Score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        heading = new JLabel("Thankyou "+ name +" for playing Simple Minds..");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(heading);

        lblscore = new JLabel("Your Score is "+ score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(lblscore);

        submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setFont(new Font("Tahoma", Font.PLAIN,18));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        exit = new JButton("Exit");
        exit.setBounds(520,270,120,30);
        exit.setFont(new Font("Tahoma", Font.PLAIN,18));
        exit.setBackground(new Color(30,144,255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Score("user",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            setVisible(false);
            new Login();
        }else{
            setVisible(false);
        }

    }
}
