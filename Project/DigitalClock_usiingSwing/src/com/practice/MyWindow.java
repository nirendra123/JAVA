package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;
    private Font font=new Font("",Font.BOLD,35);

    MyWindow(){
        //super is used for parent class to call its method
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();



        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);


    }
    public void createGUI(){
        heading=new JLabel("MY CLOCK");

        clockLabel=new JLabel("clock");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);



    }
    public void startClock() {
//        //by using timer
//        Timer time=new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               // String dateTimer = new Date().toLocaleString();
//                // String dateTimer=new Date().toString();
//                //to format a date
//                Date d=new Date();
//                SimpleDateFormat sfd=new SimpleDateFormat("hh: mm:  ss a");
//                String dateTimer=sfd.format(d);
//                clockLabel.setText((dateTimer));
//
//            }
//        });
//        time.start();
//        //by using thread

        Thread t = new Thread() {
            public void run() {
                try {
                    while (true) {
                        Date d = new Date();
                        SimpleDateFormat sfd = new SimpleDateFormat("hh: mm:  ss a");
                        String dateTimer = sfd.format(d);
                        clockLabel.setText((dateTimer));
                        // Thread.sleep(1000);
                        Thread.currentThread().sleep(1000);


                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

        };
        t.start();

    }



}
