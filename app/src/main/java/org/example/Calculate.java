package org.example;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }
    public int sumall(int x, int y) {
        for (int i = x; i<y; i++){
            a += i;
        }
        return a;
    }

    public int sumodd(int x,int y){
        for (int i = x; i<y; i++){
            if(i%2 == 0){
                a += i;
            }
        }
        return a;
    }

    public int sumeven(int x,int y){
        for (int i = x; i<y; i++){
            if(i%2 == 1){
                a += i;
            }
        }
        return a;
    }
    
    public int average(int x, int y){
        return sum(x, y)/2;
    }
    public int averageall(int x, int y){
        return sumall(x, y)/(y-x);
    }    

    public String andsum(int x,int y){
        args = "Sum of " + x + " and "+ y +" is " + sum(x,y) + ". Average is "+ average(x, y)+ ".";
        return args;
    }

    public String tosum(int x, int y){
        args =  "Sum of " + x + " to "+ y +" is " + sumall(x,y) + ". Average is "+ averageall(x, y)+ ".";
    }

    public String oddsum(int x, int y){
        args =  "Sum of odd of" + x + " to "+ y +" is " + sumodd(x,y) + ". Sum of even is "+ sumeven(x, y)+ ".";
    }

}