package w6.employeepolymorphism;

/**
 * Firm.java
 * @author Salsabil Khoirunisa
 * Demonstrates polymorphism via inherintance.
 */
public class Firm {

    /**
     * Creates a staff of employees for a firm and pays them.
     */
    
    public static void main(String[] args) {
        Staff personnel = new Staff();
        
        personnel.payday();
    }
    
}
