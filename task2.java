package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects:\n");

        
        float subject_1 = in.nextFloat();
        float subject_2 = in.nextFloat();
        float subject_3 = in.nextFloat();
        float subject_4 = in.nextFloat();
        float subject_5 = in.nextFloat();

        float total;
        float average;
        float percentage;
        char grade;
        int sAvg;

        
        total = subject_1 + subject_2 + subject_3 + subject_4 + subject_5;
        average = (float)(total / 5.0);
        percentage = (float)((total / 500.0) * 100);

        
        sAvg = (int) average / 10;

       
        switch (sAvg) {
            case 10:
                grade = 'A';
                break;

            case 9:
                grade = 'A';
                break;

            case 8:
                grade = 'B';
                break;

            case 7:
                grade = 'C';
                break;

            case 6:
                grade = 'D';
                break;

            default:
                grade = 'E';
                break;
        }

       
        System.out.println("\nThe Total marks   = " + total + "/500.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }


}