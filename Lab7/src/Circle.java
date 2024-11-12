class Circle extends Shape {
    int radius;
    double area;
    double perimeter;

    void calculateArea() {
        this.area = Math.PI * this.radius * this.radius;
        System.out.println("The area of the circle is " + this.area);
    }

    void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
        System.out.println("The perimeter of the circle is " + this.perimeter);
    }

}
