// Differences you'll see in Java:
// any imports must be at the top
// variables must be assigned a type, this type cannot change
// math operations depend on the type of variable / data
// methods can be defined in any order

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
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
        for(int i = 0; i<1000; i++){
            a = (int)(Math.random()*21) - 10;
            b = (int)(Math.random()*21) - 10;
            c = (int)(Math.random()*21) - 10;
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
        int children = 0;
        char child = ' ';
        int num = 0;
        int count = 0;
        while(child != 'b'){
            num = (int)(Math.random()*2) + 1;
            if(num==1) child = 'b';
            else child = 'g';
            count += 1;
        }
        return count;

    } // close function


} // close class