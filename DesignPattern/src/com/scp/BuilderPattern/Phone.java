package com.scp.BuilderPattern;

public class Phone {
	private int id;
	private String Os;
	private double price;

	public boolean bleutooth;
	public String isSecured;

	public Phone(Mobile mob){
		this.id = mob.id;
		this.Os = mob.Os;
		this.price = mob.price;
		this.bleutooth=mob.bleutooth;
		this.isSecured=mob.isSecured;
	
		
	}
	

	@Override
	public String toString() {
		return "\nPhone [id=" + id + ", Os=" + Os + ", price=" + price + ", bleutooth=" + bleutooth + ", isSecured="
				+ isSecured + "]";
	}


	public int getId() {
		return id;
	}

	public String getOs() {
		return Os;
	}

	public double getPrice() {
		return price;
	}

	public boolean isBleutooth() {
		return bleutooth;
	}

	public String isSecured() {
		return "";
	}

	public static class Mobile {
		private int id;
		private String Os;
		private double price;
		
		public boolean bleutooth;
		public String isSecured;

		public Mobile(int id, String os, double price) {
			this.id = id;
			this.Os = os;
			this.price = price;
			
		}

		public Mobile setBleutooth(boolean bleutooth) {
			this.bleutooth=bleutooth;
			return this;
		}

		public Mobile setSecured(String isSecured) {
			this.isSecured=isSecured;
			return this;
		}

		public Phone build() {
			return new Phone(this);
		}

	}

}
