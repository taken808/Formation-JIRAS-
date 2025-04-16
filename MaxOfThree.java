package javacore.chapter02.condition.exercise;

public class MaxOfThree {
    public static void main(String[] args) {
    int a = 40;
    int b = 100;
    int c = 100;
    if (a> b && a>c){
        System.out.println(" Le nombre A est "+ a + " il est le plus grand des trois ");
    } else if (b > a && b >c ) {
        System.out.println("Le nembre B est "+ b + " il est le plus grand de la serie ");

    }
    else if (c >a && c >b ){
        System.out.println("le nombre C est  " + c + " le plus  grand de la série ");
    }
    else if (a == b || a == c || b == a ||  b == c || c == a || c == b ){
        System.err.println(" des valeurs son égales ");
    }

}
}
