
package oraimunka0222;

public class Oraimunka0222 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        
        kiir(String.format("Az első 10 szám összege: %d", elso10SzamOsszege));
        kiir(String.format("%d + %d = %d", a, b, osszead))
    }
    
    private static void elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++){
            osszeg += i;
        }
            return osszeg;
        
    }
    
    private static void osszead(int a, int b){
        return a+b;
    }
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    }
}
