package javacore.chapter02.condition.exercise;

public class ParityChecker {public  static  void main(String[] args) {
    long nb = 3333777799999l;
    long res =nb%2 ;


    if (res==0){
        System.out.println("le nombre saisi est pair ");
    }

    else {
        System.out.println("le nombre saisi est impair");
    }
    /* pour déterminer si un nombre est pair j'ai choisi d'opter pour le modudulo si celui-ci est égal a 0
    alors le nombre est pair sinon il ne l'est pas j'ai testé le bon dereoulement de mon programme avec des
    valeurs simple tel que 2 et 3
     */

}
}
