import java.io.*;
import java.util.*;
public class noofvowels{
    public static void main(String[] args){
        try{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        char[] arr = str.toCharArray();
        char[] c = {'A','E','I','O','U','a','e','i','o','u'};
        int l = str.length();
        int vowel = 0;
        for(int i=0;i<l;i++){
            if(Character.isDigit(arr[i])){
                System.out.println("You have given a wrong input ,only string acceptable");
                break;
            }else{
            for(int j=0;j<10;j++){
                if(arr[i]==c[j]){
                    vowel = vowel+1;
                }
            }}
        }
        if(vowel!=0){
        System.out.println("No of vowels : "+vowel);}
    }catch(Exception e){
        System.out.println("You have given a wrong input, please recheck");
    }
    }
}
