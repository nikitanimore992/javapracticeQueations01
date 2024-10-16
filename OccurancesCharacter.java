


public class OccurancesCharacter{
    public static void main(String args[]){
        String str = "Automationaa";
        char ch = 'a';
        int count = 0;
        for(char c : str.toCharArray()){
            if(c==ch)count++;
        }
        System.out.println(count);
    }
}