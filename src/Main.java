import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Primer intento");
        JFrame frame = new JFrame("Esta es nuestra Calculadora");
        frame.setContentPane(new Swing_POO().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.pack();
        frame.setVisible(true);
// WALTER COBACANGO, RICHARD PADILLA, KEVIN MENDOZA...

    }
}
