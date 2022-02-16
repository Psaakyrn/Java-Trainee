package oops;

class EmpTest{
	private int emp_id;
	private String name,dept;
	
	public void setEmp_id(int input) {
		emp_id = input;
	}
	public void setName(String input) {
		name = input;
	}
	public void setDept(String input) {
		dept = input;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
}

public class emp_bean {
	public static void main(String args[]) {
		EmpTest e = new EmpTest();
		e.setEmp_id(432);
		e.setName("tim");
		e.setDept("Demo");
		
		System.out.println("employee id: "+e.getEmp_id());
		System.out.println("employee name: "+e.getName());
		System.out.println("employee dept: "+e.getDept());
	}
}
