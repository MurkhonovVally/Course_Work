public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private final int id;
    private static int idcounter = 1;
    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idcounter++;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "ID: " + this.id + " ФИО: " + this.fullName + " Отдел: " + this.department + " Зарплата: "+ this.salary;
    }
}
