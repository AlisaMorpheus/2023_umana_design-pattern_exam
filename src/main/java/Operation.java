public class Operation implements OperationInterface {
    private int p;
    private int s;
    private int d;

    public Operation(int p, int s, int d) {
        this.p = p;
        this.s = s;
        this.d = d;
    }

    @Override
    public Operation add(Operation o) {
        int result = this.convertToPence() + o.convertToPence();
        return ConvertedOperation.reconvert(result);
    }

    @Override
    public Operation sub(Operation o) {
        int result = this.convertToPence() - o.convertToPence();
        return ConvertedOperation.reconvert(result);
    }

    @Override
    public Operation mul(int m) {
        int result = this.convertToPence() * m;
        return ConvertedOperation.reconvert(result);
    }

    @Override
    public Operation div(int d) {
        int result = this.convertToPence() / d;
        return ConvertedOperation.reconvert(result);
    }

    @Override
    public int convertToPence() {

        return this.p * 240 + this.s * 12 + this.d;
    }

    @Override
    public String toString() {
        return p + "p " +
                s + "s " +
                d + "d";
    }
}
