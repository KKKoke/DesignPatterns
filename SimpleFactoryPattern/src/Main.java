public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumA(1.00);
        operation.setNumB(3.00);
        Double result = operation.getResult();
        System.out.println(result);
    }
}
