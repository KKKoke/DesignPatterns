public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        this.addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
