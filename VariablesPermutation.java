package javacore.chapter01.variable.exercise;

public class VariablesPermutation { public static  void main(String[] args)
{
    int a = 10;
    int b = 20;
    int  c = b ;
    System.out.println("Valeur de A avant inversion "+ a + " et valeur de b avant inversion "+ b );
    b = a ;
    a = c ;
    System.out.println("Valeur de A après inversion "+ a + " et valeur de b après inversion "+ b );
}
}
