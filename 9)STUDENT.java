public class student {
    int rollno;
    String name;
    int mark1;
    int mark2;
    int mark3;

    public student(int rn,String nm,int m1,int m2,int m3){
        this.rollno = rn;
        this.name = nmt;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3= m3;
    }
    public void disp(){
        System.out.println(this.rollno);
        System.out.println(this.name);
        System.out.println(this.mark1);
        System.out.println(this.mark2);
        System.out.println(this.mark3);
    }

    public int total(){
        int total  =  this.mark1 + this.mark2 + this.mark3;
        return total;
    }
    public static void main(String[] args) {
        student s1 =new student(1,"Amitha",98,929,3);
        student s2 =new student(2,"Ben",91,90,93);
        student s3 =new student(3,"Colin",91,82,73);


        if(s1.total() >= s2.total() && s1.total() >= s3.total()){
            System.out.println("Highest scored by : " + s1.name);
        }
        if(s2.total() >= s1.total() && s2.total() >= s3.total()){
            System.out.println("Highest scored by : " + s2.name);
        }
        if(s3.total() >= s2.total() && s3.total() >= s1.total()){
            System.out.println("Highest scored by : " + s3.name);
        }

    }
}