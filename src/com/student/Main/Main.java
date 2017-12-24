package com.student.Main;

/**
 * Created by nibesh on 4/1/17.
 */
import com.student.utl.GradeCalc;
import java.text.DecimalFormat;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the nbr of student: ");
        int nbrOfStudent=scan.nextInt();
        System.out.println("please enter the nbr of subject: ");
        int nbrOfSubb = scan.nextInt();
        for(int j=0;j<nbrOfStudent;j++) {
            System.out.println("Mark for student"+(j+1));

            double[] subjectArray = new double[nbrOfSubb];
            for (int i = 0; i < nbrOfSubb; i++) {
                System.out.println("pleasse enter the markof subject" + (i + 1) + ":");
                subjectArray[i] = scan.nextDouble();
            }
            GradeCalc gc = new GradeCalc(subjectArray);
            double cgpa = gc.getGrade();
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.println("your cgpa is: " + df.format(cgpa));
            System.out.println("your grade is: " + calcGrade(cgpa));
            //System.out.printf("%.2d",cgpa);
        }
    }
    private static String calcGrade(double cgpa){
        String grade="F";
        if(cgpa==5)
            grade="A+";
        else if(cgpa>=4)
            grade="A";
        else if(cgpa>=3.5)
            grade="A-";
        else if(cgpa>=3)
            grade="B";
        else if(cgpa>=2)
            grade="C";
        else if(cgpa>=1)
            grade="D";
        return grade;

    }
}
