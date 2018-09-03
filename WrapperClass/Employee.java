package firstAssessment;

public class Employee {
	int empno;  
	String empname;  
	  
	Employee(int empno,String empname){  
	this.empno=empno;  
	this.empname=empname;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
	Employee e1=new Employee(1,"rahul");  
	System.out.println(e1.empno+" "+e1.empname);   
	Employee e2=(Employee)e1.clone();  
	  
	
	System.out.println(e2.empno+" "+e2.empname);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  
}
