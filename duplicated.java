public class duplicated {
    public static void main(String[] args) {
            
        //Initialize array   
        int [] arr = new int [] {1, 4, 1, 5};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        
            
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                    arr[j]+=1;
                 //   System.out.println((arr[j]));  

                } 
                   // System.out.println(arr[j]);  
            }  
        }  

        for (int i : arr) {
            System.out.println("the arry");
            System.out.print(i);
            
        }
    
    }  
 
}
