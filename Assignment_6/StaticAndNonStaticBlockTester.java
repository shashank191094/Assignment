package consultadd.assignment;

public class StaticAndNonStaticBlockTester {

	public static void main(String[] args) {
		
		StaticAndNonStaticBlock block = new StaticAndNonStaticBlock("John", "Manager");
		
		StaticAndNonStaticBlock.setEmployeeId(5);
		block.setEmployeeName("Dustin");
		System.out.println("Employee Role: " + block.getEmployeeRole());
	
	}

}
