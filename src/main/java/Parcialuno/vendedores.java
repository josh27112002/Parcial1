/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcialuno;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class vendedores 
{
public static void main(String[] args) {

    String[] v = {"Josue", "Mari", "Keily", "Caleb", "Roberto"};
        float[][] datosv = new float[5][10];
        Random random = new Random();
        float m = 0;



        for (int i = 0; i < 5; i++) {
            m= 0;
            for (int j = 0; j < 4; j++) {
                datosv[i][j] = random.nextInt(3200-30) + 70;
                m += datosv[i][j];
            }



            datosv[i][4] = m;
            if (datosv[i][4] <= 2000) {
                datosv[i][5] = datosv[i][4] * 0.20f;
                datosv[i][7] = datosv[i][4] + datosv[i][5];
            } else {
                datosv[i][6] = datosv[i][4] * 0.35f;
                datosv[i][7] = datosv[i][4] + datosv[i][6];
            }

            datosv[i][8] = datosv[i][7] * 0.05f; 
            datosv[i][9] = datosv[i][7] - datosv[i][8]; 
        }

        





        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%20s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", "NOMBRE", "ENERO", "FEBRERO", "MARZO","ABRIL","TOTAL VENTAS","20%","35%","SUB TOTAL","QUITAR ISR 5%","TOTAL");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.format("%20s", v[i]); 
            for (int j = 0; j < 10; j++) {
                System.out.format("%16s", datosv[i][j]);   
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        







        float tcom;
        System.out.format("%20s", "TOTAL"); 
        for(int i=0; i<10; i++){
            tcom=0;
            for(int j=0; j<5; j++){
                tcom+=datosv[j][i];
            }
            System.out.format("%16s", tcom);
        }
        
        System.out.println();
}
}