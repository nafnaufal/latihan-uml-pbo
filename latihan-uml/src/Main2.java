/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theen
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[] pekerja = new Employee[2];
        pekerja[0] = new SalariedEmployee();
        pekerja[1] = new HourlyEmployee();

        pekerja[0].setName("Jane");
        pekerja[0].setAfm("12345");
        ((SalariedEmployee)pekerja[0]).setSalary(1000000);

        pekerja[1].setName("Naufal");
        pekerja[1].setAfm("341231");
        ((HourlyEmployee)pekerja[1]).setHoursWorked(10);
        ((HourlyEmployee)pekerja[1]).setHourlyPayment(250000);

        for(Employee i : pekerja){
            System.out.println("Salary : " + i.payment());
        }

    }
    
}
