/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author DRAGON
 */
public class Lingkaran {
    Scanner scanner = new Scanner(System.in);
    public int diameter;
    public boolean status;
    public double jari;
    public double keliling;
    public double luas;
    
    public void cekStatus(){
        status = false;
        while (!status){
            System.out.print("Masukkan nilai diameter lingkaran : ");
            if (scanner.hasNextInt()){
                diameter = scanner.nextInt();
                status = true;
                
                System.out.println(" ");
                System.out.println("============Hasil Perhitungan Lingkaran============");
                jari = diameter/2;
                luas = 3.14 * jari * jari;
                keliling = 3.14 * diameter;
                System.out.println("Jari-jari Lingkaran = " + jari +" cm");
                System.out.println("Luas Lingkaran      = " + luas +" cm");
                System.out.println("Keliling Lingkaran  = " + keliling +" cm");
                       
            }else{
                        System.out.println("Nilai Diameter Tidak Sesuai");
                        System.out.println(" ");
                        scanner.next();
                        }
            }
        }
    }
