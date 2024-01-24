/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemowin21;

import java.util.Scanner;

/**
 *
 * @author krima
 */
public class ArrayDemoWin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter word");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for(int i=0;i<myLetters.length;i++){
            myLetters[i]=myWord.charAt(i);
            /*
            sheridan
            myLetters[0] = s
            myLetters[1] = h
            myLetters[2] = e
            myLetters[3] = r
            myLetters[4] = i
            myLetters[5] = d
            myLetters[6] = a
            myLetters[7] = n
            */
        }
        System.out.println("printing in reverse");
        for(int i=myLetters.length-1; i>=0; i--){
            System.out.println(myLetters[i]);
        }
    }
    
}
    
    

