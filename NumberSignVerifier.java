package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {
    public static void main(String[] args) {
        double age = 0;
        if (age > 0) {
            System.out.println("Je suis un nombre strictement positif ");
        } else if (age == 0) {
            System.out.println("Je suis un nombre neutre ");
        } else {
            System.out.println("Je suis un nombre strictement négatif ");

        }




        if (age >0){
            System.out.println("je suis un nombre strictement positif ");
        }

        if (age == 0){
            System.out.println("je suis un nombre neutre ");
        }

        if (age <0){
            System.out.println("Je suis un nombre strictement négatif ");
        }
    }
}
