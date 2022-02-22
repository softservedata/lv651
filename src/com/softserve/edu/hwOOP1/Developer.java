package com.softserve.edu.hwOOP1;


	public class Developer extends Employee{

	
			
		public Developer() {
			super();
					}

		

		public Developer(String name, int age, double salary) {
			super(name, age, salary);
			
		}



		@Override
		public String report() {
			return ("Name is " + name + ", age is " + age + ", salary is " + salary);
		}

		}

	
