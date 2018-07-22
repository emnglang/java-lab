package j04ProJava;

@FunctionalInterface
interface MathFunction {
    public int operation(int a, int b);
}

class Test {
    public static void main(String args[]) {
        MathFunction multiply = (a, b) -> a * b;
        MathFunction divide = (a, b) -> a / b;

        System.out.println("4 * 2 = " + multiply.operation(4, 2));
        System.out.println("4 / 2 = " + divide.operation(4, 2));
    }
}
