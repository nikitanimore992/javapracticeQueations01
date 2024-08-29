 class Reverse{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};

        int lenght = sizeof(arr)/sizeof(arr[0]);
        System.out.println("Original Array : \n");
        for(int i=0; i<lenght; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse Order : \n");
        for(int i=lenght-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
 }