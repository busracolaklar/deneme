package ıf_deneme;

import java.util.Scanner;

public class ıf_deneme1 {
    //Öğrencinin vize notunun %30'unu final notunun %70'ini alalım.
    //  Vize ve final notunun toplamından doğan not ortalaması eğer 0-30 aralığındaysa KALDINIZ (FF) yazdıralım.
    // 31-49 aralığındaysa DC - KOŞULLU yazdıralım.
    //50- 84 aralığındaysa CC - GEÇTİNİZ! yazdıralım.
    //85-100 aralığındaysa Notunuz AA yazdıralım.

    public static void main(String[] args) {
        System.out.println("vize notunu girin: ");
        Scanner scan= new Scanner(System.in);
        int vize= scan.nextInt();
        System.out.println("final notunu girin");
        int fnot= scan.nextInt();
        int ortalama= ((vize*30)/100)+((fnot*70)/100);
        System.out.println(ortalama);

        if (ortalama >=0 && ortalama<=30){
            System.out.println("kALDINIZ (FF)");
        }else if (ortalama >=31 && ortalama<=49){
            System.out.println("DC - KOŞULLU ");
        } else if (ortalama >=50 && ortalama<=84){
            System.out.println("CC - GEÇTİNİZ!");
        }
        else if (ortalama >=85 && ortalama<=100){
            System.out.println("AA - GEÇTİNİZ!");
        } else if (ortalama<0) {
            System.out.println("EKSİ DEĞER GİREMEZSİNİZ");

        }
    }
}

