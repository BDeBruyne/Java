
public class VowelCounter {
	public int[][] vowelCount;
    VowelCounter(){
        vowelCount = new int[2][5];
    }
    public void processLine(String text)
    {        
        for(int i=0;i<text.length();i++)
        {          
            switch (text.charAt(i))
            {                
                case 'a': vowelCount[0][0]++; break;
                case 'e': vowelCount[0][1]++; break;
                case 'i': vowelCount[0][2]++; break;
                case 'o': vowelCount[0][3]++; break;
                case 'u': vowelCount[0][4]++; break;
                
                case 'A': vowelCount[1][0]++; break;
                case 'E': vowelCount[1][1]++; break;
                case 'I': vowelCount[1][2]++; break;
                case 'O': vowelCount[1][3]++; break;
                case 'U': vowelCount[1][4]++; break;
            }
        }
    }
    public void printSummary()
    {
        
        System.out.println("A: "+vowelCount[0][0]+" lowercase, "+vowelCount[1][0]+" uppercase, "+(vowelCount[0][0]+vowelCount[1][0])+" total");
        System.out.println("E: "+vowelCount[0][1]+" lowercase, "+vowelCount[1][1]+" uppercase, "+(vowelCount[0][1]+vowelCount[1][1])+" total");
        System.out.println("I: "+vowelCount[0][2]+" lowercase, "+vowelCount[1][2]+" uppercase, "+(vowelCount[0][2]+vowelCount[1][2])+" total");
        System.out.println("O: "+vowelCount[0][3]+" lowercase, "+vowelCount[1][3]+" uppercase, "+(vowelCount[0][3]+vowelCount[1][3])+" total");
        System.out.println("U: "+vowelCount[0][4]+" lowercase, "+vowelCount[1][4]+" uppercase, "+(vowelCount[0][4]+vowelCount[1][4])+" total");
    }
	

}
