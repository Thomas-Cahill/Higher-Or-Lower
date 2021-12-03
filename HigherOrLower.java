import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.util.Scanner;
import java.util.Random;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.*;
import javax.swing.JLabel;


public class Game implements ActionListener{
        JFrame frame;
        JTextField bet;
        JButton Higher = new JButton();
        JButton Higher1 = new JButton();
        JButton Higher2 = new JButton();
        JButton Higher3 = new JButton();
        
        JButton Lower = new JButton();
        JButton Lower1 = new JButton();
        JButton Lower2 = new JButton();
        JButton Lower3 = new JButton();
        
        JButton Enter = new JButton();
        JButton CashOut = new JButton();
        JButton PlayAgain = new JButton();
        JPanel panel;
        JPanel panelbet;
        JPanel cardOne;
        JPanel cardTwo;
        JPanel cardThree;
        JPanel cardFour;
        JPanel cardFive;
        JLabel banking;
        JLabel money;
        JLabel Rules;
        JLabel a;
        JLabel b;
        JLabel c;
        JLabel d;
        JLabel f;
        
        Font x = new Font("Times New Roman", Font.BOLD,60);
        Font y = new Font("Times New Roman", Font.BOLD,30);
        
        double balance = 20;
        int min = 1;
        int max = 13;
        int guess = 0;
        double bank = 0;
        double amount =0;
         
        int one = Draw(min,max);
        int two = Draw(min,max);
        int three = Draw(min,max);
        int four = Draw(min,max);
        int five = Draw(min,max);
        
        
        
    Game() {
        
        frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,900);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        
        //Styling Of TextField
        bet = new JTextField();
        bet.setBounds(1250,750,200,50);
        bet.setFont(y);
        
        //Styling Of Buttons
        Higher = new JButton("Higher");
        Higher.setBounds(100,600,350,200);
        Higher.setFont(x);
        Higher.setVisible(false);
        
        Higher1 = new JButton("Higher");
        Higher1.setBounds(100,600,350,200);
        Higher1.setFont(x);
        Higher1.setVisible(false);
        
        Higher2 = new JButton("Higher");
        Higher2.setBounds(100,600,350,200);
        Higher2.setFont(x);
        Higher2.setVisible(false);
        
        Higher3 = new JButton("Higher");
        Higher3.setBounds(100,600,350,200);
        Higher3.setFont(x);
        Higher3.setVisible(false);
        
        
        
        Lower = new JButton("Lower");
        Lower.setBounds(500,600,350,200);
        Lower.setFont(x);
        Lower.setVisible(false);
        
        Lower1 = new JButton("Lower");
        Lower1.setBounds(500,600,350,200);
        Lower1.setFont(x);
        Lower1.setVisible(false);
        
        Lower2 = new JButton("Lower");
        Lower2.setBounds(500,600,350,200);
        Lower2.setFont(x);
        Lower2.setVisible(false);
        
        Lower3 = new JButton("Lower");
        Lower3.setBounds(500,600,350,200);
        Lower3.setFont(x);
        Lower3.setVisible(false);
        
        
        Enter = new JButton("Enter Bet");
        Enter.setBounds(1050,750,200,50);
        Enter.setFont(y);
        CashOut = new JButton("Cash Out");
        CashOut.setBounds(1050,750,200,50);
        CashOut.setFont(y);
        CashOut.setVisible(false);
        
        Higher1.addActionListener(this);
        Higher2.addActionListener(this);
        Higher3.addActionListener(this);
        
        Higher.addActionListener(this);
        Lower1.addActionListener(this);
        Lower2.addActionListener(this);
        Lower3.addActionListener(this);
        
        Lower.addActionListener(this);
        Enter.addActionListener(this);
        CashOut.addActionListener(this);
        
        panel = new JPanel();
        panel.setBounds(0,500,1500,500);
        panel.setBackground(Color.RED);
        
        panelbet = new JPanel();
        panelbet.setBounds(1000,675,500,200);
        panelbet.setBackground(Color.GRAY);
       
        //card styling
        cardOne = new JPanel();
        cardOne.setBounds(25,50,250,350);
        cardOne.setBackground(Color.WHITE);
        a = new JLabel(""+one);
        a.setFont(x);
        cardOne.add(a);
        a.setVisible(false);
        
        cardTwo = new JPanel();
        cardTwo.setBounds(325,50,250,350);
        cardTwo.setBackground(Color.WHITE);
        b = new JLabel(""+two);
        b.setFont(x);
        cardTwo.add(b);
        b.setVisible(false);
        
        cardThree = new JPanel();
        cardThree.setBounds(625,50,250,350);
        cardThree.setBackground(Color.WHITE);
        c = new JLabel(""+three);
        c.setFont(x);
        cardThree.add(c);
        c.setVisible(false);
        
        cardFour = new JPanel();
        cardFour.setBounds(925,50,250,350);
        cardFour.setBackground(Color.WHITE);
        d = new JLabel(""+four);
        d.setFont(x);
        cardFour.add(d);
        d.setVisible(false);
        
        cardFive = new JPanel();
        cardFive.setBounds(1225,50,250,350);
        cardFive.setBackground(Color.WHITE);
        f = new JLabel(""+five);
        f.setFont(x);
        cardFive.add(f);
        f.setVisible(false);
        
        //Pot and Balance
        banking = new JLabel("Bank amount: €" + bank);
        banking.setFont(y);
        banking.setAlignmentX(1250);
        banking.setAlignmentY(650);
        banking.setVisible(true);
        panelbet.add(banking);
        
        money = new JLabel("Balance: €" + balance);
        money.setFont(y);
        money.setAlignmentX(1250);
        money.setAlignmentY(750);
        money.setVisible(true);
        panelbet.add(money);
        
        Rules = new JLabel("1.5x Payout   Same Number In A Row = Loss");
        Rules.setFont(y);
        Rules.setAlignmentX(750);
        Rules.setAlignmentY(550);
        Rules.setVisible(true);
        panel.add(Rules);
        
        
        
        frame.add(cardFive);
        frame.add(cardFour);
        frame.add(cardThree);
        frame.add(cardTwo);
        frame.add(cardOne);
        frame.add(CashOut);
        
        frame.add(Higher);
        frame.add(Higher1);
        frame.add(Higher2);
        frame.add(Higher3);
       
        frame.add(Lower);
        frame.add(Lower1);
        frame.add(Lower2);
        frame.add(Lower3);
        
        frame.add(Enter);
        frame.add(bet);
        frame.add(panelbet);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        
        Game HorL = new Game();
    
        
    }
    //Random Number Generator
    public static int Draw (int min, int max){
        int x = (int)(Math.random()*(max-min+1)+min); 
        return x;
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== Enter){
            String s1 = bet.getText();
            bank = Double.parseDouble(s1);
            if(bank>balance){
                bank = 0;
                balance = balance;
            }
            balance = balance - bank;
            
            money.setText("Balance: €" + balance);
            banking.setVisible(true);
            Enter.setVisible(false);
            bet.setVisible(false);
            CashOut.setVisible(false);
            a.setVisible(true);
            Higher.setVisible(true);
            Lower.setVisible(true);    
            a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        f.setVisible(false);
            one = Draw(min,max);
        two = Draw(min,max);
        three = Draw(min,max);
        four = Draw(min,max);
        five = Draw(min,max);
        a.setText(""+one);
        b.setText(""+two);
        c.setText(""+three);
        d.setText(""+four);
        f.setText(""+five);
        }
        
        {
        if(e.getSource()== Higher){
                if(one<two){
                    b.setVisible(true);
                    CashOut.setVisible(true);
                    Higher.setVisible(false);
                    Lower.setVisible(false);
                    Higher1.setVisible(true);
                    Lower1.setVisible(true);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                }
                else 
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     Higher.setVisible(false);
                     Lower.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                     
                     
                     
                     
                     
                }
            }
            
        }
        if(e.getSource()== Lower){
             if(one>two){
                    b.setVisible(true);
                    CashOut.setVisible(true);
                    Higher.setVisible(false);
                    Lower.setVisible(false);
                    Higher1.setVisible(true);
                    Lower1.setVisible(true);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                    
                }
                else
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     Higher.setVisible(false);
                     Lower.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                   
                     
                     
                     
                }
        }
        if(e.getSource()== Higher1){
                if(two<three){
                    c.setVisible(true);
                    CashOut.setVisible(true);
                    Higher1.setVisible(false);
                    Lower1.setVisible(false);
                    Higher2.setVisible(true);
                    Lower2.setVisible(true);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                }
                else 
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     c.setVisible(true);
                     Higher1.setVisible(false);
                     Lower1.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                     
                     
                     
                     
                }
            }
         if(e.getSource()== Lower1){
             if(two>three){
                    c.setVisible(true);
                    CashOut.setVisible(true);
                    Higher1.setVisible(false);
                    Lower1.setVisible(false);
                    Higher2.setVisible(true);
                    Lower2.setVisible(true);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                    
                }
                else
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     c.setVisible(true);
                     Higher1.setVisible(false);
                     Lower1.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                     
                     
                     
                     
                }
    }
    if(e.getSource()== Higher2){
                if(three<four){
                    d.setVisible(true);
                    CashOut.setVisible(true);
                    Higher2.setVisible(false);
                    Lower2.setVisible(false);
                    Higher3.setVisible(true);
                    Lower3.setVisible(true);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                }
                else 
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     c.setVisible(true);
                     d.setVisible(true);
                     Higher2.setVisible(false);
                     Lower2.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                     
                     
                     
                     
                }
            }
         if(e.getSource()== Lower2){
             if(three>four){
                    d.setVisible(true);
                    CashOut.setVisible(true);
                    Higher2.setVisible(false);
                    Lower2.setVisible(false);
                    Higher3.setVisible(true);
                    Lower3.setVisible(true);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                    
                }
                else
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     c.setVisible(true);
                     d.setVisible(true);
                     Higher2.setVisible(false);
                     Lower2.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                     
                     
                     
                     
                }
    }
        if(e.getSource()== Higher3){
                if(four<five){
                    f.setVisible(true);
                    CashOut.setVisible(true);
                    Higher3.setVisible(false);
                    Lower3.setVisible(false);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                }
                else 
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     c.setVisible(true);
                     d.setVisible(true);
                     f.setVisible(true);
                     Higher3.setVisible(false);
                     Lower3.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                     
                     
                     
                     
                     
                }
            }
         if(e.getSource()== Lower3){
             if(four>five){
                    f.setVisible(true);
                    CashOut.setVisible(true);
                    Higher3.setVisible(false);
                    Lower3.setVisible(false);
                    bank = bank * 1.5;
                    banking.setText("Bank amount: €" + bank);
                    
                }
                else
                {
                     one = Draw(min,max);
                     two = Draw(min,max);
                     three = Draw(min,max);
                     four = Draw(min,max);
                     five = Draw(min,max);
                     a.setVisible(true);
                     b.setVisible(true);
                     c.setVisible(true);
                     d.setVisible(true);
                     f.setVisible(true);
                     Higher3.setVisible(false);
                     Lower3.setVisible(false);
                     Enter.setVisible(true);
                     bet.setVisible(true);
                     CashOut.setVisible(false);
                     bank = 0;
                     banking.setText("Bank amount: €" + bank);
                     
                     
                     
                     
                }
    }
    if(e.getSource()== CashOut){
        balance = balance + bank;
        bank = 0;
        a.setVisible(true);
        b.setVisible(true);
        c.setVisible(true);
        d.setVisible(true);
        f.setVisible(true);
        banking.setText("Bank amount: €" + bank);
        money.setText("Balance: €" + balance);
        Enter.setVisible(true);
        bet.setVisible(true);
        Higher3.setVisible(false);
        Lower3.setVisible(false);
        Higher2.setVisible(false);
        Lower2.setVisible(false);
        Higher1.setVisible(false);
        Lower1.setVisible(false);
        Higher.setVisible(false);
        Lower.setVisible(false);
        CashOut.setVisible(false);
        
        
        
    }
}
}
   

