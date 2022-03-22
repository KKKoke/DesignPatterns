public class OperationDiv extends Operation {
    @Override
    public Double getResult() {
        Double result = 0D;
        if (getNumB() == 0) {
            System.out.println("除数不能够为零");
        }
        result = getNumA() / getNumB();
        return result;
    }
}
