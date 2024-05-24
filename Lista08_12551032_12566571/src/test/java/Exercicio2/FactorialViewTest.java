package Exercicio2;

import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Exercicio1.FactorialView;

public class FactorialViewTest {

    @Test
    public void testValorValido() throws AWTException, InterruptedException {
        // Abre a calculadora
        FactorialView calculadora = new FactorialView();
        JTextField numField = calculadora.numField;
        JButton calcButton = calculadora.calcButton;
        JLabel result = calculadora.getResult();

        // Define o número a ser inserido
        String entrada = "5";
        // Insere o número no campo de texto
        numField.setText(entrada);

        // Clica no botão calcular
        calcButton.doClick();

        // Espera um pouco para o resultado aparecer
        Thread.sleep(1000);

        // Verifica se o resultado exibido é o esperado
        assertEquals("Resultado: 120", result.getText());
    }

    @Test
    public void testValorNegativo() throws AWTException, InterruptedException {
        // Abre a calculadora
    	FactorialView calculadora = new FactorialView();
        JTextField numField = calculadora.numField;
        JButton calcButton = calculadora.calcButton;
        JLabel result = calculadora.getResult();

        // Define o número a ser inserido
        String entrada = "-5";
        // Insere o número no campo de texto
        numField.setText(entrada);

        // Clica no botão calcular
        calcButton.doClick();

        // Espera um pouco para o resultado aparecer
        Thread.sleep(1000);

        // Verifica se o resultado exibido é o esperado
        assertEquals("O número precisa ser não negativo.", result.getText());
    }

    @Test
    public void testNaoNumero() throws AWTException, InterruptedException {
        // Abre a calculadora
    	FactorialView calculadora = new FactorialView();
        JTextField numField = calculadora.numField;
        JButton calcButton = calculadora.calcButton;
        JLabel result = calculadora.getResult();

        // Define o número a ser inserido
        String entrada = "a";
        // Insere o número no campo de texto
        numField.setText(entrada);

        // Clica no botão calcular
        calcButton.doClick();

        // Espera um pouco para o resultado aparecer
        Thread.sleep(1000);

        // Verifica se o resultado exibido é o esperado
        assertEquals("Por favor, insira um número válido.", result.getText());
    }
}
