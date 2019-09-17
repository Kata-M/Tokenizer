import java.io.*;
import java.util.*;
import java.util.regex.*; 

class Tokenizer{ 

    public static void main(String args[]){ 

        //String fileName = "F-train146.txt";
        String s1 = "Today is a beautiful, nice summer day! ";
        String s2 = "The sun is shining, the birds are singing and the sky is as blue as the deep ocean.  ";
        String s3 = "However, tomorrow there will be clouds coming our way - so we’d better enjoy the day today as good as we can. ";
        
        System.out.println(s1);

        System.out.println("testMethod: "+ RemoveDuplicates(s2));

        ArrayList<String> arrayS1 =new ArrayList<String>();//Creating arraylist.
        //arrayS1.add(0,"test array");
        //arrayS1.add(1,"test array 2");
        //arrayS1.add(2,"test array 3");
        System.out.println("beofre : "+arrayS1);

        String temp =new String();//Creating arraylist to collect the word tokens.
       
        for(int i=0; i< s1.length(); i++){

            if(Character.compare(' ',s1.charAt(i)) == 0){
                arrayS1.add(arrayS1.size(), temp);
                temp = "";
            }else{
                    temp = temp + s1.charAt(i);
                    System.out.println(temp);
            }
        }
        System.out.println("after : "+arrayS1);
 
    } 

} 
