public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Cотрудник 1",  1,  100000);
        employees[1] = new Employee("Сотрудник 2",  2,  200000);
        employees[2] = new Employee("Сотрудник 3",  3,  300000);
        employees[3] = new Employee("Сотрудник 4",  4,  400000);
        employees[4] = new Employee("Сотрудник 5",  5,  500000);
        employees[5] = new Employee("Сотрудник 6",  1,  600000);
        employees[6] = new Employee("Сотрудник 7",  2,  700000);
        employees[7] = new Employee("Сотрудник 8",  3,  800000);
        employees[8] = new Employee("Сотрудник 9",  4,  900000);
        employees[9] = new Employee("Сотрудник 10", 5,  1000000);
        AllData();
        AllMoney();
        MinSalary();
        MaxSalary();
        AverageSalary();
        AllName();
    }
    private static void AllData() {          //Все данные о сотруднике, отделе и зарплате
        for (Employee employee : employees) {
            if (employee !=null) {
                System.out.println(employee);
            }
        }
    }
    private static void AllMoney() {          //Сумма зарплат всех сотрудников
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Общая сумма зарплат " + sum);
    }
    private static void MinSalary() {         //Минимальная зарплата сотрудника
        double min = Double.MAX_VALUE;
        Employee printMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                printMinSalary = employee;
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + printMinSalary);
    }
    private static void MaxSalary() {       //Максимальная зарплата сотрудника
        double max = Double.MIN_VALUE;
        Employee printMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                printMaxSalary = employee;
            }
        }
        System.out.println("Максимальная зарплата сотрудника: " + printMaxSalary);
    }
    private static void AverageSalary() {                       //средняя зарплата сотрудника
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        sum = sum/count;
        System.out.println("средняя зарплата сотрудника: " + sum);
    }
    private static void AllName() {                             //ФИО всех сотрудников
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}