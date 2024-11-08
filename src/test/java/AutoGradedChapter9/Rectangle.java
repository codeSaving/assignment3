package AutoGradedChapter9;

public class Rectangle {

        // Data fields
        private double width;
        private double height;

        // Default constructor
        public Rectangle() {
            this.width = 1;
            this.height = 2;
        }

        // Constructor with specified width and height
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Method to calculate area
        public double getArea() {
            return width * height;
        }

        // Method to calculate perimeter
        public double getPerimeter() {
            return 2 * (width + height);
        }

        // Getters for width and height
        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }
    }


