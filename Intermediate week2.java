
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        double grade = 85;
        int absent = 3;
        
        System.out.println("=====Grade Threshold Checker=====");
        System.out.println("Your Grade: " + grade);
        System.out.println("Your Absences: " + absent);
        if((grade >= 75 && absent <= 3) || grade >= 90) {
            System.out.println("Result: Pass ");
        } else { 
            System.out.println("Result: Fail ");
    }
        
}

}