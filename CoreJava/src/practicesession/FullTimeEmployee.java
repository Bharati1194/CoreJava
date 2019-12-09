/**
 * 
 */
package practicesession;

/**
 * @author RAVIKANTH
 *
 */
public class FullTimeEmployee extends Employee {

	public double CalcSalary() {
		double sal = 0;
		PartTimeEmployee p = new PartTimeEmployee();
		sal = p.getBasic() + p.getAllowance() + 1000 - p.getDeductions();
		return sal;
	}


}
