package javacore.chapter02.condition.exercise;

public class AgeCategorization {public static void main(String[]args){
    /*
    c'est un enfant si l'age est strictement inferieur à 10 ans
    c'est un adolescent  si l'age est compris entre 10 et inférieur à 18
    c'est un jeune adulte si l'age est égal ou supérieur à 18 et inféreur à  25
    c'est un adulte si l'age est sup&rieur ou gal à 25 et inféreur a 65
    c'est un sénior si l'age est égal à 65 et plus
     */
    int age = 70;
     if (age <10){
         System.out.println("c'est un enfant ");
     }
     else if (age >=10){
         if (age<18){
             System.out.println("c'est un adolescent ");
         }
         else if (age>=18){
             if(age<25){
                 System.out.println("c'est un jeune adulte ");
             } else if (age>=25) {

                 if (age<65){
                     System.out.println("c'est un adulte ");
                 }
             }
             if (age>=65){
                 System.out.println("C'est un sénior ");
             }

         }
     }

}
}
