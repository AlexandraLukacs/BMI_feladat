package bmifeladat;

import java.util.Scanner;


public class BmiFeladat {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        bmiFel();
    }

    private static void bmiFel() {
        kiIr("BMI kiszámítása");
        int magas = beker("Testmagasság (cm) [100, 200]:", 100, 200);
        int tomeg = beker("Testtömeg (kg) [40, 150]:", 40, 150);
        bmiErtekeles(bmiSzamitas(), magas, tomeg);
        bmiSzamitas();
    }
    
    private static int beker(String cim, int also, int felso) {
        kiIr(cim);
        int adat = sc.nextInt();
        while (also < adat || adat > felso);{
        }
        return adat;
    }

    private static void kiIr(String szoveg) {
        System.out.println(szoveg);
    }

    private static void bmiErtekeles(double bmi, int magassag, int tomeg) {
        String ki = "Ön %d cm magas és %d kg tömegű".formatted(magassag, tomeg);
        String alkat = "";
        if (bmi < 20){
            
        }
    }

    private static double bmiSzamitas(int tomeg, int magassag) {
        return tomeg / Math.pow(magassag / 100.0, 2);
    }

    
    
    
}
