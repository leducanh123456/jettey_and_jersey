package testjettyembedet;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employees")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
		System.out.println("chạy vào đây");
		return new ArrayList<Employee>(EmployeeService.getAllEmployees().values());
	}

	@GET
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("employeeId") long empId) {
		return EmployeeService.getEmployee(empId);
	}
	
	@GET
	@Path("/{employeeId}/{emp}")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployees(@PathParam("employeeId") long empId, @PathParam("emp") long emp) {
		return EmployeeService.getEmployee(empId);
	}

}