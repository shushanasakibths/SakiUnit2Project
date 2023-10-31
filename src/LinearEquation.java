public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double xDistance;
    private double yDistance;
    public LinearEquation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        xDistance = x2 - x1;
        yDistance = y2 - y1;
    }

    public double roundToHundredth(double num) {
        return (double) Math.round(num * 100) / 100;
    }
    public double distance() {
        double insideRadical = Math.pow(xDistance, 2) + Math.pow(yDistance, 2);
        double distance  = Math.sqrt(insideRadical);
        return roundToHundredth(distance);
    }

    public double slope() {
        double slope = yDistance / xDistance;
        return roundToHundredth(slope);
    }

    public double yIntercept() {
        return y1 - (slope() * x1);
    }

    public String equation() {
        String equation = "";
        if (yIntercept() == 0 && slope() == 0) {
            return "y = 0";
        }
        if (yIntercept() == 0) {
            if (yDistance / xDistance == 1) {
                return  "y = " + "x";
            } else if ( yDistance / xDistance == -1 ) {
                return  "y = -x";
            } else if ((yDistance / xDistance) % 1 == 0) {
                return "y = " + ((int) yDistance / (int) xDistance) + "x";
            } else if (xDistance < 0 && yDistance < 0) {
                return "y = -" + ((int) yDistance * -1) + "/" + ((int) xDistance * -1) + "x";
            } else if (xDistance < 0) {
                return "y = -" + (int) yDistance + "/" + ((int) xDistance * -1) + "x";
            } else {
                return "y = " + (int) yDistance + "/" + (int) xDistance + "x";
            }
        }
        if (slope() == 0) {
            return "y = " + yIntercept();
        }
        if (yIntercept() >= 0) {
            if (yDistance / xDistance == 1) {
                equation = "y = " + "x" + " + " + yIntercept();
            } else if ( yDistance / xDistance == -1 ) {
                equation = "y = -x" + " + " + yIntercept();
            } else if ((yDistance / xDistance) % 1 == 0) {
                equation = "y = " + "x" + " + " + yIntercept();
            } else if (xDistance < 0 && yDistance < 0) {
                equation = "y = " + ((int) yDistance * -1) + "/" + ((int) xDistance * -1) + "x" + " + " + yIntercept();
            } else if (xDistance < 0) {
                equation = "y = -" + (int) yDistance + "/" + ((int) xDistance * -1) + "x" + " + " + yIntercept();
            } else {
                equation =  "y = " + (int) yDistance + "/" + (int) xDistance + "x" + " + " + yIntercept();
            }
        } else if (yIntercept() < 0) {
            if (yDistance / xDistance == 1) {
                equation = "y = " + "x" + " + " + yIntercept();
            } else if ( yDistance / xDistance == -1 ) {
                equation = "y = -x" + " + " + yIntercept();
            } else if ((yDistance / xDistance) % 1 == 0) {
                equation = "y = " + ((int) yDistance / (int) xDistance) + "x " + "- " + (yIntercept() * -1);
            } else if (xDistance < 0 && yDistance < 0) {
                equation = "y = " + ((int) yDistance * -1) + "/" + ((int) xDistance * -1) + "x" + "- " + (yIntercept() * -1);
            } else if (xDistance < 0) {
                equation = "y = -" + (int) yDistance + "/" + ((int) xDistance * -1) + "x " + "- " + (yIntercept() * -1);
            } else {
                equation = "y = " + (int) yDistance + "/" + (int) xDistance + "x " + "- " + (yIntercept() * -1);
            }
        }
        return equation;
    }

    public String coordinateForX(double x) {
        double yPoint = roundToHundredth(slope() * x + yIntercept());
        return "(" + x + ", " + yPoint + ")";
    }

    public String lineInfo() {
        String lineInfo = "The two points are: (" + (int) x1 + ", " + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ")\n";
        lineInfo += "The equation of the line between these points is: " + equation() + "\n";
        lineInfo += "The slope of this line is: " + slope() + "\n";
        lineInfo += "The y-intercept of this line is: " + yIntercept() + "\n";
        lineInfo += "The distance between these points is " + distance();
        return lineInfo;
    }

}
