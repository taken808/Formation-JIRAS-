package javacore.chapter01.variable.exercise;

public class SalaryForecast {public static void main(String[] args) {
    int rate = 25;
    double hour_Day =7.7;
    double salary_Day_brut = rate*hour_Day ;
    double salary_Week_Day = salary_Day_brut*7;
    double salary_Mounth_Brut = salary_Week_Day*4;
    double salary_Brut_Year = salary_Mounth_Brut*12;
    double coef = 1-0.25;
    double net_imposable_mouth= salary_Mounth_Brut*coef;
    double net_omposable_year =  net_imposable_mouth*12;
    double net_mensuel = net_imposable_mouth*0.90;
    double net_annuel = net_mensuel*12 ;
    System.out.println("Le salaire brut journalier est de "+ salary_Day_brut+ " €");
    System.out.println("Le salaire brut hebdomadaire est de "+ salary_Week_Day+" €");
    System.out.println("Le salaire brut mensuel est de "+ salary_Mounth_Brut + " €");
    System.out.println("Le traitement annuel est de "+ salary_Brut_Year + " €");
    System.out.println("le salaire mensuel net imposable est de "+ net_imposable_mouth+ " €");
    System.out.println("Le salaire  annuel net imposable est de "+net_omposable_year+ " €");
    System.out.println("Le salaire net mensuel apres impot est "+ net_mensuel + " €");
    System.out.println( "net annuel "+ net_annuel+ "€");
}
}


