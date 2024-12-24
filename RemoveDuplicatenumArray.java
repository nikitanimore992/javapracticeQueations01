
import java.util.HashSet;
class RemoveDuplicatenumArray{
    public static void main(String[] args){


            int arr[] = {11,1,15,2,68,5,4,6,9,1,83,45};
            HashSet<Integer>set= new HashSet<>();
            for(int num : arr){
                set.add(num);
            }



            System.out.print(set);
    }
}