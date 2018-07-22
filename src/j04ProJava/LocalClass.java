package j04ProJava;

public class LocalClass {
    private int n = 5;

    void result() {
        // Local inner class
        class Cube {
            int calc() {
                return n * n * n;
            }
        }

        Cube c = new Cube();
        System.out.println(c.calc());
    }

    public static void main(String args[]) {
        LocalClass lc = new LocalClass();
        lc.result();
    }
}