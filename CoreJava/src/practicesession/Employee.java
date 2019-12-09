package practicesession;

public class Employee {
	
	
	public Employee(){}
	
	public Employee(double basic,double allowance,double deductions){
		this.basic=basic;
		this.allowance=allowance;
		this.deductions=deductions;
	}
	
	Employee e = new Employee(0.0,0.0,0.0);
	public double CalcSalary()
	{
		sal= e.basic+e.allowance-e.deductions;
		return sal;
	}
	
	private int empId;
	private double sal = 0;
	private double basic;
	private double allowance;
	private double deductions;
	private String firstName;
	private String lastName;
	private String address;
	private String pincode;
	private String realName;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}
	
	/**
	 * @return the basic
	 */
	public double getBasic() {
		return basic;
	}
	/**
	 * @param basic the basic to set
	 */
	public void setBasic(double basic) {
		this.basic = basic;
	}
	/**
	 * @return the allowance
	 */
	public double getAllowance() {
		return allowance;
	}
	/**
	 * @param allowance the allowance to set
	 */
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	/**
	 * @return the deductions
	 */
	public double getDeductions() {
		return deductions;
	}
	/**
	 * @param deductions the deductions to set
	 */
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName=firstName+lastName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	
	
}