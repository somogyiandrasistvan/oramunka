
package gyakorlas;

import java.util.Random;

public class Gyakorlas {
    
    private static final Random random = new Random();
    

    public static void main(String[] args) {
        kiiras();
    }
    private static void kiiras(){
        eq();
        eq(8);
        eq(true);
        eq(5, true);
        eq(true);
    }
    private static String blockok(int hossz){
        String szoveg = "";
        for (int i = 0; i < hossz; i++){
            szoveg += "\u001B[45m" + " ";
        }
        return szoveg;
        
    }
    private static void eq(){
        System.out.println(blockok(random.nextInt(3, 8)));
    }
    
    private static void eq(int hossz){
        System.out.println(blockok(hossz));
    }
    
    private static void eq(int hossz, boolean latszik){
        if(latszik == true){
            System.out.println(blockok(hossz) + "\u001B[0m" + "("+hossz+")");
        }
        else{
            System.out.println(blockok(hossz));
        }
    }
    private static void eq(boolean latszik){
        int szam = random.nextInt(3, 8);
        String ertek = blockok(szam);
        if (latszik == true){
            System.out.println(ertek + "\u001B[0m" + "("+szam+")");
        }
    }

}
