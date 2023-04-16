//Index of the largest element


import java.util.*;

class LargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayInput = new ArrayList<>();
        Scanner sc= new Scanner(System.in);  
        System.out.print( "Enter size of the array - ");  
        int a= sc.nextInt(); 
        for(int i=1; i<=a; i++){
            arrayInput.add(sc.nextInt());
        } 

       int largestElement = 0;
       int indexOfLargestElement = 0;

       for (int i=0; i<arrayInput.size(); i++){
        if(arrayInput.get(i)>largestElement){
            largestElement = arrayInput.get(i);
            indexOfLargestElement = i+1;
        }
       }
       System.out.println("index of largest element is:"+indexOfLargestElement);
    }
}
