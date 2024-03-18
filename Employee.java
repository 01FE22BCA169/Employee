class Employee{
    private String Ename;
    private String Eid;
    private double salary;

    public Employee(String Ename,String Eid,double salary){
        this.Ename=Ename;
        this.Eid=Eid;
        this.salary=salary;
    }
    
    public void displayEmployee(){
        System.out.print("Employee name" +Ename);
        System.out.print("Employee id" +Eid);
        System.out.print("Salary" +salary);
    }
    public static void main(String[] args){
        Employee E=new Employee("ABC","E1234",2000);
        E.displayEmployee();
    }
}