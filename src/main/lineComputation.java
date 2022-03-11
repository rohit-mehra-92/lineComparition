package main;

public class lineComputation {

            public Double length (double x1, double y1, double x2, double y2){
                return Math.pow(Math.pow(x2-x1,2)* Math.pow(y2-y1,2),0.5);
            }
}
