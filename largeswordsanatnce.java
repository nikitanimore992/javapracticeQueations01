
// public class largestwordsantance{
//     public static void main(String[] args){
//      String str = "hello i am nikita";
//      String[] word = str.split(" ");  
//      String lw = " ";
//      for (int i =0; i<word.lenght; i++){
//         for(int j =1+i; j<word[j].length; j++){
//             if(word[i].length()>=word[j].length()){
//                 lw = word[i];
//             }
//        }
       
//      }
//      System.out.println(lw + " longest word "+ lw.length()+" charater.");
//      System.out.println(rts.length());
//     }
// }
class largestwordsantance{   
   
  public static void main(String[] args){     
      String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
      String word = "", small = "", large="";    
      String[] words = new String[100];    
      int length = 0;    
      string = string + " ";    
          
      for(int i = 0; i < string.length(); i++){    
          if(string.charAt(i) != ' '){    
              word = word + string.charAt(i);    
          }    
          else{    
              words[length] = word;    
                
              length++;    
              
              word = "";    
          }    
     }            
      
     small = large = words[0];    
          
     
      for(int k = 0; k < length; k++){    
              
          
        //   if(small.length() > words[k].length())    
        //       small = words[k];    
   
            
          if(large.length() < words[k].length())    
              large = words[k];    
      }    
    //   System.out.println("Smallest word: " + small);    
      System.out.println("Largest word: " + large);    
 
    }  }  