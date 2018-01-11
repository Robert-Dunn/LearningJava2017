
public class DoPayrollTypeF {
	public static void main(String args[]) {
		FullTimeEmployee ftEmployee = new FullTimeEmployee();
		
		ftEmployee.setName("Adam Sandler");
		ftEmployee.setJobTitle("Comedian");
		ftEmployee.setWeeklySalary(5000.00);
		ftEmployee.setBenefitDeduction(400.00);
		ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
		System.out.println();
		
		PartTimeEmployee ptEmployee = new PartTimeEmployee();
		
		ptEmployee.setName("Jackie Chan");
		ptEmployee.setJobTitle("Martial Artist");
		ptEmployee.setHourlyRate(100.00);
		ptEmployee.cutCheck(ptEmployee.findPaymentAmount(13));
		
	}
}
