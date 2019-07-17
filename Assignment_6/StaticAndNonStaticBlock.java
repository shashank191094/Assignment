package consultadd.assignment;

public class StaticAndNonStaticBlock {
	
	private static int employeeId;
	private String employeeName;
	private String employeeRole;
	
	static {
		System.out.println("Static block called");
	}

	{
		 this.employeeName = "ABC";
		 System.out.println("Non static block called.");
		 System.out.println("Inside Non static block - Default Employee Name: " + this.employeeName);
	}
	
	public StaticAndNonStaticBlock(String employeeName, String employeeRole) {
		System.out.println("Constructor called");
		employeeId = 1;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
	}

	public static int getEmployeeId() {
		return employeeId;
	}

	public static void setEmployeeId(int employeeId) {
		StaticAndNonStaticBlock.employeeId = employeeId;
		System.out.println("Employee Id set to " + StaticAndNonStaticBlock.employeeId);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		System.out.println("Employee Name set to: " + employeeName);
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	
	
	
}
