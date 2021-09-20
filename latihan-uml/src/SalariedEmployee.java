public class SalariedEmployee extends Employee{
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int payment(){
        return salary;
    }
}
