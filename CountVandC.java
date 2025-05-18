public class CountVandC{
    public static void main(String[] args){

           String str = "nikita";
            int v = 0, con = 0;

            for(char c:str.toCharArray()){
                if("aeiouAEIOU".indexOf(c)!=-1){
                    v++;

                }else if(Character.isLetter(c)){
                    con++;
                }
           }
                System.out.println("vowel : "+v+" , consonats : "+con);
        }

}