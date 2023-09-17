
    public class Rectangle {
        private double length;
        private double width;
        private int a;
        private int b;

        public Rectangle(double length, double width, int a, int b) {
            this.a = a;
            this.b = b;
            this.length = length;
            this.width = width;

        }

        public boolean isOverlapping(Rectangle other) {
            if (a < other.a + other.width && a + width > other.a && b < other.b + other.length && b + length > other.b) {
                return true;
            } else
                return false;
        }

        public void setLength(double length) {

            this.length = length;
        }

        public double getLength() {

            return length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getWidth() {

            return width;
        }

        public double calculateArea() {

            return length * width;
        }

        public double calculatePerimeter() {
            return 2 * (length + width);
        }

        public Rectangle getMinRect(Rectangle rec, Rectangle rectang) {
            if (rec.calculateArea() < rec.calculateArea())
                return rec;
            else
                return rectang;
        }

    }

