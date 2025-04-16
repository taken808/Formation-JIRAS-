package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {
    public static void main(String[]args) {
  /* Si age est compris entre 0 (bébé) et 25 ans  j'applique une reduction de 25 %
  si age compris 25 ans et 65 ans pas de rduction possible
  si age vaut plus de 65 ans un rabais de 75 % s'applique
 */
        int age =25;
        /*
        50*0.75 pour les moins de 25 ans
        50*0.25 pour les plus de 65 ans
        pas de réduction pour la tranche d'age allant de 25 ans à 65 ans
         */
        double price =50;
        double reductionJeune = price*0.75;
        double reductionSenior =price*0.25;
        if (age <25){
            System.out.println("Prix pour une personne de moin de 25 ans " + reductionJeune+ " €");
        }
        else if (age >65 ){
            System.out.println("Prix pour les plus de 65 ans : " + reductionSenior + " €");
        }
        else {
            System.out.println(" le prix est de "+ price + "€");
        }

    }
}
