package main;

import package1.Addition;
import package2.Division;
import package3.Multiplication;
import package4.Subtraction;

public class main  {
	public static void main(String[] args) {
        double number1 = 20;
        double number2 = 10;

        double sum = Addition.add(number1, number2);
        double difference = Subtraction.subtract(number1, number2);
        double product = Multiplication.multiply(number1, number2);
        double quotient = Division.divide(number1, number2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
