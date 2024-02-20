package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salary_1 = (double)salary;
        if(salary_1 <= 10000){
            salary_1 /= 10;
            System.out.println(salary_1);
        } else if (salary_1 >= 10000 && salary_1 <= 20000) {
            salary_1 /= 15;
            System.out.println(salary_1);
        } else if (salary_1 > 20000) {
            salary_1 /= 18;
            System.out.println(salary_1);
        }else {
            System.out.println("wrong input!");
        }

    }
}
