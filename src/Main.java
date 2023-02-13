public class Main {
    public static void main(String[] args) {
        int[] sales = new int[] {4,3,1,5,3,7,5,1};
        SalesManager sm = new SalesManager(sales);
        System.out.println(sm.max());
        System.out.println(sm.mean());
    }
}
