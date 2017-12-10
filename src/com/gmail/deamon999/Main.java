package com.gmail.deamon999;


import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JButton compare = new JButton("Compare");
        JButton upload = new JButton("Upload");
        JButton chooseFirst = new JButton("Choose first");
        JButton deleteOne = new JButton("delete first");
        JButton chooseSecond = new JButton("Choose second");
        JButton deleteSecond = new JButton("delete second");
        JLabel labelFirstImage = new JLabel("Load image", SwingConstants.CENTER);
        JLabel labelSecondImage = new JLabel("Load image", SwingConstants.CENTER);

        chooseFirst.addActionListener(new UploadLisner(labelFirstImage, 0));
        chooseSecond.addActionListener(new UploadLisner(labelSecondImage, 1));
        deleteOne.addActionListener(new DeleteLisner(labelFirstImage, 0));
        deleteSecond.addActionListener((new DeleteLisner(labelSecondImage, 1)));
        compare.addActionListener(new CompareLisner());
        upload.addActionListener(new DownloadLisner(labelFirstImage, labelSecondImage));

        JPanel imageButton = new JPanel();
        imageButton.setLayout(new FlowLayout());
        imageButton.setBorder(new EtchedBorder());
        JPanel imageArea = new JPanel();
        imageArea.setBorder(new EtchedBorder());
        JPanel imageButtonOne = new JPanel();
        imageButtonOne.setLayout(new FlowLayout());
        imageButtonOne.setBorder(new EtchedBorder());
        JPanel imageAreaOne = new JPanel();
        imageAreaOne.setBorder(new EtchedBorder());


        JPanel imageContainer = new JPanel();
        imageContainer.setLayout(new BorderLayout());
        imageContainer.setBorder(new EtchedBorder());
        JPanel imageContainerTwo = new JPanel();
        imageContainerTwo.setLayout(new BorderLayout());
        imageContainerTwo.setBorder(new EtchedBorder());

        JPanel options = new JPanel();
        options.setBorder(new EtchedBorder());
        options.setLayout(new FlowLayout());
        JPanel workArea = new JPanel();
        workArea.setBorder(new EtchedBorder());
        workArea.setLayout(new GridLayout(1, 2));


        JFrame frame = new JFrame("Comparing images");
        frame.setMinimumSize(new Dimension(1200, 800));
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().add(workArea, BorderLayout.CENTER);
        frame.getContentPane().add(options, BorderLayout.NORTH);

        workArea.add(imageContainer);
        workArea.add(imageContainerTwo);

        imageContainer.add(imageButton, BorderLayout.NORTH);
        imageContainer.add(imageArea, BorderLayout.CENTER);
        imageContainerTwo.add(imageButtonOne, BorderLayout.NORTH);
        imageContainerTwo.add(imageAreaOne, BorderLayout.CENTER);

        options.add(compare);
        options.add(upload);
        imageButton.add(chooseFirst);
        imageButton.add(deleteOne);
        imageButtonOne.add(chooseSecond);
        imageButtonOne.add(deleteSecond);
        imageArea.add(labelFirstImage, BorderLayout.CENTER);
        imageAreaOne.add(labelSecondImage, BorderLayout.CENTER);


    }
}
