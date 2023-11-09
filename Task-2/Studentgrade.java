import java.util.*;

public class Studentgrade {
    public static void main(String[] args) {
        System.out.println("-------------Student Grade Calculator------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Count of Subjects: ");
        int sub_count = scan.nextInt();
        int[] a = new int[sub_count]; 
        float total_marks = 0; 
        for(int i=0;i<sub_count;i++){
            System.out.println("Enter marks of subject " +(i+1)+ " is: " );
            a[i] = scan.nextInt();
             total_marks +=a[i];
        }
        System.out.println("Total marks of all "+sub_count+ " subjects is: "+total_marks);
        float avg_percent = total_marks/sub_count;
        System.out.println("Average percentage of Student: "+avg_percent);
        System.out.println("");
        System.out.println("~~~~~~~~~ Final Results of a student ~~~~~~~~~");
        System.out.println("");
        System.out.println("Count of Subjects: "+sub_count+" subjects");
        System.out.println("Total marks of all "+sub_count+ " subjects is: "+total_marks);
        System.out.println("Average percentage of Student: "+avg_percent+"%");
        if(avg_percent>=90){
            System.out.println("Outstanding Performance! Grade is A+");
        }
        else if(avg_percent>=80 && avg_percent<90){
            System.out.println("Good work! Grade is A");
        }
        else if(avg_percent>=70 && avg_percent<80){
            System.out.println("Keep going! Grade is B");
        }
        else if(avg_percent>=60 && avg_percent<70){
            System.out.println("Have the potential to grow! Grade is C");
        }
        else if(avg_percent>=50 && avg_percent<60){
            System.out.println("You can do better! Grade is D");
        }
        else if(avg_percent>=40 && avg_percent<50){
            System.out.println("There’s scope for improvement.! Grade is E");
        }
        else{
            System.out.println("More focus is required! Grade is F");
        }
        scan.close();
    
    }
}
