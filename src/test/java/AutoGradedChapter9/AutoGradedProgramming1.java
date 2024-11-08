package AutoGradedChapter9;

public class AutoGradedProgramming1 {
    /*
    Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent
     a rectangle. The class contains:

Two data fields named width and height.
A constructor that creates a rectangle with the specified width and height. The default values are 1 and 2 for
the width and height, respectively.
A method named getArea() that returns the area of this rectangle.
A method named getPerimeter() that returns the perimeter.
Implement the class. Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the
other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
     */


    public class Rectangle {
        private double width;
        private double height;
        public Rectangle() {
            this.width = 1;
            this.height = 2;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double getArea() {
            return width * height;
        }
        public double getPerimeter() {
            return 2 * (width + height);
        }
    }










}
