package com.gmail.deamon999;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class DownloadLisner implements ActionListener {
    private FileManager fm = FileManager.getInstance();
    private JFileChooser fileChooser = new JFileChooser();
    private JLabel jLabelOne;
    private JLabel jLabelTwo;

    public DownloadLisner(JLabel jLabelOne, JLabel jLabelTwo) {
        this.jLabelOne = jLabelOne;
        this.jLabelTwo = jLabelTwo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jLabelOne.getIcon() != null && jLabelTwo.getIcon() != null && fm.isRecognized()) {
            int ret = fileChooser.showSaveDialog(null);
            if (ret == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (fm.readyToRecognizeOrUpload())
                    fm.uploadImage(file);
            }
        } else if (jLabelOne.getIcon() == null || jLabelTwo.getIcon() == null)
            JOptionPane.showMessageDialog(null, new JLabel("Load images to recognize", JLabel.CENTER));
        else JOptionPane.showMessageDialog(null, new JLabel("Recognize first", JLabel.CENTER));
    }
}

