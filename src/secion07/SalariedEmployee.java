package secion07;

public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    /**
     * Difference between `super()` and `this()`:
     * The keyword `super` is used to access or call the parent class members (both variables and methods)
     * The keyword `this` is used to call the current class member (both variables and methods). Also, `this` is required when we have parameter with the same name as
     * an instance of variable or field.
     *
     */

    public SalariedEmployee(String name, String birthDate,String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 26;
        double adjustedPay = isRetired ? 0.9 * payCheck : payCheck;

        return (int) adjustedPay;
    }

    public void retire() {
        terminate("22.03.2025");
        this.isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }
}
