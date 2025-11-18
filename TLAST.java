//LAURA KASIH MUTIARA - 12S25014
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] judul = new String[10], kode = new String[10], matkul = new String[10], dosen = new String[10], waktu = new String[10], nim = new String[10], status = new String[10], hasil1 = new String[10], show = new String[10], perintah = new String[10];
        double[] prioritas = new double[10], deadline = new double[10], tingkat = new double[10];
        int p, a, c, x, k, a1, a2, a3, temp1, temp2, tempp, fg, c1, c2;
        double tempz;
        String temp21, temp3, temp4, temp5, temp6, temp7, temp8, tempx;
        double temp;

        k = 0;
        x = 0;
        p = 0;
        a2 = 0;
        a = 0;
        temp1 = 0;
        tempp = 0;
        temp2 = 0;
        fg = 0;
        for (fg = 0; fg <= 9; fg++) {
            perintah[fg] = "";
            judul[fg] = "";
            kode[fg] = "";
            matkul[fg] = "";
            dosen[fg] = "";
            waktu[fg] = "";
            nim[fg] = "";
            tingkat[fg] = 0;
            deadline[fg] = 0;
            show[fg] = "";
            status[fg] = "";
        }
        for (p = 0; p <= 9; p++) {
            perintah[p] = input.nextLine();
            if (perintah[p].equals("---")) {
                p = 10;
                a = 0;
            } else {
                if (perintah[p].equals("Add task")) {
                    judul[p] = input.nextLine();
                    kode[p] = input.nextLine();
                    matkul[p] = input.nextLine();
                    dosen[p] = input.nextLine();
                    waktu[p] = input.nextLine();
                    nim[p] = input.nextLine();
                    tingkat[p] = Double.parseDouble(input.nextLine());
                    deadline[p] = Double.parseDouble(input.nextLine());
                    prioritas[p] = tingkat[p] * 1.0 / deadline[p];
                    if (prioritas[p] > 3.0) {
                        hasil1[p] = "Penting! Anda harus mengerjakan tugas ini segera";
                    } else {
                        if (prioritas[p] >= 1.5 && prioritas[p] <= 3.0) {
                            hasil1[p] = "Tugas ini memiliki prioritas menengah";
                        } else {
                            if (prioritas[p] < 1.5) {
                                hasil1[p] = "Tugas ini relatif ringan, namun jangan tunda terlalu lama";
                            }
                        }
                    }
                    status[p] = input.nextLine();
                    a1 = p;
                } else {
                    if (perintah[p].equals("Update task status")) {
                        kode[p] = input.nextLine();
                        a = p;
                        for (a2 = 0; a2 <= a; a2++) {
                            for (a3 = 1; a3 <= a; a3++) {
                                if (kode[a2].equals(kode[a3])) {
                                    status[a2] = input.nextLine();
                                    show[a2] = input.nextLine();
                                    temp1 = a3;
                                    a3 = a;
                                    tempp = a2;
                                    a2 = a;
                                }
                            }
                        }
                    }
                    a = p - 1;
                    p = a;
                    a3 = temp1;
                    a2 = tempp;
                }
                temp2 = p;
            }
            a = temp2;
        }
    }
    
    public static void addtaks() {
        // Name = Expression;
    }
}

