 class product {
    String pcode;
    String pname;
    int price;

    public product(String pc, String pnam, int pri) {
        pcode = pc;
        pname = pnam;
        price = pri;
    }
     
 }    
class main(){
    public int get_price() {
        return price;
    }

    public static void main(String[] args) {
        product p_1 = new product("1", "TV", 25);
        product p_2 = new product("2", "FAN", 291);
        product p_3 = new product("3", "SPEAKER", 753);

        if (p_1.price <= p_3.price && p_1.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_1.pcode);
        if (p_3.price <= p_1.price && p_3.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_3.pcode);
        if (p_2.price <= p_3.price && p_2.price <= p_1.price) 
            System.out.println("Lowest product ID is  : " + p_2.pcode);

    }
}    
