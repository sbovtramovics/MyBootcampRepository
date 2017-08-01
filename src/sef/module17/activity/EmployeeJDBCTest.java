package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		Employee e1 = emp.findEmployeeById("1");
		//assertEquals("John", e.getFirstName());
		//assertEquals("Doe", e.getLastName());
		//assertEquals(2500, e.getSalary());
		assertNull(e1);
		//complete the code here
	}

	public void testFindEmployeeById_NoMatchFound() {
		Employee a = emp.findEmployeeById("99");
		assertEquals("John", a.getFirstName());
		assertEquals("Doe", a.getLastName());
		assertEquals(2500, a.getSalary());
		//complete the code here
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		//complete the code here
		ArrayList<Employee> list = emp.findEmployeesByName("John");
		assertNotSame(0, list.size());
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		//complete the code here
		ArrayList<Employee> list = emp.findEmployeesByName("Smith");
		assertEquals(0, list.size());

		list = emp.findEmployeesByName("Doe");
		assertNotSame(0, list.size());
	}

	public void testFindEmployeeBySalary_MatchFound() {
		//complete the code here
		ArrayList<Employee> list = emp.findEmployeesBySalary(4900);
		assertNotSame(0, list.size());
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		//complete the code here
		ArrayList<Employee> list = emp.findEmployeesBySalary(9000);
		assertEquals(0, list.size());
	}
	
	public void testInsertEmployee(){
		//complete the code here
		
	}
}
