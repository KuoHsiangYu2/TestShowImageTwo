package com.sample;

import static com.util.Output.println;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author 郭翔宇
 */
public class Form2 {

    public void display() {
        JFrame form2 = new JFrame("顯示圖片");

        /* Settings can adjust the window size. */
        form2.setResizable(true);

        println("載入圖片 ... ");
        URL imageLocation = this.getClass().getResource("./SetonAcademy_JoinThePack_1.jpg");
        println("imageLocation = " + imageLocation);
        if (imageLocation == null) {
            println("載入圖片失敗");
            System.exit(0);
        }
        ImageIcon imageIcon = new ImageIcon(imageLocation);
        println("載入圖片成功");

        JLabel jLabel = new JLabel(imageIcon);
        form2.add(jLabel);

        form2.pack();
        form2.setLocationRelativeTo(null);
        form2.setVisible(true);
        form2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

}
