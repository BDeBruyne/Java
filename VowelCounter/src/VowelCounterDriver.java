import java.util.Scanner;
public class VowelCounterDriver {
    public static void main(String[] args)
    {       
        Scanner scanner=new Scanner(System.in);        
        VowelCounter counter = new VowelCounter();

        
        while(true)
        {
            System.out.println("Enter a line of characters (press enter by itself to quit): ");
            String text = scanner.nextLine();
            
            counter.processLine(text);
            if(text.equals(""))
            {             
                counter.printSummary();
                break;
            }
        }
    }
}
