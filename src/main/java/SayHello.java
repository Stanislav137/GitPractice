public class SayHello {
    SayGoodbye sayGoodbye;
    public void sayHelloMethod() {
        System.out.println("hello");
        sayGoodbye = new SayGoodbye();
        sayGoodbye.sayGoodbye();
    }
}
