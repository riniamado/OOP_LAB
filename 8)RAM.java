class Cpu {
    int price;

    Cpu(int p) {
        this.price = p;
    }

    class Processor {
        int cores;
        String manufacture;

        Processor(int n, String man) {
            this.cores = n;
            this.manufacture = man;
        }

        void display() {
            System.out.println("No of Cores : " + this.cores);
            System.out.println("Processor manufactures : " + this.manufacture);
        }
    }

    static class Ram {
        int memory;
        String manufacture;

        Ram(int n, String man) {
            this.memory = n;
            this.manufacture = man;
        }

        void display() {
            System.out.println("Memory Size : " + this.memory);
            System.out.println("Memory manufactures : " + this.manufacture);
        }
    }

    void display() {
        System.out.println("Price of CPU : " + this.price);
    }

    public static void main(String[] args) {
        Cpu intel = new Cpu(56478);
        Cpu.Processor pross = intel.new Processor(49, "intel");
        Cpu.Ram ram = new Ram(10864, "Asus");
        intel.display();
        pross.display();
        ram.display();
    }
}
