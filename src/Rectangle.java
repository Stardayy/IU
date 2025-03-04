public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0){
            this.length = 1;
            System.out.println("Error");
        }else{
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 1;
            System.out.println("Error");
        }else{
            this.width = width;
        }
    }

    public void displayRectangle(){
        for(int i = 0; i < length; ++i){
            for(int j = 0; j < width; ++j){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        Rectangle rtn = new Rectangle(5, 6);
        rtn.displayRectangle();
        Rectangle rtn1 = new Rectangle(5, -1);
        rtn1.displayRectangle();
    }
}