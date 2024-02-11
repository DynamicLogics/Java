package Customer;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Entity;


@Entity
public class Person
{
	private String Name;

	@Id
	private String Id;
	@OneToOne
	Address address;
	
	public Person()
	{
		super();
	}

	public Person(String name, String id, Address address)
	{
		super();
		Name = name;
		Id = id;
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}