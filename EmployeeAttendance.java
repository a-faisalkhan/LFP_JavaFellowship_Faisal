public class EmployeeAttendance {
	public static void main (String [] args){
		int PRESENT=1;
		int Absent=0;
		int isPresent=(int) (Math.random()*2);
		
		System.out.println(isPresent);
		if (isPresent==PRESENT) {
			System.out.println("Employee is Present");
		}
			else {
				System.out.println("Employee is Absent");
		}
		
	}
	
}