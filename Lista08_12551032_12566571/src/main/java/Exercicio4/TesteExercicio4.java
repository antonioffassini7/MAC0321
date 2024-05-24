package Exercicio4;

import Exercicio3.Multiconjunto;
import Exercicio3.ArrayListMulticonjunto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteExercicio4 {

    @Test
    public void testMulticonjuntoAdapter() {
        // Criando um Multiconjunto usando ArrayList
        Multiconjunto<String> arrayListMulticonjunto = new ArrayListMulticonjunto<>();
        arrayListMulticonjunto.add("apple");
        arrayListMulticonjunto.add("banana");
        arrayListMulticonjunto.add("banana");

        // Criando um adaptador para o Multiconjunto
        MulticonjuntoAdapter<String> adapter = new MulticonjuntoAdapter<>(arrayListMulticonjunto);

        // Testando o tamanho do adaptador
        assertEquals(3, adapter.size());

        // Testando se contém os elementos
        assertTrue(adapter.contains("apple"));
        assertTrue(adapter.contains("banana"));
        assertFalse(adapter.contains("orange"));

        // Testando a remoção de elementos
        assertTrue(adapter.remove("apple"));
        assertFalse(adapter.contains("apple"));

        // Testando a adição de elementos
        assertTrue(adapter.add("orange"));
        assertTrue(adapter.contains("orange"));

        // Testando a limpeza do adaptador
        adapter.clear();
        assertEquals(0, adapter.size());
        assertTrue(adapter.isEmpty());
    }
}
