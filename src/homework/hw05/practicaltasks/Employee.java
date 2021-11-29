package homework.hw05.practicaltasks;

public class Employee {
	
	private String name;
	private int dnum;
	private float salary;
	
	public Employee() {
		this.name = "";
		this.dnum = 0;
		this.salary = 0;
	}
	
	public Employee(String name, int dnum, float salary) {
		this.name = name;
		this.dnum = dnum;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDnum() {
		return dnum;
	}

	public void setDnum(int dnum) {
		this.dnum = dnum;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department number=" + dnum + ", salary=" + salary + "]";
	}
}
