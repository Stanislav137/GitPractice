public class Main {
    static SayHello sayHello;
    public static void main(String[] args) {
        System.out.println("Start");
        sayHello = new SayHello();
        sayHello.sayHelloMethod();
    }
}
