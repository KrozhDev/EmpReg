public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale: sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int mean() {
        int sum = 0;
        for (int sale: sales) {
            sum += sale;
        }
        sum -= this.min();
        sum -= this.max();
        return sum/(this.sales.length - 2);
    }
}

