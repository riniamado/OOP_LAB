import java.util.*;

class room {
    int room_no;
    String room_type;
    int room_area;

    public room(){
		this.room_no = 1;
		this.room_type = "kitchen";
		this.room_area = 53753;
	}
    public room(int rn,String rt,int ra){
		this.room_no = rn;
		this.room_type = rt;
		this.room_area = ra;
	}
   

    
    

    public void disp() {
        System.out.println("No : " +this.room_no);
        System.out.println("Type : "+this.room_type);
        System.out.println("Area : "+this.room_area);
        System.out.println("-------------------------------------------");
        
    }


   


    public static void main(String[] args) {
        room room_1 = new room();
        
        room_1.disp();
        
        room room_2=new room(2,"Dinning hall",35636);
        
        room_2.disp();

        
    }
}

