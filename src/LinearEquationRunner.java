import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        int x1 = -1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 10;
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("Distance: " + equation.distance());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println(equation.equation());
    }
}
