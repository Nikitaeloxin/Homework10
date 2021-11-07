import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Biology");
        words.add("Geografy");
        words.add("Astronomy");
        words.add("Tractor");

        int indexBuf = (int)(Math.random()*(words.size()-1));
        String guesLetter;
        Scanner in = new Scanner(System.in);
        char [] buffer = words.get(indexBuf).toCharArray();
        int count = 0;

        for(int i = 0; i <words.get(indexBuf).length();i++ ){
            buffer[i] = '_';
        }
        
        char [] wordBuf = words.get(indexBuf).toCharArray();
        
        while (buffer != words.get(indexBuf).toCharArray() || count != 5){
            guesLetter = in.next();
            char[] chGuesLetter = guesLetter.toCharArray();

            for(int i = 0; i <words.get(indexBuf).length();i++ ){
                if (chGuesLetter[0] == words.get(indexBuf).charAt(i)){
                    buffer[i] = chGuesLetter[0];        
                }
                else {
                    count++;
                }
                       
            }
            

        } 

        System.out.println(buffer);

    }
}
