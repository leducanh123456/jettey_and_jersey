package testjettyembedet;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
	private static Map<Long, Employee> employees = new HashMap<Long, Employee>();

	static {
		initializeEmployees();
	}

	private static void initializeEmployees() {
		Address tempAddr1 = new Address("Electronic City", "Bangalore", "Karnataka", "India");
		Address tempAddr2 = new Address("BTM Layout", "Bangalore", "Karnataka", "India");
		Address permAddr1 = new Address("Marthali", "Bangalore", "Karnataka", "India");
		Address permAddr2 = new Address("Bharath Nagar", "Hyderabad", "Andhra Pradesh", "India");

		Employee emp1 = new Employee("Hari Krishna", "Gurram", 1, permAddr1, tempAddr1);
		Employee emp2 = new Employee("PTR", "PTR", 2, permAddr2, tempAddr2);

		employees.put(1l, emp1);
		employees.put(2l, emp2);
	}

	public static Map<Long, Employee> getAllEmployees() {
		return employees;
	}

	public static Employee getEmployee(long id) {
		return employees.get(id);
	}
}