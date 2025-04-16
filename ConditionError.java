package javacore.chapter02.condition.exercise;

public class ConditionError {
    public static  void main(String[] args) {
        int age = 80;

        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }
        else if(age > 18 && age<=60) { // tu aurais du utilisr l'oprateur pour donner une limite à cette condition
            System.out.println("Vous êtes un adulte.");
        }
        else if(age > 60 && age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

    }
}



