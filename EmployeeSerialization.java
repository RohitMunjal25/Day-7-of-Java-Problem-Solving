import java.io.*;

class Employee implements Serializable {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "rohit");
        Employee e2 = new Employee(2, "ravi");

        try {
            FileOutputStream fos = new FileOutputStream("employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        
            oos.writeObject(e1);
            oos.writeObject(e2);
            System.out.println(" Employees serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
