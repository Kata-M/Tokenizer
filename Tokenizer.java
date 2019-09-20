import java.io.*;
import java.util.*;
import java.util.regex.*; 

class Tokenizer{ 

    public static void main(String args[]){ 

        //String fileName = "F-train146.txt";
        String s9 = "Today is a beautiful, nice summer day! ";
        String s8 = "The sun is shining, the birds are singing and the sky is as blue as the deep ocean. ";
        String s7 = "However, tomorrow there will be clouds coming our way - so we’d better enjoy the day today as good as we can. ";
        String s6 = "Hi! I am good. How about you?";

        String s = "Today is a beautiful, nice summer day! The sun is shining, the birds are singing and the sky is as blue as the deep ocean. However, tomorrow there will be clouds coming our way - so we’d better enjoy the day today as good as we can. ";


        String doc1 = "I like this assignment: it is fun.";
        String doc2 = "I won a prize, but I won’t be able to attend the ceremony.";
        String doc3 = " “The strange case of Dr. Jekyll and Mr. Hyde” is a famous book... but I haven’t read it.";
        String doc4 = "I work for the C.I.A., and you?";
        String doc5 = "OMG #Twitter is sooooo coooool <3 :-) <– lol...why do i write like this idk right? :) 😻👍";

        ArrayList<String> arrayS1 =new ArrayList<String>();//Creating arraylist.
        Pattern pattern = Pattern.compile("([\\w]+)|([\\W&&[^\\s]]) | ([\\w]?)+’[\\w]+");
        Matcher matcher = pattern.matcher(doc5);

        for(int i=1; matcher.find();i++){
             arrayS1.add(arrayS1.size(), matcher.group());
             //System.out.println("Token "+i+": "+ matcher.group());
        }
        System.out.println("ArrayS1 : "+arrayS1);


        //first version of the tokenizer. works for words but does not tokenize on all the punctuations.
        /*
        ArrayList<String> arrayS1 =new ArrayList<String>();//Creating arraylist.
        System.out.println("before : "+arrayS1);

        String temp =new String();//Creating arraylist to collect the word tokens.
       
        for(int i=0; i< s1.length(); i++){

            if(Character.compare(' ',s1.charAt(i)) == 0){
                arrayS1.add(arrayS1.size(), temp);
                temp = "";
            }else if(Character.compare('.',s1.charAt(i)) == 0){
                arrayS1.add(arrayS1.size(), ".");
                temp = "";
            }else if(Character.compare('!',s1.charAt(i)) == 0){
                arrayS1.add(arrayS1.size(), "!");
                temp = "";
            }
            else{
                    temp = temp + s1.charAt(i);
                    //System.out.println(temp);
            }
        }
        System.out.println("after : "+arrayS1);
        */
   }
 
     

} 
