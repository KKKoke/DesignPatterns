public class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior() {
        System.out.println("具体装饰对象B添加的方法");
    }
}