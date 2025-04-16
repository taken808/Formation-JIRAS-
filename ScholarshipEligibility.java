package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        double studentGpa =3.5;
        double householdIncome = 40000;
        boolean hasExtracurricular = true;
        if (householdIncome<40000) {
            System.out.println("tu perçois  la bourse à taux plein  ");
        }
        if ((householdIncome == 40000 && householdIncome <= 60000 && studentGpa > 3.5 && hasExtracurricular) == true){
            System.out.println("tu  percevra  la bourse partiellement  ");
        }
        if (householdIncome>60000|| studentGpa<=3.5 || hasExtracurricular == false){
            System.out.println("Tu n'est pas éligible à la bourse ");
        }


    }
}
