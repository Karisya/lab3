package bsu.rfe.java.group8.lab3.Romanova.varA16;
import javax.swing.*;
import java.util.Arrays;

public class MainFrame {
    public static void main(String[] args) {
        Double[] a = {1., 5., -3.};

        HornersScheme frame = new HornersScheme(a);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
