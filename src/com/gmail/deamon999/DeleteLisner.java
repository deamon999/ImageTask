package com.gmail.deamon999;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteLisner implements ActionListener {
    private FileManager fm = FileManager.getInstance();
    private JFileChooser fileChooser = new JFileChooser();
    private JLabel jLabel;
    private int i;

    public DeleteLisner(JLabel jLabel, int i) {
        this.jLabel = jLabel;
        this.i = i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel.setText("Load image");
        jLabel.setIcon(null);
        fm.delImages(0);
    }
}

