package javacore.chapter02.condition.exercise;

public class NumberComparison {
    public static void main(String args[]) {
        int number1 = -50;
        int number2 = -40;
        if (number1 > number2) {
            System.out.println(number1 + " supérieur à " + number2);
        } else if (number2 > number1) {
            System.out.println("Le nombre 1 " + number1 + " est inférieur  au nombre 2 " + number2);
        }
        else {
            System.out.println("Les 2 nombre sont égaux");
        }
    }
}