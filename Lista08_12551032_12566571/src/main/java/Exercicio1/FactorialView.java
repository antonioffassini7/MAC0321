package Exercicio1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialView extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField numField;
    public JButton calcButton;
    private JLabel result;

    public FactorialView() {
        // Configurações da janela
        setTitle("Calculadora de Fatorial");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Campo para entrada do número
        JLabel numLabel = new JLabel("Número:");
        numLabel.setBounds(50, 30, 100, 25);
        add(numLabel);

        numField = new JTextField();
        numField.setBounds(150, 30, 100, 25);
        add(numField);

        // Botão para calcular o fatorial
        calcButton = new JButton("Calcular");
        calcButton.setBounds(150, 70, 100, 25);
        add(calcButton);

        // Label para mostrar o resultado
        result = new JLabel("Resultado: ");
        result.setBounds(50, 110, 300, 25);
        add(result);

        // Adiciona ação ao botão
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFatorial();
            }
        });

        // Torna a janela visível
        setVisible(true);
    }

    private void calculateFatorial() {
        try {
            int num = Integer.parseInt(numField.getText());
            long res = FatorialController.calcFatorial(num);
            result.setText("Resultado: " + res);
        } catch (NumberFormatException e) {
            result.setText("Por favor, insira um número válido.");
        } catch (IllegalArgumentException e) {
            result.setText(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new FactorialView();
    }

	public JLabel getResult() {
		// TODO Auto-generated method stub
		return result;
	}
}
