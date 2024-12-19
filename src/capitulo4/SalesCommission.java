package capitulo4;


public class SalesCommission {
    private int week;
    private double commission = 0.09;
    private double totalSales;
    private int item;
    private int valueItem;


    public SalesCommission(int week, double commission, double totalSales, int item, int valueItem){
        this.week = week;
        this.commission = commission;
        this. totalSales = totalSales;
        this.item = item;
        this.valueItem = valueItem;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getValueItem() {
        return valueItem;
    }

    public void setValueItem(int valueItem) {
        this.valueItem = valueItem;
    }
}
