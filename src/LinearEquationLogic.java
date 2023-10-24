import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan;
    private String coord1;
    private String coord2;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LinearEquationLogic() {
        scan = new Scanner(System.in);
    }

    public void start () {
        System.out.println("Welcome to linear equation calculator!");
    }

    private void getCoordInfo() {
        System.out.println("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        coord2 = scan.nextLine();
        x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(" ")));
        y1 = Integer.parseInt(coord1.substring(coord1.indexOf(","), coord1.length()-1));
        x2 = Integer.parseInt(coord2.substring(1,coord2.indexOf(" ")));
        y2 = Integer.parseInt(coord2.substring(coord2.indexOf(","), coord2.length()-1));
    }

}
