public class Soal04 {

	public static void main(final String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Constants for hourly pay and allowances
	        double HOURLY_PAY = 30000;
	        double DESIGNER_ALLOWANCE = 600000;
		double PROGRAMMER_ALLOWANCE = 1200000;
	        double WRITER_ALLOWANCE = 400000;
	        double MARKETING_ALLOWANCE = 500000;
	
	        // Get input for job code and hours worked
	        String jobCode = scanner.next();
	        int hoursWorked = scanner.nextInt();
	
	        double allowance = 0;
	
	        // Determine allowance based on job code
	        switch (jobCode) {
	            case "DES":
	                allowance = DESIGNER_ALLOWANCE;
	                break;
	            case "PRG":
	                allowance = PROGRAMMER_ALLOWANCE;
	                break;
	            case "WRT":
	                allowance = WRITER_ALLOWANCE;
	                break;
	            case "MKT":
	                allowance = MARKETING_ALLOWANCE;
	                break;
	            default:
	                System.out.println("Invalid job code");
	                return;
	        }
	
	        // Calculate basic honor
	        double honor = hoursWorked * HOURLY_PAY;
	
	        // Calculate bonus
	        double bonus = 0;
	        if (hoursWorked > 175) {
	            bonus = honor * 0.07;
	        } else if (hoursWorked > 160) {
	            bonus = honor * 0.05;
	        }
	
	        // Total honor
	        double totalHonor = honor + allowance + bonus;
	
	        // Output the result
	        System.out.println("Total honor for the month: " + totalHonor);
	}
}
