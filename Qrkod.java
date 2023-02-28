package gyakorlas;

import java.util.Random;

public class Qrkod {

    private static final Random random = new Random();
    private static int index = -1;
    private static final String LILA = "\u001B[45m";
    private static final String KEK = "\u001B[44m";
    private static final String URES = "\u001B[0m";
    private static final String[] FENTI_JEL = {"%s %s %s %s %s ".formatted(KEK, KEK, KEK, KEK, KEK),
                                               "%s %s %s %s %s ".formatted(KEK, URES, URES, URES, KEK),
                                               "%s %s %s %s %s ".formatted(KEK, URES, KEK, URES, KEK),
                                               "%s %s %s %s %s ".formatted(KEK, URES, URES, URES, KEK),
                                               "%s %s %s %s %s ".formatted(KEK, KEK, KEK, KEK, KEK)};
    public static void main(String[] args) {
        kiiras();

    }
    private static void kiiras(){ 
        kiir(5, true);
        kiir(10);
        kiir(5, true);
        kiir(true);
    }
    private static String qrkod(){
    
        String str = "";
        for (int i = 0; i < 20; i++){
            int ertek = random.nextInt( 2); 
            if (ertek == 0){
                str += URES + " ";
            }
            if (ertek == 1){
                str += LILA + " ";
            }
        }
        return str;
    }
    
    private static String qrkod25(){
        String str = "";
        for (int i = 0; i < 25; i++){
            int ertek = random.nextInt( 2); 
            if (ertek == 0){
                str += URES + " ";
            }
            if (ertek == 1){
                str += LILA + " ";
            }
        }
        return str;
    }
    
    private static void kiir(int magassag, boolean igaz){
        for(int i = 0; i < magassag; i++){
            index++;
            if (igaz == true){
                System.out.println(qrkod() + FENTI_JEL[index]);
            }
        }
        index = -1;
    }
    private static void kiir(boolean igaz){
        System.out.println("\n");
        for(int i = 0; i < 5; i++){
            index++;
            if (igaz == true){
                System.out.println(FENTI_JEL[index]);
            }
        }
        index = -1;
    }
    
    private static void kiir(int magassag){
        for(int i = 0; i < magassag; i++){
            System.out.println(qrkod25());
        }
        System.out.println("\n");
    }
    
}

