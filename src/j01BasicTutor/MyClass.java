package j01BasicTutor;

/* */

public class MyClass {

    private static String myClassName = "Charlie";

    private MyInnerClass inner = new MyInnerClass();


    public static void main(String[] args) {

        System.out.println("Hello: my name is " + myClassName);

    }

    public String toString() {
        return myClassName + inner.toString();
    }

    class MyInnerClass {

        private String myInnerName = "Munger";

        public String toString() {
            return this.myInnerName;
        }
    }
}
