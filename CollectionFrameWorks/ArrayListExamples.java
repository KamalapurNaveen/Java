import java.util.ArrayList;
import java.util.List;



public class  ArrayListExamples{
    public static void main(String[] args){
        List<Integer> lst1=new ArrayList<>();
        // It is always good to create a object of List i.e interface  type
        lst1.add(1); 
        // here even if we are adding 1 which is primitive type ,complier converts int to Wrapper Class
        // this process is called INBOXING
                       
        lst1.add(2);
        lst1.add(3);
        System.out.println(lst1); // [1, 2, 3]
        // you can use normal for loop or for each loop to traverse the list
        for(int i=0;i<lst1.size();i++){
            System.out.print(lst1.get(i));
        }
        System.out.println();
        for (int val:lst1){
            // HERE WE ARE USIG INT VAL I.E PRIMITIVE TYPE BUT OUR ARRAYLIST IS OF TYPE INTEGER CLASS
            // JAVA COMPLIER INTERNALLY CONVERTS INTEGER TO INT 
            // THIS PROCESS IS CALLED OUTBOXING
            System.out.print(val);
        }
        System.out.println();
        // IF WE WANT TO CREATE A COPY OF OUR ARRAY 
        List<Integer> copiedList=new ArrayList<>(lst1);
        // copiedList contains all the elements of lst1 and both has different references
        List<Integer> clst=lst1;
        // here just reference of lst1 is assigned to clst 
        // and if we change the values in clst ,those will be reflected in  original list i.e lst
        System.out.println(lst1.size()); // method to print the size of the arraylist
        
        // TO GET LAST ELEMENT OF THE LIST
        System.out.println(lst1.get(lst1.size()-1)); // It might give a Runtime error if list is empty
        
    }
}