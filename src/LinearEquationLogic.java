import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan;
    private String coord1;
    private String coord2;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double x;
    public LinearEquationLogic() {

        scan = new Scanner(System.in);
    }

    public void start () {
        System.out.println("Welcome to linear equation calculator!");
        System.out.println();
        getCoordInfo();
        program();
    }

    private void getCoordInfo() {
        System.out.print("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        coord2 = scan.nextLine();
        x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
        y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2, coord1.length()-1));
        x2 = Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",") + 2, coord2.length()-1));
        LinearEquation obj =  new LinearEquation(x1, y1, x2, y2);
        System.out.println();
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
        } else {
            System.out.println(obj.lineInfo());
            System.out.println();
            System.out.print("Enter a value for x: ");
            x = scan.nextDouble();
            scan.nextLine();
            System.out.println();
            System.out.println("The point on the line is: " + obj.coordinateForX(x));
        }
        System.out.println();
    }

    private void program() {
        String answer = "y";
        while (!answer.equals("n")) {
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            answer = scan.nextLine();
            System.out.println();
            if (answer.equals("y")) {
                getCoordInfo();
            }
        }
        System.out.println("Thank you for using slop calculator, goodbye!");
    }

}
