public class Triangle {
    private double slide1, slide2, slide3;
    public Triangle(double slide1, double slide2, double slide3){
        setSlide1(slide1);
        setSlide2(slide2);
        setSlide3(slide3);
    }

    public double getSlide1() {
        return slide1;
    }
    public void setSlide1(double slide1){
        this.slide1 = slide1;
    }
    public double getSlide2(){
        return slide2;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide3(){
        return slide3;
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }

    public boolean checkEquilateral(){
        return slide1 == slide2 && slide2 == slide3;
    }

    public boolean checkIsosceles() {
        return slide1 == slide2 || slide1 == slide3 || slide2 == slide3;
    }

    public boolean checkRightTriangle(){
        return ((slide1 * slide1 + slide2 * slide2 == slide3 * slide3) || (slide2 * slide2 + slide3 * slide3 == slide1 * slide1) || (slide1 * slide1 + slide3 * slide3 == slide2 * slide2));
    }

    public String verifyTriangle(){
        String type = "";
        if((slide1 + slide2 > slide3) && (slide1 + slide3 > slide2) && (slide2 + slide3 > slide1)){
            if(checkEquilateral()){
                type = "Equilateral";

            }else if(checkIsosceles()){
                type = "Isosceles";

            }else if(checkRightTriangle()){
                type = "Right Triangle";

            }else{
                type = "Scalene";

            }
        }else{
            type = "Not Triangle";

        }
        return type;
    }

    public static void main(String[] args){
        Triangle triangle1 = new Triangle(3, 5, 7);
        System.out.println(triangle1.verifyTriangle());

        Triangle triangle2 = new Triangle(3, 3, 3);
        System.out.println(triangle2.verifyTriangle());

        Triangle triangle3 = new Triangle(4, 4, 7);
        System.out.println(triangle3.verifyTriangle());

        Triangle triangle4 = new Triangle(3, 3, 7);
        System.out.println(triangle4.verifyTriangle());

        Triangle triangle5 = new Triangle(3, 4, 5);
        System.out.println(triangle5.verifyTriangle());
    }
}
