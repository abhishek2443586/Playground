//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int salary)
  {
    System.out.println("Base Salary: "+ salary);
		int cseSalary = salary + 3000;
		System.out.println("CSE Faculty: "+cseSalary);
		int itSalary = salary + 5000;
		System.out.println("IT Faculty: "+itSalary);
		int eceSalary = salary + 4500;
		System.out.println("ECE Faculty: "+eceSalary);
  }
}
class CSE extends Faculty
{
  
}
class IT extends Faculty
{
  
}
class ECE extends Faculty
{
  
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int baseSalary = s.nextInt();
    ECE obj = new ECE();
    obj.salary(baseSalary);
    //implement your required concept here
  }
}