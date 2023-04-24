package exercise;

import static java.lang.Double.compare;

// BEGIN
public class Flat implements Home, Comparable<Home> {
        private double area;
        private double balconyArea;
        private int floor;

        public Flat(double area, double balconyArea, int floor) {
                this.area = area;
                this.balconyArea = balconyArea;
                this.floor = floor;
        }

        public Flat() {
        }

        @Override
        public double getArea() {
                return area + balconyArea;
        }

        @Override
        public double compareTo() {
                return 0;
        }

        @Override
        public int compareTo(Home another) {
                return compare(getArea(), another.getArea());
        }

        public String toString() {
                return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
        }

}

// END
