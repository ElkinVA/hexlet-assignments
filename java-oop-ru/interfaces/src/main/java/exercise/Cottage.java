package exercise;

import static java.lang.Double.compare;

// BEGIN
public class Cottage implements Home, Comparable<Home> {

    private double area;

    private int floorCount;



    public Cottage(double area, int floorCount) {

        this.area = area;

        this.floorCount = floorCount;

    }



    public double getArea() {

        return area;

    }

    @Override
    public double compareTo() {
        return 0;
    }


    public int getFloorCount() {

        return floorCount;

    }



    public String toString() {

        return floorCount + " этажный коттедж площадью " + area + " метров";

    }

    public int compareTo(Home another) {
        return compare(getArea(), another.getArea());
    }

}

// END
