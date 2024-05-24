package Exercicio3;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteExercicio3 {

    @Test
    public void testArrayListMulticonjunto() {
        Multiconjunto<Integer> arrayListMulti1 = new ArrayListMulticonjunto<>();
        arrayListMulti1.add(5);
        arrayListMulti1.add(5);
        arrayListMulti1.add(10);
        
        Multiconjunto<Integer> arrayListMulti2 = new ArrayListMulticonjunto<>();
        arrayListMulti2.add(10);
        arrayListMulti2.add(20);
        arrayListMulti2.add(30);

        assertFalse(arrayListMulti1.equals(arrayListMulti2));

        arrayListMulti1.addAll(arrayListMulti2);
        assertTrue(arrayListMulti1.equals(new ArrayListMulticonjunto<Integer>() {{
            add(5);
            add(5);
            add(10);
            add(10);
            add(20);
            add(30);
        }}));
    }

    @Test
    public void testSetMulticonjunto() {
        Multiconjunto<String> setMulti1 = new SetMulticonjunto<>();
        setMulti1.add("apple");
        setMulti1.add("apple");
        setMulti1.add("banana");
        
        Multiconjunto<String> setMulti2 = new SetMulticonjunto<>();
        setMulti2.add("banana");
        setMulti2.add("orange");
        setMulti2.add("grape");

        assertFalse(setMulti1.equals(setMulti2));

        setMulti1.addAll(setMulti2);
        assertTrue(setMulti1.equals(new SetMulticonjunto<String>() {{
            add("apple");
            add("apple");
            add("banana");
            add("orange");
            add("grape");
        }}));
    }

    @Test
    public void testLinkedListMulticonjunto() {
        Multiconjunto<Double> linkedListMulti1 = new LinkedListMulticonjunto<>();
        linkedListMulti1.add(2.5);
        linkedListMulti1.add(2.5);
        linkedListMulti1.add(3.0);
        
        Multiconjunto<Double> linkedListMulti2 = new LinkedListMulticonjunto<>();
        linkedListMulti2.add(3.0);
        linkedListMulti2.add(4.5);
        linkedListMulti2.add(5.0);

        assertFalse(linkedListMulti1.equals(linkedListMulti2));

        linkedListMulti1.addAll(linkedListMulti2);
        assertTrue(linkedListMulti1.equals(new LinkedListMulticonjunto<Double>() {{
            add(2.5);
            add(2.5);
            add(3.0);
            add(3.0);
            add(4.5);
            add(5.0);
        }}));
    }

    @Test
    public void testStackMulticonjunto() {
        Multiconjunto<Character> stackMulti1 = new StackMulticonjunto<>();
        stackMulti1.add('X');
        stackMulti1.add('X');
        stackMulti1.add('Y');
        
        Multiconjunto<Character> stackMulti2 = new StackMulticonjunto<>();
        stackMulti2.add('Y');
        stackMulti2.add('Z');
        stackMulti2.add('W');

        assertFalse(stackMulti1.equals(stackMulti2));

        stackMulti1.addAll(stackMulti2);
        assertTrue(stackMulti1.equals(new StackMulticonjunto<Character>() {{
            add('X');
            add('X');
            add('Y');
            add('Y');
            add('Z');
            add('W');
        }}));
    }
}
