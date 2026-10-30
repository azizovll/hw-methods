import java.util.Scanner;
public class studentGrader {
    public static void main(String[] args) throws Exception {
        System.out.println("Your score(the score should be between 0 and 100):");

        Scanner scanner = new Scanner(System.in);

        int scoreOfStudent= scanner.nextInt();

        for (int i = 0; i != 1;) {

            if (scoreOfStudent > 100 || scoreOfStudent < 0) {
            System.out.println("The score should be between 0 and 100. Your score:");
            scoreOfStudent = scanner.nextInt();
           

        }
        else{ i=1;}
            
        }
        System.out.println(calculateGrade(scoreOfStudent));
    }


    
    public static String calculateGrade(int score) {
       if (score >=90) {
        return "A";
        
       } else if (score >=80) {
        return "B";
        
       } 
     else if (score >=70) {
        return "C";
        
       } 
     else if (score >=60) {
        return "D";
        
       } 
    
        return "F";
    }
}