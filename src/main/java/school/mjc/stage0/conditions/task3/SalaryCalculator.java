package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salary_1 = (double)salary;
        if(salary_1 <= 10000 && salary_1 > 0){
            salary_1 = salary_1 - ((salary_1 / 100) * 10);
            System.out.println(salary_1);
        } else if (salary_1 >= 10000 && salary_1 <= 20000) {
            salary_1 = salary_1 - ((salary_1 / 100) * 15);
            System.out.println(salary_1);
        } else if (salary_1 > 20000) {
            salary_1 = salary_1 - ((salary_1 / 100) * 18);
            System.out.println(salary_1);
        }else {
            System.out.println("wrong input!");
        }

    }
}
