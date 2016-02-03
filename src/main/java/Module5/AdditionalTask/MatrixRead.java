package Module5.AdditionalTask;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MatrixRead {
    static List<ArrayList<ArrayList<Integer>>> read() {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        String thisLine = "";

        Scanner in = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter elements of first matrix. Print 'quit' when done");
        //thisLine = in.nextLine();
        //System.out.println("thisLine is: "+thisLine);
        while (!thisLine.equals("quit")) {
            ArrayList<Integer> line = new ArrayList<>();
            thisLine = in.nextLine();
            if (thisLine.equals("quit")) {
                break;
            } else {
                String[] lineArray = thisLine.split(" ");
                for (String number : lineArray) {
                    line.add(Integer.parseInt(number));
                }
                //System.out.println("A line is: " + line);
                A.add(line);
            }

        }

        System.out.println("Enter elements of second matrix. Print 'quit' when done");
        thisLine = "";
        while (!thisLine.equals("quit")) {
            ArrayList<Integer> line = new ArrayList<>();
            thisLine = in.nextLine();
            if (thisLine.equals("quit")) {
                break;
            } else {
                String[] lineArray = thisLine.split(" ");
                for (String number : lineArray) {
                    line.add(Integer.parseInt(number));
                }
                //System.out.println("B line is: " + line);
                B.add(line);
            }
        }
        List<ArrayList<ArrayList<Integer>>> res = new LinkedList<>();
        res.add(A);
        res.add(B);
        return res;
    }
}
