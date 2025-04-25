import java.io.*;
public class EmployeeDeserialization {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            FileInputStream fin=new FileInputStream("employee.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
            Employee e1=(Employee)ois.readObject();
            Employee e2=(Employee)ois.readObject();
            System.out.println("Employee id:"+" "+e1.getEmpId()+" "+"Employee name:"+" "+e1.getEmpName());
            System.out.println("employee id:"+" "+e2.getEmpId()+" "+"employee name:"+" "+e2.getEmpName());


        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
