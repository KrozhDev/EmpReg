public class Main {
    public static void main(String[] args) {
        long[] sales = new long[] {4,3,1,5,3,7,5,1};
        SalesManager sm = new SalesManager(sales);
        System.out.println(sm.max());
        System.out.println(sm.mean());
    }
}
