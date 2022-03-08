import  java.util.*;
class Assign_1
{ 
 
   int rollno,age;
   float cgpa;
   String name;
   long phno;
   void read(Assign_1 s)
   {
    Scanner in = new Scanner(System.in);
    System.out.println("Name(all in uppercase):");
    this.name=in.nextLine();
    System.out.println("Roll No.:");
    this.rollno=in.nextInt();
    System.out.println("Age:");
    this.age=in.nextInt();
    System.out.println("Phone No.:");
    this.phno=in.nextLong();
    System.out.println("CGPA:");
    this.cgpa=in.nextFloat();
    System.out.println("----------------------------------------------------");
    }
   Assign_1()
  {
    read(this);
   }
}

//main 
class studentTen
{
 public static void main (String args[])
 {
  int l=0,i,n=0,a=0,o=50;
  float r=0;
  Assign_1[] s=new Assign_1[10];
  for ( i=0;i<10;i++)
  { 
  s[i]=new Assign_1();
  }
  for (i=0;i<10;i++)
  { 
  if (s[i].cgpa>r)//cgpa
  {
    r=s[i].cgpa; 
    l=i;
   }
   if((s[i].name.compareTo("ANU"))==0)//finding name
  {
   n=i;
   }
  if(s[i].age<o)//younger one
  {
   o=s[i].age;
   a=i;
  }
  }
  System.out.println("Name of student with highest CGPA---"+s[l].name);
  System.out.println("Ph.no. of ANU---"+s[n].phno);
  System.out.println("Roll no. of youngest student---"+s[a].rollno);
 }
}