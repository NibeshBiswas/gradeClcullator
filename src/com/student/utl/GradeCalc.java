package com.student.utl;

/**
 * Created by nibesh on 4/1/17.
 */

public class GradeCalc {
   private  double subArray [];

   /* <p> the public constructor for GradeCalc*/

    public GradeCalc(double [] givenArray)
    {
        subArray=givenArray;

    }
    public double getGrade(){
        double totalGrade=0.0;
        for(double mark : subArray)
            totalGrade=totalGrade+getSingleSubGrade(mark);

        return totalGrade/subArray.length;



    }
    private double getSingleSubGrade(double subMark){
        double grade=0.0;
        if(subMark>=80)
            grade=5;
        else if(subMark>=70)
            grade=4;
        else if(subMark>=60)
            grade=3.5;
        else if(subMark>=50)
            grade=3;
        else if(subMark>=40)
            grade=2;
        else if(subMark>=33)
            grade=1;
        return grade;
    }




}
