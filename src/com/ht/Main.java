package com.ht;

public class Main {

    public static void main(String[] args) {
	// write your code here

    InfixCalculator cal = new InfixCalculator();
    String exp = "1 + 2";
    System.out.println("Infix Expression: " + exp);
    System.out.println("Postfix Expression: " + cal.transformExpression(exp));
    }
}
