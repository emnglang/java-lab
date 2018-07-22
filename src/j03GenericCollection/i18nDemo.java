package j03GenericCollection;

/**
 * File name: i18nDemo.java
 * Author ID: Jack, at http://bbs.whnet.edu.cn, Java discuss board.
 * Description: Shows a Dialog with a "OK" button and "File"/"Exit" menu.
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class i18nDemo {
    public static void main(String args[]) throws Exception {
        JDialog dialog = new JDialog();
        JButton btOK = new JButton();
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenuItem menuExit = new JMenuItem();
        btOK.setText("OK");
        menuFile.setText("File");
        menuExit.setText("Exit");
        dialog.setTitle("i18n Demo");
        menuBar.add(menuFile);
        menuFile.add(menuExit);
        dialog.getContentPane().setLayout(new FlowLayout());
        dialog.getContentPane().add(btOK);
        dialog.getContentPane().add(menuBar);
        dialog.setSize(200, 100);
        dialog.setModal(true);
        dialog.show();
        System.exit(0);
    }
}
