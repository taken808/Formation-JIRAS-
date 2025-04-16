package javacore.chapter02.condition.exercise;

        public  class CoinChangerV1 { public static  void main(String[] args) {
            /*
            calculer la monnaie à rendre par rapport à la somme données
            en fonction e la monnaie à rendre déterminer les coupure e 50 et 20 à l'aide d'une fonction SI
            Faire de même avec les pièces
             */
            int totalBill =331;
            int amountPaid =550;
            int nbbillets50 =0;
            int valBillet50 = 50;
            int nbbillets20= 0;
            int valBillet20=20;
            int nbbillets10 =0;
            int valBillet10=10;
            int nbpicece2 =0;
            int valPiece2 = 2;
            int nbPiece1=0;
            int valPiece1 = 1;
            int monnaie = amountPaid -totalBill;
            System.out.println("La monnaie à rendre est de "+monnaie +" €");
            if (monnaie>=50){
                nbbillets50 = monnaie/valBillet50;
                System.out.println("La machine doit deliver "+nbbillets50+" billets de 50 €");
                monnaie = monnaie- nbbillets50*valBillet50;
                System.out.println("monnaie réactualisée: "+monnaie);
            }
            if (monnaie>=20){
                nbbillets20 =monnaie/valBillet20;
                System.out.println("la machine doit delivrer "+nbbillets20+"billets de 20 € ");
                monnaie = monnaie - nbbillets20*valBillet20;
                System.out.println("Monnais réactualisé "+monnaie);
            }
            if (monnaie>=10){
                nbbillets10 = monnaie/valBillet10;
                System.out.println("La machine doit délivrer "+nbbillets10+ " billet(s) de 10 €");
                monnaie =monnaie -nbbillets10*valBillet10;
                System.out.println( "Monnaie réactualisé "+ monnaie);
            }
            if (monnaie>=valPiece2){
                nbpicece2 = monnaie/valPiece2;
                System.out.println("la machine doit rendre "+nbpicece2+" pices(s) de 2 €");
                monnaie = monnaie - nbpicece2*valPiece2;
                System.out.println("Monnaie réactualisée "+monnaie);
            }
            if (monnaie>=valPiece1){
                nbPiece1 = monnaie/valPiece1;
                System.out.println("La machine doit rendre "+nbPiece1+" pièce(s) de 1 €");
                monnaie =monnaie - nbPiece1*valPiece1 ;
                System.out.println("Monnaie réactualisé "+monnaie);
            }
            if (monnaie==0){
                System.out.println("l'automate a rendu "+nbbillets50+" billet(s) de 50 € "+nbbillets20+" billet(s) de 20 € "+nbbillets10+" billet(s) de 10 € "+nbpicece2+" piece(s) de 2 € et "+nbPiece1+" pirce(s) de 1 €");
            }
        }
}


