package com.ht;

public class Main {

    public static void main(String[] args) {
	// write your code here
    StackFactory<Double> stackFactory = new StackFactory<>();
    Vista v = new Vista();
    StackFactory<Double> stackFactory = new StackFactory<>();
        InfixCalculator cal = InfixCalculator.instance(stackFactory.getStack("V"));
        String exp = "1+2";
        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + cal.transformExpression(exp));
        System.out.println("Resultado: "+ cal.calculate(cal.separar(cal.transformExpression(exp))));
    String sc = "" ;
    v.welcome();
    while (sc != "S") {
        sc = v.menu();
        if (sc == "AL") {
            
        }
        if (sc == "V") {
            
        }
        if (sc == "LS") {
            
        }
        if (sc == "DL") {
            
        }
        else{
            System.out.println("Eso no es una opción valida"); 
        }
    }
    InfixCalculator cal = InfixCalculator.instance(stackFactory.getStack("V"));
    String exp = "1 + 2";
    System.out.println("Infix Expression: " + exp);
    System.out.println("Postfix Expression: " + cal.transformExpression(exp));

    }
}
