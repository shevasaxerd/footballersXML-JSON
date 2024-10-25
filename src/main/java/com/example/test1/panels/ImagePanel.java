package com.example.test1.panels;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ImagePanel extends JPanel {
    public void paintComponent(Graphics g){
        Image im = null;
        try {
            im = ImageIO.read(new File("D:/fon1.png"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);
    }
}
