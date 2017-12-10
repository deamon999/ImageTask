package com.gmail.deamon999;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompareLisner implements ActionListener {
    private FileManager fm = FileManager.getInstance();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fm.readyToRecognizeOrUpload()) {
            int firstImageWidth = fm.getImage(0).getWidth();
            int secondImageWidth = fm.getImage(1).getWidth();
            int firstImageHeight = fm.getImage(0).getHeight();
            int secondImageHeight = fm.getImage(1).getHeight();
            System.out.println(firstImageWidth + " " + firstImageHeight + " " + secondImageWidth + " " + secondImageHeight);
            if (firstImageWidth == secondImageWidth && firstImageHeight == secondImageHeight)
                fm.doRecognize();
            else
                JOptionPane.showMessageDialog(null, new JLabel("Make sure what images have equal size", JLabel.CENTER));
        } else JOptionPane.showMessageDialog(null, new JLabel("Nothing to recognize", JLabel.CENTER));
    }
}

