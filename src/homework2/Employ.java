package homework2;
public class Employ {
private String name; 
private   int rate;
private   int hours;
static int totalSum;
	public Employ (){
		name="";
		rate=0;
	}
	public Employ (int rate,String name){
	}
	public Employ (int rate,String name,int hours){
		this.rate=rate;
		this.name=name;
		this.hours=hours;
	}
	public   int getSalary() {
		int p=getRate()*getHours();
		return p;
	}
	public int changeRate(int rate) {
		this.rate=rate;
		return rate;
	}	
	public double getBonuses() {
		double k=(double) (getSalary()*0.10);
		return k;
	}	
			public  static void main(String[]args) {
			Employ emp = new Employ(2,"nake",3);
			Employ dcp = new Employ(5,"snake",8);
			Employ mrt = new Employ(7,"nike",9);
			
			System.out.println("ZP-pershogo " + emp.getSalary());
			System.out.println(emp.toString());
			System.out.println("bonus-pershogo " +emp.getBonuses());
			System.out.println("ZP-drugogo " +dcp.getSalary());
			System.out.println("bonus-drugogo " +dcp.getBonuses());
			System.out.println("ZP-tretego " +mrt.getSalary());	
			System.out.println("bonus-tretogo " +mrt.getBonuses());
			System.out.println(totalSum=(int) (emp.getSalary()+emp.getBonuses()+dcp.getSalary()+dcp.getBonuses()+mrt.getSalary()+mrt.getBonuses()));
	}
		public void setHours(int hours) {
			this.hours = hours;
		}
		public void setName(String name) {
			this.name = name;
		}
		public   int getRate() {
			return rate;
		}
		public void setRate(int rate) {
			this.rate = rate;
		}
		public   int getHours() {
			return hours;
		}
		@Override
		public String toString() {
			return "Employ [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
		}
		public static int getTotalSum() {
			return totalSum;
		}
		public static void setTotalSum(int totalSum) {
			Employ.totalSum = totalSum;
		}	
 	}

