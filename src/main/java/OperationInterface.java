public interface OperationInterface {
    Operation add(Operation o);

    Operation sub(Operation o);

    Operation mul(int m);

    Operation div(int d);

    int convertToPence();
}
