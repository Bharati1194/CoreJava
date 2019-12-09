/**
 * 
 */
package practicesession;

/**
 * @author RAVIKANTH
 *
 */
public class PartTimeEmployee extends Employee {

	public double CalcSalary() {
		double sal = 0;
		PartTimeEmployee p = new PartTimeEmployee();
		sal = p.getBasic() + p.getAllowance() + 500 - p.getDeductions();
		return sal;
	}

}
