import javax.swing.*;
import java.awt.event.*;

public class Swing_POO {
    public JTextArea Titulo;
    public JButton Suma;
    public JButton Resta;
    public JButton Multi;
    public JButton Division;
    public JButton Raiz;
    public JButton Potencia;
    public JButton Seno;
    public JButton Coseno;
    public JButton Tangente;
    public JTextField Numero1;
    public JTextField Numero2;
    public JTextPane Respuesta;
    public JPanel Calculadora;

    public Swing_POO() {
        Suma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double num2 = Double.parseDouble(Numero2.getText());
                double suma = num1 + num2;
                Respuesta.setText("Resultado: " + suma);
            }
        });

        Resta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double num2 = Double.parseDouble(Numero2.getText());
                double resta = num1 - num2;
                Respuesta.setText("Resultado: " + resta);
            }
        });

        Multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double num2 = Double.parseDouble(Numero2.getText());
                double multi = num1 * num2;
                Respuesta.setText("Resultado: " + multi);
            }
        });

        Division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double num2 = Double.parseDouble(Numero2.getText());
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir para cero.");
                } else {
                    double division = num1 / num2;
                    Respuesta.setText("Resultado: " + division);
                }
            }
        });

        Raiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                if (num1 < 0) {
                    JOptionPane.showMessageDialog(null, "No se puede calcular con un numero negativo.");
                } else {
                    double raiz = Math.sqrt(num1);
                    Respuesta.setText("Resultado: " + raiz);
                }
            }
        });

        Potencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double num2 = Double.parseDouble(Numero2.getText());
                double potencia = Math.pow(num1, num2);
                Respuesta.setText("Resultado: " + potencia);
            }
        });

        Seno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double seno = Math.sin(Math.toRadians(num1));
                Respuesta.setText("Resultado: " + seno);
            }
        });

        Coseno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double coseno = Math.cos(Math.toRadians(num1));
                Respuesta.setText("Resultado: " + coseno);
            }
        });

        Tangente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Numero1.getText());
                double tangente = Math.tan(Math.toRadians(num1));
                Respuesta.setText("Resultado: " + tangente);
            }
        });

    }
}

