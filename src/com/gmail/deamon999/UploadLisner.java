package com.gmail.deamon999;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UploadLisner implements ActionListener {
    private FileManager fm = FileManager.getInstance();
    private JFileChooser fileChooser = new JFileChooser();
    private JLabel jLabel;
    private int i;

    public UploadLisner(JLabel jLabel, int i) {
        this.jLabel = jLabel;
        this.i = i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int ret = fileChooser.showDialog(null, "Open image");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (file != null) {
                jLabel.setText("");
                jLabel.setIcon(fm.loadImage(file));
                fm.setImages(i, fm.getImage());
            } else jLabel.setText("Invalid image");
        } else if (ret == JFileChooser.CANCEL_OPTION) jLabel.setText("");
        else jLabel.setText("Load image");
    }
}

