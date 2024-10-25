package com.example.test1.frames;

import com.example.test1.models.FootballPlayer;
import com.example.test1.panels.ImagePanel;
import com.example.test1.panels.ImagePanel2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballPlayerApp extends JFrame{
    private JPanel panel;
    private JFrame frame;
    private JTextField numberField, positionField, salaryField, ageField, firstNameField, lastNameField;
    private FootballPlayer player;
    private JButton nextFootballerButton, previousFootballerButton, addFootballerButton2, deleteFootballerButton2, closeFileButton2;
    private Container cont, cont2;
    private JTabbedPane tabPanel;
    private JPanel page1, page2, buttonsPanel;
    private JLabel nullLabel;

    public FootballPlayerApp() {
        JFrame window = new JFrame("Footballers");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(new Dimension(510, 365));
        window.setResizable(true);



        setContentPane(new ImagePanel());
        cont = getContentPane();
        setContentPane(new ImagePanel2());
        cont2 = getContentPane();
        numberField = new JTextField(13);
        positionField = new JTextField(13);
        salaryField = new JTextField(13);
        ageField = new JTextField(13);
        firstNameField = new JTextField(13);
        lastNameField = new JTextField(13);
        panel = new JPanel();
        tabPanel = new JTabbedPane();
        tabPanel.setSize(10, 10);




        page1 = new JPanel(new GridLayout(1,2, 5, 0));
        page2 = new JPanel(new GridLayout(1,2, 5, 0));
        page2.add(cont2);
        page1.add(cont);
        tabPanel.addTab("Tab 1", page1);
        tabPanel.addTab("Tab 2", page2);
        cont.setLayout(new GridBagLayout());
        cont2.setLayout(new GridBagLayout());
        firstTabFields();
        secondTabFields();

        buttonsPanel = new JPanel(new GridBagLayout()){{setBackground(new Color(24, 56, 72));}};
        allButtons1();
        window.add(buttonsPanel, BorderLayout.SOUTH);



        nextFootballerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //openFile();
            }
        });

        previousFootballerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


        window.add(tabPanel);
        window.setVisible(true);

    }


    void allButtons1(){
        nextFootballerButton = new JButton("Next footballer");
        nextFootballerButton.setPreferredSize(new Dimension(160, 40));
        nullLabel = new JLabel(""){{setBackground(new Color(24, 56, 72));}};
        nullLabel.setPreferredSize(new Dimension(140, 20));
        previousFootballerButton = new JButton("Previous footballer");
        previousFootballerButton.setPreferredSize(new Dimension(160, 40));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        buttonsPanel.add(nextFootballerButton, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        buttonsPanel.add(nullLabel, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        buttonsPanel.add(previousFootballerButton, gridBagConstraints);


    }
    void firstTabFields(){
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.EAST;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        JLabel firstNameText = new JLabel("Name:");
        firstNameText.setForeground(Color.white);
        cont.add(firstNameText, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        cont.add(firstNameField, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        JLabel lastNameText = new JLabel("Surname:");
        lastNameText.setForeground(Color.white);
        cont.add(lastNameText, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        cont.add(lastNameField, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        JLabel ageText = new JLabel("Age:");
        ageText.setForeground(Color.white);
        cont.add(ageText, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        cont.add(ageField, gridBagConstraints);
    }
    void secondTabFields(){
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.EAST;



        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        JLabel salaryText = new JLabel("Salary");
        salaryText.setForeground(Color.white);
        cont2.add(salaryText, gridBagConstraints);


        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        cont2.add(salaryField, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        JLabel positionText = new JLabel("Position:");
        positionText.setForeground(Color.white);
        cont2.add(positionText,gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        cont2.add(positionField, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        JLabel numberText = new JLabel("Number:");
        numberText.setForeground(Color.white);
        cont2.add(numberText, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        cont2.add(numberField, gridBagConstraints);
    }

}