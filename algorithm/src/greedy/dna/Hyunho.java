package greedy.dna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hyunho {
    static int A = 0;
    static int T = 0;
    static int G = 0;
    static int C = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hd = 0;
        StringBuilder nucleotide = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] dnsList = new String[N];
        String[] tempNucleotide = new String[2];
//        int N = 4;
//        int M = 10;
//        String[] dnsList = {"TATGATAC", "TAAGCTAC", "AAAGATCC", "TGAGATAC","TAAGATGT"};
//        String[] dnsList = {"ACGTACGTAC", "CCGTACGTAG", "GCGTACGTAT", "TCGTACGTAA"};
//        String[] dnsList = {"ACGTACGTAT", "CCGTACGTAA", "GCGTACGTAA", "TCGTACGTAT"};

        for (int i = 0; i < N; i++){
            dnsList[i] = br.readLine();
        }

        for (int i = 0; i < M; i++){

            for (int j = 0; j < N; j++){
                String calcResult = calcNucleotide(dnsList[j].charAt(i));
                if (!calcResult.isEmpty()){
                    tempNucleotide = calcResult.split(" ");
                }
            }
            nucleotide.append(tempNucleotide[0]);
            hd += (N-Integer.parseInt(tempNucleotide[1]));
//            System.out.println("result 1== "+nucleotide+"\n"+hd);
            A = 0;
            T = 0;
            G = 0;
            C = 0;
        }

        System.out.println(nucleotide+"\n"+hd);

    }

    public static String calcNucleotide(char nucleotide){
        String result = "";
        switch (nucleotide){
            case 'A':
                A++;
                if (A > T && A > G && A > C){
                    result = "A "+A;
                }else if (A == T || A == G || A == C){
                    result = "A "+A;
                }
                break;
            case 'T':
                T++;
                if (T > A && T > G && T > C){
                    result = "T "+T;
                }else if (T == A){
                    result = "A "+A;
                }else if (T == G){
                    result = "G "+G;
                }else if (T == C){
                    result = "C "+C;
                }
                break;
            case 'G':
                G++;
                if (G > T && G > A && G > C){
                    result = "G "+G;
                }else if (G == A){
                    result = "A "+A;
                }else if (G == C){
                    result = "C "+C;
                }else if (G == T){
                    result = "G "+G;
                }
                break;
            case 'C':
                C++;
                if (C > T && C > G && C > A){
                    result = "C "+C;
                }else if (C == A){
                    result = "A "+A;
                }else if (C == T || C == G){
                    result = "C "+C;
                }
                break;
        }

//        System.out.println("calc result == "+result);
        return result;
    }
}
