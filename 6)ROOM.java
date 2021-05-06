import java.util.*;

class room {
    String room_no;
    String room_type;
    int room_area;

    
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room no : ");
        this.room_no = sc.nextLine();
        System.out.print("Enter room type : ");
        this.room_type = sc.nextLine();
        System.out.print("Enter room area : ");
        this.room_area = sc.nextInt();
    }

    public void display() {
        System.out.println("No : " ,room_no);
        System.out.println("Type : ",room_type);
        System.out.println("Area : ",room_area);
    }
}    
claas main()
{
    public static void main(String[] args) {
        room room_1 = new room();
        room_1.read();
        room_1.display();

        room room_2 = new room();
        room_2.read();
        room_2.display();
    }
}
