package javacore.chapter02.condition.exercise;

/*
Je calcule les tranches respective en fonction de mon salaire
j'applique le taux correspondant aux tranches
Je calcule l'impot sur le revenu en additionnant toutes les tranches
 */
public class FrenchRevenueTaxCalculator  {
    public static void main(String args[]){
        int salaire = 1200;
        int salAnnulul = salaire*12;
        int trancheAMin =0;
        int trancheAMax =11294;
        int trancheBMin =11295;
        int trancheBMax = 28797;
        int trancheCMin = 28798;
        int trancheCMax = 82341;
        int trancheDMin = 82342;
        int trancheDMax = 177106;
        int calTranchA = 0;
        int calTrancheB =0;
        int calTrancheC =0;
        int calTrancheD =0;
        int calTrancheE =0;
        double tauxTrancheA =0;
        double tauxTrancheB = 0.11;
        double tauxTranchec= 0.30;
        double tauxTrancheD = 0.41;
        double tauxTrancheE = 0.45 ;
        double impotTrancheA =0;
        double impotTrancheB =0;
        double impotTranchec =0;
        double impotTrancheD =0;
        double impotTrancheE =0;


        if (salAnnulul>trancheAMin){
            if(salAnnulul>trancheAMax){
                calTranchA = trancheAMax -trancheAMin;
                System.out.println("La tranche d'imposition A vaut  : "+ calTranchA);
                impotTrancheA = calTranchA*tauxTrancheA;
                System.out.println("Montant d'impot sur la tranche A "+impotTrancheA);
            }
            else if (salAnnulul<trancheAMax){
                calTranchA = salAnnulul - trancheAMin;
                System.out.println("La tranche d'imposition A VAUT : "+ calTranchA);
                impotTrancheA = calTranchA*tauxTrancheA;
                System.out.println("Montant d'impot sur la tranche A "+impotTrancheA);
            }





            if (salAnnulul>trancheBMin && salAnnulul>trancheBMax){
                calTrancheB = trancheBMax - trancheBMin;
                System.out.println("La tranche d'imposition B vaut : " +calTrancheB);
                impotTrancheB = calTrancheB*tauxTrancheB;
                System.out.println("Montant d'impot sur la tranche B : " + impotTrancheB);
            }
            else if (salAnnulul<trancheBMax){
                calTrancheB = salAnnulul -trancheBMin ;
                System.out.println("La trauche d'imposition B vaut : " + calTrancheB);
                impotTrancheB = calTrancheB*tauxTrancheB;
                System.out.println("Montant d'impot sur la tranche B : "+impotTrancheB);
            }




            if(salAnnulul>trancheCMin && salAnnulul>trancheCMax){
                calTrancheC = trancheCMax - trancheCMin;
                System.out.println("La tranche d'imposition C vaut "+ calTrancheC);
                impotTranchec = calTrancheC*tauxTranchec ;
                System.out.println("Montant d'impot sur la tranche C : "+impotTranchec);
            }
            else if (salAnnulul>trancheCMin && salAnnulul<trancheCMax){
                calTrancheC = salAnnulul - trancheCMin;
                System.out.println( "La tranche d'imposition C vaut "+ calTrancheC);
                impotTranchec = calTrancheC*tauxTranchec;
                System.out.println(" Montant d'impot sur la tranche C " +impotTranchec);
            }




            if(salAnnulul>trancheDMin && salAnnulul>trancheDMax){
                calTrancheD = trancheDMax - trancheDMin;
                System.out.println("La tranche d'imposition D vaut "+ calTrancheD);
                impotTrancheD = calTrancheD*tauxTrancheD;
                System.out.println("Montant d'impots sur la tranche D "+impotTrancheD);
            }
            else if (salAnnulul>trancheDMin && salAnnulul<trancheDMax){
                calTrancheD = salAnnulul - trancheDMin;
                System.out.println( "La tranche d'imposition D vaut "+ calTrancheD);
                impotTrancheD = calTrancheD*tauxTrancheD ;
                System.out.println("Montant d'impot sur la tranche  D "+ impotTrancheD);
            }



            if (salAnnulul>trancheDMax){
                calTrancheE = salAnnulul -trancheDMax;
                System.out.println( "La tranche d'imposition E vaut "+ calTrancheE);
                impotTrancheE = calTrancheE*tauxTrancheE;
                System.out.println("Montant d'impot sur la tranche E "+impotTrancheE);

            }



        }

    }
}
