package PETSHOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input data karyawan
        System.out.print("Masukkan Jumlah Karyawan yang Ingin Dimasukkan : ");
        int jumlahKaryawan = in.nextInt(); in.nextLine();
        Karyawan dataKaryawan [] = new Karyawan[jumlahKaryawan];
        for (int i = 0; i < jumlahKaryawan; i++) {
            dataKaryawan[i] = new Admin();
        }
        //input data karyawan
        System.out.println("\n\n\n");
        if (jumlahKaryawan>0) {
            System.out.println("========DATA KARYAWAN PET SHOP==========");
            for (int i = 0; i < jumlahKaryawan; i++) {
                dataKaryawan[i].PrintDataKaryawan();
            }
        }else {
        }
        System.out.println("\n\n\n");

        //input pelanggan/hewan
        System.out.print("Masukkan Jumlah Hewan yang Ingin dirawat : ");
        int jumlahPelanggan = in.nextInt(); in.nextLine();
        Hewan [] dataPelanggan  = new Hewan[jumlahPelanggan];
        if (jumlahPelanggan>0) {
            for (int i = 0; i < dataPelanggan.length; i++) {
                dataPelanggan[i] = new Hewan();
                if (dataPelanggan[i].getNamaHewan().equalsIgnoreCase("kelinci")) {
                    dataPelanggan[i] = new Hewan();
                }
            }
        }else {
        }
        //output data pelanggan/hewan
        System.out.println("\n\n\n");
        for (int i = 0; i < dataPelanggan.length; i++) {
            dataPelanggan[i].printDataHewan();
        }
    }
}