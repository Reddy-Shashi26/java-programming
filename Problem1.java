public class Problem1 {

    public static void calculateMinimumPower(int x, int y, int p) {
        int minPower = Integer.MAX_VALUE;
        
        // Calculate the minimum power needed
        for (int i = 0; i <= p / 100; i++) {
            int remainingCustomers = p - (i * 100);
            int missionNCount = (remainingCustomers + 3) / 4; // Round up to cover all customers
            
            int currentPower = (i * x) + (missionNCount * y);
            minPower = Math.min(minPower, currentPower);
        }
        
        // Output the result
        System.out.println("Minimum Power Consumption: " + minPower);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        int p = 108;

        calculateMinimumPower(x, y, p);
    }
}
