package TUGASPRAKTIKUM;

import LATIHANV2.*;
import java.util.Scanner;

public class Guru3 {

    public static void main(String[] args) {
        int p;
        String Yg;
        boolean running = true;
        int counter = 0;
        System.out.println("----- TOOLS BY ----- ");
        System.out.print("                                                               __    \n"
                + "    ______            ________         __       __            |  |\n"
                + "   |  ____|  _       |______  |       |  |     |  |  __   __  |  |\n"
                + "   | |      | |            / /        |  |     |  | |  | |  | |  |______\n"
                + "   | | ____ | |_____      / /         |  |_____|  | |  | |  | |   ____  \\ \n"
                + "   |___   | |  ___  |   | |___        |   _____   | |  | |  | |  |    \\  \\ \n"
                + "   ____|  | | |   | |   |__   |    _  |  |     |  | |  |_|  | |  |___/  / \n"
                + "  |_______| |_|   |_|      |  |   (_) |__|     |__| |_____  | |  ______/\n"
                + "  ________________________/  /                              \\/  \\/\n"
                + "/___________________________/                              \n"
                + "              ");
        while (running) {
            Scanner hab = new Scanner(System.in);

            System.out.println();
            System.out.println("-- PILIH GURU MATPEL YANG MAU DI KEPOIN --");
            System.out.println("[1] PRODUKTIF RPL");
            System.out.println("[2] KOMPUTER & JARINGAN DASAR");
            System.out.println("[3] FISIKA");
            System.out.println("[4] KIMIA");
            System.out.println("[5] MATEMATIKA");
            System.out.println("[6] PENDIDIKAN KEWARGA NEGARAAN");
            System.out.println("[7] SEJARAH");
            System.out.println("[8] OLAHRAGA");
            System.out.println("[9] BAHASA INGGRIS");

            System.out.println("=========== PILIH SALAH SATU ==========");
            System.out.print("Masukan Pilihan Anda : ");
            p = hab.nextInt();
            switch (p) {

                case 1:
                    if (p == 1);
                    System.out.println();
                    System.out.println("========== RAJA CODING ==========");
                    Guru2 programer1 = new Guru2("PRODUKTIF RPL", "Pak Ipin", 21, "Setiap Hari");
                    programer1.info();
                    break;
                case 2:
                    if (p == 2);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer2 = new Guru2("KOMPUTER JARINGAN DASAR", "Bu Aulia", 18, "Kamis");
                    programer2.info();

                    break;
                case 3:
                    if (p == 3);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer3 = new Guru2("FISIKA", "Pak DIAOR", 28, "Rabu");
                    programer3.info();
                    break;
                case 4:
                    if (p == 4);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer4 = new Guru2("KIMIA", "Bu Chusnul", 41, "Juma'at");
                    programer4.info();
                    break;
                case 5:
                    if (p == 5);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer5 = new Guru2("MATEMATIKA", "Pak DIAOR", 38, "Senin");
                    programer5.info();
                    break;
                case 6:
                    if (p == 6);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer6 = new Guru2("PENDIDIKAN KEWARGANEGARAAN", "BU RaRa", 25, "Selasa");
                    programer6.info();
                    break;
                case 7:
                    if (p == 7);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer7 = new Guru2("SEJARAH", "Bu Ana", 28, "Kamis");
                    programer7.info();
                    break;
                case 8:
                    if (p == 8);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer8 = new Guru2("OLAHRAGA", "Pak Thariq", 28, "Rabu");
                    programer8.info();
                    break;
                case 9:
                    if (p == 9);
                    System.out.println();
                    System.out.println("========== Tools Stalking Matpel R2 ==========");
                    Guru2 programer9 = new Guru2("BAHASA INGGRIS", "Bu Seno", 22, "Selasa");
                    programer9.info();
                    break;

                default:
                    System.out.print("…………(0 0)\n"
                            + ".—oOO–(_)—–.\n"
                            + "╔═════════════════╗\n"
                            + "║      Maaf gan gak nemu      ║\n"
                            + "╚═════════════════╝\n"
                            + "‘———————-oOO\n"
                            + "……...|__|__|\n"
                            + "……….. || ||\n"
                            + "…….. ooO Ooo");

            }
            System.out.println("\n");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            Yg = hab.next();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if (Yg.equalsIgnoreCase("ya")) {
                running = false;
                System.err.print("╔╗       ╔╗\n"
                        + "║╚╦═╦╦╬╬══╦═╗\n"
                        + "║╔╣╩╣╔╣║║║║╬║\n"
                        + "╚═╩═╩╝╚╩╩╩╩╩╝\n"
                        + "╔╗══╔═╦╦╗\n"
                        + "║╠╦═╣═╬╣╚╗\n"
                        + "║═╣╬╠═║║║║\n"
                        + "╚╩╩╩╩═╩╩╩╝\n"
                        + "╔╦╦═╦═╗\n"
                        + "║║║║╬║║\n"
                        + "║║║╬║╬║\n"
                        + "╠╗╠╩╩╩╝\n"
                        + "╚═╝═══");

            }
            counter++;

        }
    }
}


