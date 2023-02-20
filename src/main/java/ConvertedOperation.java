public class ConvertedOperation {
    public static Operation reconvert(int result) {
        int p = result / 240;
        int s = (result % 240) / 12;
        int d = (result % 240) % 12;
        return new Operation(p, s, d);

    }
}
