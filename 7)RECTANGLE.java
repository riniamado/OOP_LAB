import java.util.*;

class rectangle {
    double width;
    double length;
    double area;
    String color;

   

   public void rectangle(double w, double l, String c) {
        this.width = w;
        this.length = l;
        this.area = w * l;
        this.color = c;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter color : ");
        this.color = sc.nextLine();
        System.out.println("Enter length : ");
        this.length = sc.nextDouble();
        System.out.println("Enter width : ");
        this.width = sc.nextDouble();

        this.area = this.length * this.width;
        System.out.println("-----------------------------------------");
        
    }

    public String find_color() {
        System.out.println(" The color is : " +this.color);
        return this.color;
    }

    public double find_area() {
        System.out.println("The area is: "+this.area);
        return this.area;
    }

    public static void main(String[] args) {
        rectangle rectangle_1 = new rectangle();
        rectangle rectangle_2 = new rectangle();
        rectangle_1.read();
        rectangle_2.read();
        if ((rectangle_1.find_area() == rectangle_2.find_area()) && (rectangle_1.find_color().equals(rectangle_2.find_color()))) {
            System.out.println("MATCHING RECTANGLES");
        } else {
            System.out.println("NON MATCHING RECTANGLES");
        }

    }
}
