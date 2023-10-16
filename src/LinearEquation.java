public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public LinearEquation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double round(double num) {
        double roundNum = (double) Math.round(num * 100) / 100;
        return roundNum;
    }
    public double distance() {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        double insideRadical = Math.pow(xDistance, 2) + Math.pow(yDistance, 2);
        double distance  = Math.sqrt(insideRadical);
        return round(distance);
    }

    public double slope() {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        double slope = yDistance / xDistance;
        return round(slope);
    }

    public double yIntercept() {
        double yInt = y1;
        if (x1 < 0) {
            while (x1 != 0 ) {
                yInt += slope();
                x1 += 1;
            }
        } else if (x1 > 0) {
            while (x1 != 0) {
                yInt -= slope();
                x1 -= 1;
            }
        } else {
            yInt = y1;
        }
        return round(yInt);
    }

    public String equation() {
        String fractionSlope  = slope() + "";
        int integer = fractionSlope.indexOf(".");
        int decimal = fractionSlope.length() - integer - 1;
        return integer  + " " + decimal ;
    }


}
