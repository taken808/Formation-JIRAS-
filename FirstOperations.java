package javacore.chapter01.variable.exercise;

public class FirstOperations {
    public static  void main(String[] args) {
    int a = 100;
    int b = 5;
    int sum = a + b ;
        System.out.println("Le résultat de la sommme est  " + sum);

        int subtraction = a - b ;
        System.out.println("Le résultat de la soustraction est  " + subtraction);

        int multiplication = a*b ;
        System.out.println("Le résultat de la multiplication  est  " + multiplication);

        int division = a/b;
        System.out.println("Le résultat de la division  est  " +division);

        int c = 10;
        int d = 30;
        c +=d;
        System.out.println(c);
        // Addition avec opérateur combiné
        d-=5;
        System.out.println("La soustraction avec l'opérateur combiné donne " + d);
        c *= 3;

        System.out.println("Le produit de C X3 est " + c );

        d /=3;
        System.out.println("D divisé par 3 vaut "+ d );
        // Je suppose que la valeur de E sera de 7
        int e = 1 * 5 + 2;
        System.out.println(e);


        // Je suppose que la valeur de f sera de 7
        int f =  1 * (5 + 2);
        System.out.println(f);

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        System.out.println(g);

        short hourSeconds = 3600;
        int daySeconds = hourSeconds*24;
        System.out.println(daySeconds);
        int weekSeconds = daySeconds*7 ;
        System.out.println("le nommbre de secondes dans une semaine est de " +weekSeconds);





    }
}