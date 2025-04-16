package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {
    public static void main(String[] args) {
         boolean isHouseEmpty =true;
         boolean isOwnerAsleep = true;
         boolean areAllDoorsAndWindowsClosed = false;
         boolean isSafeModeActivated;
         boolean isAlarmActivated = true ;
        if (areAllDoorsAndWindowsClosed && isAlarmActivated &&  (isHouseEmpty || isOwnerAsleep  ) ){
            isSafeModeActivated = true;
            System.out.println(isSafeModeActivated);
            System.out.println("Toutes les conditions sont remplies pour que le mode sécurisé soit enclenché");

        }
        else {
            System.out.println("Le mode sécurisé ne peut pas être enclenché ");
        }
    }
}


