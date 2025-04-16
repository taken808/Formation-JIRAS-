package javacore.chapter02.condition.exercise;

    public class ObfuscatedCodeV1 {
        public static void main(String[] argd ){
            int b = 1; // Type de véhicule (1 = XXX, 2 = YYY, 3 = ZZZ) // Le  x LE Y et le Z reprsente chacun un type de véhicule

            double a = 100; // Distance // nous cherchons à calculer un cout en fonction du type de véicules et de la distance parcourue

            boolean e = true; // je présume q'une augmentation ou une diminution du cout de ce dernier à lieu sous certaine condition puisque je remarque la présence de bloc if
            double d = 0.03;

            double c = 0;

            if (b == 1) {
                c = a * 0.10;
            }
            if (b == 2) {
                c = a * 0.20;
            }
            if (b == 3) {
                c = a * 0.35;
            }
            if (e) {
                c = c - (a * d);
            }

            System.out.println("___________ : " + c + "€");
        }

    }









