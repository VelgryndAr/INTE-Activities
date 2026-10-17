
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        byte num = 127;
        num++;
        System.out.println("=====Byte OverFlow=====");
        System.out.println(num);
        
        
        String str1 = "Real";
        String str2 = "Real";
        String str3 = "Fake";
        
        
        System.out.println("======String Comparison======");
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals (str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals (str3));
        
        // because first and second is same value that's why its true.
        // third is different value that's why its false
        
        System.out.println("=====Array Reference=====");
        int[] array = {10,20,30};
        int[] array1 = array;
        
        array1[0] = 45;
        System.out.println(array1[0]);
        
        
        
        
        
        
        
        
    }
}
