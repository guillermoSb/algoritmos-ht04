package com.ht;
import java.util.ArrayList;

public class InfixCalculator implements Calculator {

    Stack<Double> data;
    static boolean hasInstance;

    private InfixCalculator(Stack<Double> data) {
        data = data;
        hasInstance = true;
    }

    public static InfixCalculator instance(Stack<Double> data) {
        if (InfixCalculator.hasInstance) {
            return null;
        }
        return new InfixCalculator(data);
    }

    public void destroyInstance() {
        InfixCalculator.hasInstance = false;

    }

    public void add(Double item) {
        data.add(item);
    }

    public Double remove() {
        return data.remove();
    }

    public int size() {
        return data.size();
    }

    @Override
    public double calculate(String operation) {
        // Split the operation into subcomponents
        String[] splittedOperation = operation.split(" ");
        // Iterate through each value on the operation
        for (String value:
             splittedOperation) {
            // TODO: Handle error
            if (!isNumber(value) && !isOperator(value)) {
                return 0;
            }

            // If the value is a number, add it to the stack
            if (isNumber(value)) {
               add(Double.parseDouble(value));
            }
            // If the value is an operator, start operating two values
            if(isOperator(value)) {
                // Todo: Handle Exception
                Double operatorA = remove();
                Double operatorB = remove();
                String operator = value;
                Double result = operate(operatorA, operatorB, operator);
                add(result);
            }
        }
        return remove();
    }

    /**
     * Operate two values
     * @param a Operator 1
     * @param b Operator 2
     * @param operator operation. +, -, /, *
     * @return
     */
    private double operate(Double a, Double b, String operator) {
        if (operator.equals("+")) return a + b;
        if (operator.equals("-")) return a + b;
        if (operator.equals("*")) return a * b;
        if (operator.equals("/")) return a / b;
        return 0;   // Last instance
    }


    /**
     * Check if a string is a number or not
     * @param value
     * @return
     */
    private boolean isNumber(String value) {
        try {
            Double number = Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            return  false;
        }
    }

    /**
     * Check if a string is an operator or not
     * @param value
     * @return
     */
    private boolean isOperator(String value) {
        if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
            return true;
        }
        return false;
    }

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String transformExpression(String operation){
      
        String result = "";
        Stack<Character> stack = new VectorStack<>();
        for (int i = 0; i <operation.length() ; i++) {
            char c = operation.charAt(i);
    
            //check if char is operator
            if(precedence(c)>0){
                while(stack.empty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.remove();
                }
                    stack.add(c);
                }else if(c==')'){
                    char x = stack.remove();
                    while(x!='('){
                        result += x;
                        x = stack.remove();
                    }
                }else if(c=='('){
                    stack.add(c);
                }else{
                    //character is neither operator nor ( 
                    result += c;
                }
            }
            for (int i = 0; i <=stack.size() ; i++) {
                result += stack.remove();
            }
        return result;
        
    }


}
