class complex {
    int real;
    int imaginary;

    public complex(int rel,int img){
        this.real = rel;
        this.imaginary = img;
    }
    public static complex sum(complex c1,complex c2){
        complex temp = new complex(0,0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
}
class main(){
    public static void main(String []args){
        complex first = new complex(1,2);
        complex second = new complex(32,22);
        complex temp = sum(first,second);
        System.out.println("Sum is : " + temp.real + "+" +temp.imaginary + "i");
    }
}    
    
