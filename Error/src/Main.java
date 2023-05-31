public class Main {
    public static void main(String[] args) {
        try {
            long[] l = new long[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught an OutOfMemoryError: " + e.getMessage());
        }
    }
}