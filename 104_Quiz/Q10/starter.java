import java.util.*;
import java.io.*;

class starter{
    
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<String> last = new ArrayList<String>();
        ArrayList<String> first = new ArrayList<String>();
        
        System.out.println("What period are you in? (p1, p2, p3, p5)");
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        importFile(last, first, p + ".txt");
        
        System.out.println("File Imported!");
            System.out.println("--------Last Names--------");
            printArrayList(last);
            System.out.println();
            System.out.println("--------First Names--------");
            printArrayList(first);
        
        System.out.println();
        System.out.println("--------Sort L--------");
            System.out.println("--------Last Names--------");
            sortL(last);
            printArrayList(last);
            
            System.out.println("--------First Names--------");
            sortL(first);
            printArrayList(first);
        
        System.out.println();
        System.out.println("--------Sort A--------");
            System.out.println("--------Last Names--------");
            sortA(last);
            printArrayList(last);
            
            System.out.println("--------First Names--------");
            sortA(first);
            printArrayList(first);
        
        System.out.println();
        System.out.println("--------Sort V--------");
            System.out.println("--------Last Names--------");
            sortV(last);
            printArrayList(last);
            
            System.out.println("--------First Names--------");
            sortV(first);
            printArrayList(first);
        
    }
    
    public static void swapS(ArrayList<String> arr, int one, int two){
        
    }
    
    public static void swapI(ArrayList<Integer> arr, int one, int two){
        
    }
    
    public static void printArrayList(ArrayList<String> arr){
        
    }
    
    public static void sortL(ArrayList<String> arr){
        
    }
    
    public static void sortA(ArrayList<String> arr){
        
    }
    
    public static void sortV(ArrayList<String> arr){
        
    }
    
    public static int alpha(String letter){
        return Character.getNumericValue(letter.charAt(0))-9;
    }
    
    public static void importFile(ArrayList<String> last, ArrayList<String> first, String file) throws FileNotFoundException {
        File text = new File(file);
        Scanner sc = new Scanner(text);
        while(sc.hasNextLine()){
            String line = sc.next();
            last.add(line);
            String line2 = sc.next();
            first.add(line2);
		}
    }
}