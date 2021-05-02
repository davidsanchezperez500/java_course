class Circle {

    double radius;

    // write methods here
    public double getLength(){
        double Length = 2 * Math.PI * radius;
        return Length;
    }
    public double getArea(){
        double Area = Math.PI * (radius * radius);
        return Area;
    }
}