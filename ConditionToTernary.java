package javacore.chapter02.condition.exercise;

public class ConditionToTernary {


    public static void main(String[] args) {

        /**
         * Le code doit s'adapter aux différentes valeurs que vous mettrez à la variable age.
         */
        Integer age = 60;

        Integer pourcentageReduction = 0;

        /*if(age < 18) {
            pourcentageReduction = 50;
        }
        else {
            pourcentageReduction = 10;
        }

        System.out.println("La réduction appliquée est de " + pourcentageReduction + "% car l'utilisateur est agé de " + age + " ans");
        // je code une ternaire*/
        pourcentageReduction = (age<18?50:10);
        System.out.println("La réduction appliquée est de " + pourcentageReduction + "% car l'utilisateur est agé de " + age + "ans ");

    }

    }
