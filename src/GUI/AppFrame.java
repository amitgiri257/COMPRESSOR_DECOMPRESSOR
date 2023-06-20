package GUI;

import comp_decomp.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.http.HttpRequest;
import javax.swing.*;
import javax.swing.JFileChooser;


public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;
    JFrame window;

    AppFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window = new JFrame("PROJECT_A C");
        window.setLayout(null);
        window.setSize(600, 400);
        window.setLocation(600, 400);

        compressButton = new JButton("Click to Compress a File");
        decompressButton = new JButton("Click to Decompress a File");

        compressButton.addActionListener(this);
        // this.getContentPanel().setBackGround();
        decompressButton.addActionListener(this);

        compressButton.setSize(200, 50);
        compressButton.setLocation(50, 120);
        decompressButton.setLocation(340, 120);
        decompressButton.setSize(200, 50);

        window.add(compressButton);
        window.add(decompressButton);
        window.getContentPane().setBackground(Color.red);
        window.setVisible(true);
         /*  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window = new JFrame("PROJECT_A C");
       window.setLayout(null);
       window.setSize(600, 400);
       window.setLocation(600, 400);
       */


        //window = new JFrame("PROJECT_A C");
      /*  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        compressButton = new JButton("Select file to Compress");
        //compressButton.setBounds(500, 200, 200, 30);
        compressButton.setSize(300,200);
        compressButton.setLocation(50,120);
        compressButton.addActionListener(this);

        decompressButton = new JButton("Select file to Decompress");
        //decompressButton.setBounds(250, 100, 200, 30);
        decompressButton.setSize(600,200);
       // decompressButton.setLocation(500,120);
        decompressButton.addActionListener(this);
        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000, 500);
        this.getContentPane().setBackground(Color.green);
        this.setVisible(true);
       // window.getContentPane().setBackground(Color.red);
    }
*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == compressButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    compressor.method(file);
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        if (e.getSource() == decompressButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    decompressor.method(file);
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());

                }
            }
        }
    }
}