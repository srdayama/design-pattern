package com.scp.Prototype;

public class Person  implements Cloneable{
         int id;
         String name;
         Address address;
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
		
		
		@Override
		protected Object clone() throws CloneNotSupportedException  {
			Person person = (Person) super.clone();
		     person.address =(Address) address.clone();
		      return person;
		}
		
		
		public Person(int id, String name, Address address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
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
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
         

	
}
