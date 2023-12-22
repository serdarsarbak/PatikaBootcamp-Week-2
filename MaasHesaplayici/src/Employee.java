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
    public String toString () {
        return (("Name : " + this.name + "\nSalary : " + this.salary + "\nWorking Hours : " + this.workHours + "\nHire Year : " + this.hireYear + "\nTax : " + tax() + "\nBonus : " + bonus() + "\nSalary Increase : " + raiseSalary() + "\nSalary with Tax and Bonus : " + salaryWithTaxBonus() + "\nNew Salary : " + newSalary()));
  }
}