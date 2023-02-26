package w6.employeepolymorphism;

/**
 * Commisions.java
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-21
 */

public class Commissions extends Hourly{
    private double totalSales;
    private double commission_rate;
    
    public Commissions(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission_rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commission_rate = commission_rate;   
    }
    
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay() {
        double payment = super.pay() + totalSales * (commission_rate);
        
        totalSales = 0;
        
        return payment;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nCurrent total sales = " + totalSales;
        return result;
    }
}
