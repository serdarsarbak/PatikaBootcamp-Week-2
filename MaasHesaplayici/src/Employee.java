public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus () {
        if (this.workHours>40) {
            return (this.workHours-40)*30;
        } else {
            return 0;
        }
    }

    double raiseSalary () {
        int workingYears = 2021-this.hireYear;
        if (workingYears<10) {
            return this.salary*0.05;
        } else if (workingYears<20) {
            return this.salary*0.1;
        } else {
            return this.salary*0.15;
        }
    }

    double salaryWithTaxBonus () {
        return this.salary - tax() + bonus();
    }

    double newSalary () {
        return this.salary - tax() + bonus() + raiseSalary();
    }

  void stringPrint () {
      System.out.println("Name: " + this.name);
      System.out.println("Salary: " + this.salary);
      System.out.println("Working Hours: " + this.workHours);
      System.out.println("Hire Year: " + this.hireYear);
      System.out.println("Tax: " + tax());
      System.out.println("Bonus: " + bonus());
      System.out.println("Salary raise: " + raiseSalary());
      System.out.println("Salary with tax and bonus: " + salaryWithTaxBonus());
      System.out.println("New Salary: " + newSalary());
  }
}