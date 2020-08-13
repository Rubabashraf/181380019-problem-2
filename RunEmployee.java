public class RunEmployee{
	public static void main(String[] args) {
		Employee[] e=new Employee[6];

		e[0]=new SalariedEmployee( 1, "Asad",12.12, 23222.00);
		e[1]=new SalariedEmployee(2, "Momna",2.12, 222.00);
		e[2]=new HourlyEmployee(6,"ali", 1.123,2.0,12.22);
		e[3]=new HourlyEmployee(3,"mona", 1.123,9.0,7.22);
		e[4]=new CommissionedEmployee( 4,"saba",1.3,676.00,5.5);
		e[5]=new CommissionedEmployee(5,"Abdullah",6.3,555.00,8.5);

		for (int i=0;i < e.length ; i++) {
			System.out.println(e[i].toString());
			
		}
	}
}