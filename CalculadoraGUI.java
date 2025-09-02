import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class CalculadoraGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
	frame.setSize(600,500);
	frame.setResizable(false);
        JPanel panel = new JPanel();
	panel.setPreferredSize(new Dimension(300,400));
	panel.setLayout(new GridLayout(3,3));
        
        JTextField campoNum1 = new JTextField(10);
        JTextField campoNum2 = new JTextField(10);
        JButton botaoSomar = new JButton("Somar");
		JButton botaoSubtrair = new JButton("Subtrair");
		JButton botaoMultiplicar = new JButton("Multiplicar");
		JButton botaoDividir = new JButton("Dividir");
        JLabel labelResultado = new JLabel("Resultado: ");
        
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculadora calc = new Calculadora();
                    int resultado = calc.somar(num1, num2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Entrada inválida!");
                }
            }
        });
		
        botaoSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculadora calc = new Calculadora();
                    int resultado = calc.subtrair(num1, num2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Entrada inválida!");
                }
            }
        });
		
        botaoMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculadora calc = new Calculadora();
                    int resultado = calc.multiplicar(num1, num2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Entrada inválida!");
                }
            }
        });
		
        botaoDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculadora calc = new Calculadora();
                    int resultado = calc.dividir(num1, num2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Entrada inválida!");
                } catch (ArithmeticException exc) {
					labelResultado.setText("Entrada 2 inválida!");
				}
            }
        });
        
        panel.add(campoNum1);
        panel.add(new JLabel("op"));
        panel.add(campoNum2);
        panel.add(botaoSomar);
		panel.add(botaoSubtrair);
		panel.add(botaoMultiplicar);
		panel.add(botaoDividir);
        panel.add(labelResultado);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}