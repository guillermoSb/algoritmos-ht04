package com.ht;
import org.junit.Test;

import java.util.Optional;
import java.util.function.DoubleBinaryOperator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InfixCalculatorTest {
    VectorStack<Double> vectorStack = new VectorStack<>();
    ArrayListStack<Double> arrayListStack = new ArrayListStack<>();
    ListStack<Double> simpleLinkedListStack = new ListStack<>(new SimpleLinkedList<>());
    ListStack<Double> doubleLinkedListStack = new ListStack<>(new DoubleLinkedList<>());

    @Test
    public void testAdd(){
        assertTrue("El resultado debe ser 0 si no se ha agregado nada",vectorStack.size() == 0);
        assertTrue("El resultado debe ser 0 si no se ha agregado nada",arrayListStack.size() == 0);
        assertTrue("El resultado debe ser 0 si no se ha agregado nada",simpleLinkedListStack.size() == 0);
        assertTrue("El resultado debe ser 0 si no se ha agregado nada",doubleLinkedListStack.size() == 0);
        vectorStack.add(1.0);
        arrayListStack.add(2.0);
        simpleLinkedListStack.add(3.0);
        doubleLinkedListStack.add(4.0);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", vectorStack.size() == 1);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", arrayListStack.size() == 1);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", simpleLinkedListStack.size() == 1);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", doubleLinkedListStack.size() == 1);

        assertTrue("El valor debe se 1.0", vectorStack.peek() == 1.0);
        assertTrue("El valor debe se 2.0", arrayListStack.peek() == 2.0);
        assertTrue("El valor debe se 3.0", simpleLinkedListStack.peek() == 3.0);
        assertTrue("El valor debe se 4.0", doubleLinkedListStack.peek() == 4.0);
    }

    @Test
    public void testPeek() {
        vectorStack.add(1.0);
        arrayListStack.add(2.0);
        simpleLinkedListStack.add(3.0);
        doubleLinkedListStack.add(4.0);
        assertTrue("El valor debe se 1.0", vectorStack.peek() == 1.0);
        assertTrue("El valor debe se 2.0", arrayListStack.peek() == 2.0);
        assertTrue("El valor debe se 3.0", simpleLinkedListStack.peek() == 3.0);
        assertTrue("El valor debe se 4.0", doubleLinkedListStack.peek() == 4.0);
    }

    @Test
    public void testRemove() {
        vectorStack.add(1.0);
        arrayListStack.add(2.0);
        simpleLinkedListStack.add(3.0);
        doubleLinkedListStack.add(4.0);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", vectorStack.size() == 1);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", arrayListStack.size() == 1);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", simpleLinkedListStack.size() == 1);
        assertTrue("El resultado debe ser 1, si se ha agregado 1", doubleLinkedListStack.size() == 1);
        vectorStack.remove();
        arrayListStack.remove();
        simpleLinkedListStack.remove();
        doubleLinkedListStack.remove();
        assertTrue("El resultado debe ser 0 si se ha eliminado",vectorStack.size() == 0);
        assertTrue("El resultado debe ser 0 si se ha eliminado",arrayListStack.size() == 0);
        assertTrue("El resultado debe ser 0 si se ha eliminado",simpleLinkedListStack.size() == 0);
        assertTrue("El resultado debe ser 0 si se ha eliminado",doubleLinkedListStack.size() == 0);
    }

    @Test
    public void testCalculate() {
        InfixCalculator calculator = InfixCalculator.instance();
        calculator.setStack(vectorStack);
        double result = calculator.calculate("1 2 +");
        assertTrue("El resultado de 1 + 2 debe ser 3", result == 3);

        calculator.destroyInstance();
        calculator = InfixCalculator.instance();
        calculator.setStack(arrayListStack);

        result = calculator.calculate("1 2 +");
        assertTrue("El resultado de 1 + 2 debe ser 3", result == 3);

        calculator.destroyInstance();
        calculator = InfixCalculator.instance();
        calculator.setStack(simpleLinkedListStack);

        result = calculator.calculate("1 2 +");
        assertTrue("El resultado de 1 + 2 debe ser 3", result == 3);

        calculator.destroyInstance();
        calculator = InfixCalculator.instance();
        calculator.setStack(doubleLinkedListStack);

        result = calculator.calculate("1 2 +");
        assertTrue("El resultado de 1 + 2 debe ser 3", result == 3);
    }
}
