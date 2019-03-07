
public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String address;
	
	public Employee(int id, String name, String address) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
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
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return (this.id - emp.id);
	}

}
