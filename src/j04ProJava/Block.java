package j04ProJava;

class Block {
    static {
        System.out.println("static block executed");
    }

    Block() {
        System.out.println("constructor executed");
    }

    public static void main(String args[]) {
        new Block();
        System.out.println("main method executed");
    }
}
