/*
Goal: the basics
printing
variables (and data types)
calculatons
conditionals (if, etc)
keyboard input
loops (for and while)

***NOTE***
We'll learn all of these topics (and more!)
in greater detail throughout Unit 1
*/

import java.util.Scanner;

class AllStuff {
  
    public static void main(String[] args){
        // printing-----------------------------
        System.out.print("prints with NO carriage return");
        System.out.println("(continued) this one prints, then new line");
        System.out.println("tabs \t\t\tsee?");
        System.out.println("new lines \n\n\nsee?\n");
        
        // variables------------------------------
        int myNum = 42;
        double myPi = 3.14;
        boolean myBoo = true;
        String myWords = "Hello!";  // must be double quotes
        char myLetter = 'E';        // single quotes
        System.out.println("a lot like Python! " + myNum);
        
        
        // math stuff--------------------------------
        //a lot like Python
        int ans = myNum*2;
        ans = 15 + 3;
        System.out.println(ans);
        ans = 24 / 5; 
        System.out.println(ans);

        // control structures--------------------------------
        if (myNum > 50){
            System.out.println("yep");
        }
        else{
            System.out.println("nope");
        }
        // must use parentheses
        // no 'elif', must write 'else if'

        // a note about braces in control structures
        // braces are optional if there is only one program statement
        // braces are required if there is more than one program statement

        // user input-------------------------------------
        // must import the Scanner class
        Scanner s = new Scanner(System.in);
        System.out.print("\n\ntype a positive integer (not too large): ");
        int max = s.nextInt(); // use nextLine() for strings
            
        // for loops---------------------------------------
        System.out.println("the factors of " + max + " are: ");
        for (int i = 1; i<max; i++){
            if (max % i == 0){
                System.out.println(i);
            }
        }



        
        int sum = 0;
        int num = 0;
        char more = 'y';
        // while loops----------------------------------------
        while (more == 'y'){
            System.out.println("\ntype a number: ");
            num = s.nextInt();
            sum = sum + num;
            System.out.println("more? type y to continue: ");
            more = s.next().charAt(0); // gets the first character of input
        }
        System.out.println("\nthe sum was " + sum);


    } // close main method
} // close Main class