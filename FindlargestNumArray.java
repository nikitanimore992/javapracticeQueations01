class FindlargestNumArray{
    public static void main(String[] args){
       int arr[]={1,2,3,4,5,6,12,18,20};
       int larg = arr[0];
       for(int num:arr){
        if(num>larg){
        larg= num; 
} } 
     System.out.println(larg);
   }
}