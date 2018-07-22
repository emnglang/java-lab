package j04ProJava;

class OuterClass {
    // Static nested class
    public static class NestedStaticClass {
        public void print() {
            System.out.println("Message from nested static class");
        }
    }

    public static void main(String args[]) {
        // create instance of nested Static class
        OuterClass.NestedStaticClass sc = new OuterClass.NestedStaticClass();

        // call non static method of nested static class
        sc.print();
    }
}