package tnesprit.Model;
import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="Customer")

public class Customer implements Serializable{
	
private static final long serialVersionUID=-3009157732242241606L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;

@Column(name="Name", nullable=false)
private String name;

@Column(name="LastName", nullable=false)
private String lastname;

@Column(name="email", nullable=false) 
private String email;

@Column(name="password", nullable=false)
private String password;

@Column(name="phone", nullable=false)
private int tel;

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", password="
			+ password + ", tel=" + tel + "]";
}


public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getLastname() {
	return lastname;
}



public void setLastname(String lastname) {
	this.lastname = lastname;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public int getTel() {
	return tel;
}



public void setTel(int tel) {
	this.tel = tel;
}



public Customer(int id, String name, String lastname, String email, String password, int tel) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.tel = tel;
}

public Customer() {}






}