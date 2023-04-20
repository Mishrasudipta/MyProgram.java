// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MyProgram
{
public static void main(String[] args)
    {
        int x = 10;
        int y = 0;
        try 
        {
         System.out.println(x/y);  //throw Exception   
        
        }
        catch(ArithmeticException e)
        {
            //Exception handler
            System.out.println("Divided by zero operation cannot possible");
        }
    }
}