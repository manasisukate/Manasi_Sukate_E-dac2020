package employeepayrollproject;
import java.util.Scanner;

class AddEmployee
{
    int employeeId;
    String name;
    String address;
    String city;
    int pincode;
    long mobileNo;
    String designation;
    long bankAcc;
    String className;
    int salary;

    AddEmployee()
    {
        employeeId=0;
        name=null;
        address=null;
        city=null;
        pincode=0;
        mobileNo=0;
        designation=null;
        bankAcc=0;
        className=null;
    }
    
    AddEmployee(int employeeId,String name,String address,String city,int pincode,long mobileNo,String designation,long bankAcc,String className,int salary)
    {
        this.employeeId=employeeId;
        this.name=name;
        this.address=address;
        this.city=city;
        this.pincode=pincode;
        this.mobileNo=mobileNo;
        this.designation=designation;
        this.bankAcc=bankAcc;
        this.className=className;
        this.salary=salary;
    }
}

public class EmployeePayroll {
    int basic_sal;
    int DA,HRA,TA,MA;
    static int total=0;
    int addClassFunc(String className)
    {
        

        if(className.equals("classI"))
        {
            basic_sal=10000;
            HRA=(basic_sal*16)/100;
            DA=(basic_sal*20)/100;
            MA=(basic_sal*6)/100;
            TA=(basic_sal*4)/100;
            total=basic_sal+HRA+DA+MA+TA;
            return total;
        }
        else if(className.equals("classII"))
        {
            basic_sal=20000;
            HRA=(basic_sal*24)/100;
            DA=(basic_sal*30)/100;
            MA=(basic_sal*12)/100;
            TA=(basic_sal*8)/100;
            total=basic_sal+HRA+DA+MA+TA;
            return total;
        }
        else if(className.equals("classIII"))
        {
            basic_sal=30000;
            HRA=(basic_sal*30)/100;
            DA=(basic_sal*35)/100;
            MA=(basic_sal*20)/100;
            TA=(basic_sal*10)/100;
            total=basic_sal+HRA+DA+MA+TA;
            return total;
        }
        else
        {
            System.out.println("No class found....");
            return 0;
        }
    }
    
    void display(int i,AddEmployee emp[])
    {
            System.out.println("Employee Id :"+emp[i].employeeId);
            System.out.println("Employee Name :"+emp[i].name);
            System.out.println("Address :"+emp[i].address);
            System.out.println("City :"+emp[i].city);
            System.out.println("Pincode :"+emp[i].pincode);
            System.out.println("Mobile number :"+emp[i].mobileNo);
            System.out.println("Designation :"+emp[i].designation);
            System.out.println("Bank account number :"+emp[i].bankAcc);
            System.out.println("Class Name :"+emp[i].className);
            System.out.println("Gross Salary :"+emp[i].salary);
            System.out.println("-------------------------------------------------");
            
        
    }
    
    double calculateNetsal(int i,AddEmployee emp[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee Id :"+emp[i].employeeId);
        
        double total=0.0;
        double daily,gst,leave;
        int leaveDay;
        
        int temp=emp[i].salary;
        daily=(temp)/30;
        System.out.println("Enter the no of day for leave :");
        leaveDay=sc.nextInt();
        leave=leaveDay*daily;
        gst=temp*0.18;
               
        total=emp[i].salary-(leave+gst);
        return total;
    }
    
   
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        EmployeePayroll e=new EmployeePayroll();
        System.out.println("*******************Employee Payroll Management System***************");
        String username="";
        String password="";
        System.out.print("Enter username :");
        username = sc.nextLine();
        System.out.print("Enter password :");
        password = sc.nextLine();
        if(username.equals("admin") && password.equals("admin"))
        {
           System.out.println("Login succeessfully!!!");
           int ch;
           int pincode,employeeId=0;
           int empNo = 0;
           String name,address,city,className,designation,ans;
           long mobileNo,bankAcc;
           AddEmployee emp[]=new AddEmployee[20];
           do{
           System.out.println("1.Add an employee\n2.Dispaly all employees\n3.Search an employee\n4.Generate a report\n5.Delete an employee\n6.Total annual salary");
           System.out.println("Enter your choice :");
           ch=Integer.parseInt(sc.nextLine());
            
           switch(ch)
           {
               
               case 1:   
                
                    empNo=empNo+1;    
                    employeeId=employeeId+1;

                    System.out.print("Enter name of employee :");
                    name=sc.nextLine();

                    System.out.print("Enter address :");
                    address=sc.nextLine();
                    
                    System.out.print("Enter the city :");
                    city=sc.nextLine();

                    System.out.print("Enter pincode :");
                    pincode=Integer.parseInt(sc.nextLine());

                    System.out.print("Enter mobile no :");
                    mobileNo=Long.parseLong(sc.nextLine());

                    System.out.print("Enter designation :");
                    designation=sc.nextLine();


                    System.out.print("Enter bank account number:");
                    bankAcc=Long.parseLong(sc.nextLine());

                    System.out.print("Enter the class(I/II/III) :");
                    className=sc.nextLine();

                    int salary=e.addClassFunc(className);

                    //System.out.println("Employee Id :"+employeeId);
                    emp[empNo]=new AddEmployee(employeeId,name,address,city,pincode,mobileNo,designation,bankAcc,className,salary);

                
                break;
           
            case 2:
                
                for(int i=1;i<=empNo;i++)
                {
                     e.display(i, emp);
                }
                break;
            
            case 3:
            
                System.out.println("Enter the employee id :");
                int id=sc.nextInt();
                int temp = 0;
                boolean flag=false;
                for(int i=1;i<=empNo;i++)
                {
                    if(id==emp[i].employeeId)
                    {
                        temp=i;
                        flag=true;
                    }  
                }
                if(flag==true)
                {
                    e.display(temp, emp);
                    sc.nextLine();
                }
                else
                {
                    System.out.println("Employee not found !!!");
                }
                break;
            
            case 4:           
                System.out.println("Enter the employee id :");
                int emp_id=sc.nextInt();
                 int tem = 0;
                boolean f=false;
                for(int i=1;i<=empNo;i++)
                {
                    if(emp_id==emp[i].employeeId)
                    {
                        tem=i;
                        f=true;
                    }  
                }
                if(f==true)
                {
                    double netSalary;
                    netSalary=e.calculateNetsal(tem, emp);
                    System.out.println("Net salary :"+netSalary);
                    sc.nextLine();
                }
                else
                {
                    System.out.println("Employee not found !!!");
                }
                break;
                
            case 5:  
            
                Scanner s=new Scanner(System.in);
                System.out.print("Enter the name of employee :");

                String emp_name=s.nextLine();

                int pos=0;
                if(emp_name!=null)
                {
                    for(int i=1;i<=empNo;i++)
                    {
                       if(emp[i].name.equalsIgnoreCase(emp_name))  
                       {
                           pos=i;
                           break;
                       }
                    }
                    for(int j=pos;j<empNo-1;j++)
                    {
                        emp[j]=emp[j+1];
                    }
                    empNo--;
                    System.out.println("Employee deleted successfully...");
                }         
                else
                {
                   System.out.println("Employee does not exists.");
                }
                break;

            case 6 :
            double total_salary = 0;
            for(int k=1;k<=empNo;k++)
            {
                total_salary=total_salary+emp[k].salary;
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Total annual salary of all employees is "+(total_salary*12));
            System.out.println("----------------------------------------------------------------------");
            break;
            
            case 7:
                System.out.println("Invalid choice...");
        }
          
           System.out.println("Do you want to continue(y/n) :");
           ans=sc.nextLine();
        }while(ans.charAt(0)=='y' ||ans.charAt(0)=='Y');
    }
        else
        {
            System.out.println("Please try again...");
        }
    }
}
