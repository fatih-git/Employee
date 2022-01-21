/**
 * @author fatih-git
 * */

public class Ana {

    public static void main(String[] args) {

        Employee çalışan=new Employee("Fatih", 12000, 41, 2019);
        çalışan.bonus();
        çalışan.raiseSalary();
        çalışan.tax();

        çalışan.printEmployee();

    }

}
