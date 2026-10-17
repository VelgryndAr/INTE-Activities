
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        double balance = 100;
        
        System.out.println("=====Compound Growth=====")
        balance += 50;
        System.out.println("After Adding: " + balance);
        balance += 20;
        System.out.println("After Adding Again: " + balance);
        balance *= 2;
        System.out.println("After Multiplication: " + balance);
        
        System.out.println("======Increment Tracker======")
        int count = 10;
        
        //Post-Increment print value first and increase it.
        System.out.println("Post-Increment: " + count++);
        System.out.println("After Increment: " + count);
        
        System.out.println("Pre-Increment: " + ++count);
        System.out.println("after Increment: " + count);
    }
}
