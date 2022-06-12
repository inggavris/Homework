package ro.siit.BubbleSort;

public class SalesRepresentative {
    private int sales;
    private int quota;
    public SalesRepresentative (int sales, int quota) {
            this.sales = sales;
            this.quota = quota;
    }

    public int computeRevenue () {
        int revenue = sales * quota;
        return revenue;
    }
}
