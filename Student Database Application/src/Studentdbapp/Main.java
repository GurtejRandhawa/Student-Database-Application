package Studentdbapp;
import java.util.*;
class Studentdata
{
	Scanner mp=new Scanner(System.in);
	int year,i;
	int fee=3000;
	int deposited;
	int balance=0;
	int chk=0;
	int students;
	int studentyear[]=new int[100];
	int studentrollno[]=new int[100];
	int b[]=new int[100];
	
	String subject1="Math , Physics and Research";
	String subject2="Java , Python and Electronics";
	String subject3="CSA , Advance Java and C sharp";
	String subject4="Mooc , Web and Electrical";
	
	Studentdata(int students)
	{
		this.students=students;
	}
	
	
	
	public void data(int j)
	{
		int rollno;
		System.out.println("Enter Student's Roll Number: ");
		rollno=mp.nextInt();
		System.out.println("Enter Student's Year: ");
		year=mp.nextInt();
		
		if(year==1)
		{
			System.out.println(subject1+" are the subjects for the"+" "+year+"st year");
			System.out.println("Fees for the above subjects = Rs 3000");
			System.out.println("Enter fees money to be paid");
			deposited=mp.nextInt();
			studentyear[j]=year;
			if(deposited==fee)
			{
				System.out.println("Full fees received");
				chk=1;
				b[j]=balance;
			}
			else
			{
				System.out.println("Rs"+deposited+" Received");
				balance=fee-deposited;
				System.out.println("Balance to be paid: Rs "+balance);
				chk=1;
				b[j]=balance;
			}
			if(chk==1)
			{
				studentrollno[j]=rollno;
				System.out.println("Student Data Saved!!");
				System.out.println();
			}
		}
			
			 if(year==2)
			{
				System.out.println(subject2+" are the subjects for the"+" "+year+"st year");
				System.out.println("Fees for the above subjects = Rs 3000");
				System.out.println("Enter fees money to be paid");
				deposited=mp.nextInt();
				studentyear[j]=year;
				if(deposited==fee)
				{
					System.out.println("Full fees received");
					chk=1;
					b[j]=balance;
				}
				else
				{
					System.out.println("Rs"+deposited+" Received");
					balance=fee-deposited;
					System.out.println("Balance to be paid: Rs "+balance);
					chk=1;
					b[j]=balance;
				}
				if(chk==1)
				{
					studentrollno[j]=rollno;
					System.out.println("Student Data Saved!!");
					System.out.println();
				}
			}
			 
			 if(year==3)
				{
					System.out.println(subject3+" are the subjects for the"+" "+year+"st year");
					System.out.println("Fees for the above subjects = Rs 3000");
					System.out.println("Enter fees money to be paid");
					deposited=mp.nextInt();
					studentyear[j]=year;
					if(deposited==fee)
					{
						System.out.println("Full fees received");
						chk=1;
						b[j]=balance;
					}
					else
					{
						System.out.println("Rs"+deposited+" Received");
						balance=fee-deposited;
						System.out.println("Balance to be paid: Rs "+balance);
						chk=1;
						b[j]=balance;
					}
					if(chk==1)
					{
						studentrollno[j]=rollno;
						System.out.println("Student Data Saved!!");
						System.out.println();
					}
				}
			 
			 if(year==4)
				{
					System.out.println(subject4+" are the subjects for the"+" "+year+"st year");
					System.out.println("Fees for the above subjects = Rs 3000");
					System.out.println("Enter fees money to be paid:-");
					deposited=mp.nextInt();
					studentyear[j]=year;
					if(deposited==fee)
					{
						System.out.println("Full fees received");
						chk=1;
						b[j]=balance;
					}
					else
					{
						System.out.println("Rs"+deposited+" Received");
						balance=fee-deposited;
						System.out.println("Balance to be paid: Rs "+balance);
						chk=1;
						b[j]=balance;
					}
					if(chk==1)
					{
						studentrollno[j]=rollno;
						System.out.println("Student Data Saved!!");
						System.out.println();
					}
				}
			
	}
	public void showdata(int students)
	{
		for (int i=0;i<students;i++)
		{
			System.out.println();
			System.out.println("Student's Roll No:-  Students Year:-  Fees Balance:-");
			System.out.print("  "+studentrollno[i]+"             "+studentyear[i]+"                 "+b[i]);
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
	public void exit()
	{
		System.out.println("***THANK YOU***");
	}
	
}
public class Main 
{

	public static void main(String[] args) 
	{
		int students,i,choice=0,ck=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		students=sc.nextInt();
		Studentdata obj=new Studentdata(students);
		for(i=0;i<students;i++)
		{
			obj.data(i);
		}
		System.out.println("Enter 1 to  See Database OR Enter 0 to exit");
		choice=sc.nextInt();
		sc.close();
		if(choice==1)
		{
			obj.showdata(students);
		}
		if(choice==0)
		{
			obj.exit();
			ck=1;
		}
		if(ck==0)
		 obj.exit();
	}
}


