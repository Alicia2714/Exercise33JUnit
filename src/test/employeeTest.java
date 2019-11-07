package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.exercise33empleado.model.employee;

class employeeTest {

	@Test
	void testCalculateBrute1() {
		//fail("Not yet implemented");
		employee myEmployee = new employee();
		//System.out.println("Brute Salary:"+myEmployee.calculateBruteSalary("salesEmployee", 0, 0));
		
		double actualValue=myEmployee.calculateBrute("salesEmployee", 0, 0);
		double expectedValue = 1000.0;
		assertEquals(expectedValue, actualValue);
		
	}

}
