import java.util.*;
public class SortedArray {
    public static void main(String[] args) {
    ArrayList<Integer> arrayInput = new ArrayList<>();
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter size of the array - ");  
        int a= sc.nextInt(); 
        for(int i=1; i<=a; i++){
            arrayInput.add(sc.nextInt());
        } 
        for(int i=0; i<a-1; i++){
            if(arrayInput.get(i)>arrayInput.get(i+1)){
                System.out.println("No");
            }
        } 
        System.out.println("Yes5");


    }
}
