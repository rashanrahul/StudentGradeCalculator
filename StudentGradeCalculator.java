import java.util.Scanner;

public class studentGradeCalculator{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("\nEnter the number of subject : ");
        int nSubject = Scanner.nextInt();

        int[] marks = new int[nSubject];
        int totalMark=0;

        for(int i=0; i<nSubject; i++){
            System.out.print("Enter mark for subject "+(i+1)+":");
            marks[i]=Scanner.nextInt();
            totalMark += marks[i];
        }
        double averagepercentage = (double) totalMark/nSubject;

        String grade;
        if (averagepercentage >=75){
            grade ="A";
        }
        else if(averagepercentage >=65){
            grade ="B";
        }
        else if(averagepercentage >=55){
            grade ="C";
        }
        else if(averagepercentage >=40){
            grade ="D";
        }
        else{
            grade ="F";
        }

        System.out.println("\n    *****Results***** ");
        System.out.println("Total Marks : "+totalMark);
        System.out.println("Average Percentage : "+averagepercentage+"%");
        System.out.println("Grade : "+grade);

        Scanner.close();

    }
}