package j04ProJava;

class Animal {
    public void eat() {
        System.out.println("Animal Food");
    }

    public static void main(String args[]) {
        // anonymous class
        Animal a = new Animal() {
            public void eat() {
                System.out.println("eat");
            }
        };
        a.eat();
    }

//    public static void main(String args[]) {
//        Animal a = new Dog();
//        a.eat();
//        a = new Cat();
//        a.eat();
//    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog Food");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat Food");
    }

}