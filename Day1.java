import java.util.Random;

public class Day1{
    public static void main(String[] args){
        // a penny a day
        int total = 0;
        int today = 1;
        for(int i=1; i<=30; i++){
            total += today;
            today *= 2;
        } // close loop
        System.out.println("total is " + total);

        // infinite sum
        // concepts: integer division, variable types, cannot redefine variable
        double total2 = 0;
        double term = 1;
        for(int i=1; i<=50; i++){
            total2 += term;
            term /= 2;
        } // close loop
        System.out.println(total2);


        // quadratic formula
        // import *must* be at top
        Random myRand = new Random();
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
        for(int i = 0; i<1000; i++){
            a = myRand.nextInt(21) - 10;
            b = myRand.nextInt(21) - 10;
            c = myRand.nextInt(21) - 10;
            if(b*b-4*a*c >= 0){
                count += 1;
            }
        } // close loop
        System.out.println(count);




        // one child policy
        // lists (arrays) are messy
        System.out.println(experiment());


    } // close main

    public static int experiment(){
        Random r = new Random();
        int children = 0;
        char child = ' ';
        int num = 0;
        int count = 0;
        while(child != 'b'){
            num = r.nextInt(2)+1;
            if(num==1) child = 'b';
            else child = 'g';
            count += 1;
        }
        return count;

    } // close function


} // close class