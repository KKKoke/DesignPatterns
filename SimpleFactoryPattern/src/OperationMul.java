public class OperationMul extends Operation {
    @Override
    public Double getResult() {
        Double result = 0D;
        result = getNumA() * getNumB();
        return result;
    }
}
