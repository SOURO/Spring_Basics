package com.aspectOrientedProgramming;

public class aspectOrientedProgrammingExample {
		private String name;
		private String id;
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		public void setId(String id) {
			this.id = id;
		}
	 
		public void printName() {
			System.out.println("Employee name : " + this.name);
		}
	 
		public void printID() {
			System.out.println("Employee ID : " + this.id);
		}
		public void printThrowException() {
			throw new IllegalArgumentException();
		}
}
