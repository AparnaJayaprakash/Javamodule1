package oopsday4.composition;

import java.util.Objects;

public class Employee extends Person {
	                  // is - a relationship
	private long empId;
	private String deptno;
	private double salary;
	private Address residenceAddress;    // has - a relationship         this is a composition
	private Address correspondanceAddress;      //has - a relationship
	

	public Employee() {

	}

	

	public Employee(String name, String gender, int age, long empId, String deptno, double salary, Address residenceAddress, Address correspondanceAddress) {
		super(name, gender, age);
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondanceAddress = correspondanceAddress;
	}



	public Address getResidenceAddress() {
		return residenceAddress;
	}



	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}



	public Address getCorrespondanceAddress() {
		return correspondanceAddress;
	}



	public void setCorrespondanceAddress(Address correspondanceAddress) {
		this.correspondanceAddress = correspondanceAddress;
	}



	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * Employee ref = null; if (obj != null) ref = (Employee) obj; if (this.empId ==
	 * ref.empId && this.getName().equals(ref.getName()) && this.deptno ==
	 * ref.getDeptno()) return true; else return false; }
	 * 
	 * @Override public int hashCode() { int code = this.hashCode() * 32 * ((int)
	 * this.empId) * (this.getName().length()) * this.deptno.length();
	 * 
	 * return super.hashCode(); }
	 */

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + ", residenceAddress="
				+ residenceAddress + ", correspondanceAddress=" + correspondanceAddress + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(deptno, empId, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empId == other.empId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	

}
