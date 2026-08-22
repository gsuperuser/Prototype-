import java.util.Scanner;
public class Main{

    public double calBaseSalary(String type, int hoursWorked)
    {
        double baseSalary = 0;
        if (type.equals("full-time"))
        {
            baseSalary = 500 * hoursWorked;
        }
        else if (type.equals("part-time"))
        {
            baseSalary = 250 * hoursWorked;
        }
        else if (type.equals("contract"))
        {
            baseSalary = 350 * hoursWorked;
        }
        else
        {
            System.out.println("Invalid employee type.");
        }
        return baseSalary;
    }

    public double calBaseSalary(int hoursWorked)
    {
        double baseSalary = 300 * hoursWorked;
        return baseSalary;
    }

    public double calHRA(double baseSalary)
    {
        return 0.2 * baseSalary;
    }

    public double calDa(double baseSalary)
    {
        return 0.15 * baseSalary;
    }
    public double calPF(double baseSalary)
    {
        return 0.12 * baseSalary;
    }

    public double calTax(double gross)
    {
        if (gross < 50000)
        {
            return 0;
        }
        else if (gross < 100000 & gross >= 50000)
        {
            return 0.1 * gross;
        }
        else
        {
            return 0.2 * gross;
        }
    }

    public double calNetSalary(double gross, double tax, double pf)
    {
        return gross - tax - pf;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int hoursWorked;
    String type;
    System.out.println("Enter employee type (full-time, part-time, contract): ");
    type = sc.nextLine();
    System.out.println("Enter hours worked: ");
    hoursWorked = sc.nextInt();
    double baseSalary;
    Main main = new Main();
    if (type.equals("full-time") || type.equals("part-time") || type.equals("contract"))
    {
        baseSalary = new Main().calBaseSalary(type, hoursWorked);
    }
    else
    {
        baseSalary = new Main().calBaseSalary(hoursWorked);
    }


    double hra = main.calHRA(baseSalary);
    double da = main.calDa(baseSalary);
    double pf = main.calPF(baseSalary);
    double gross = baseSalary + hra + da;
    double tax = main.calTax(gross);
    double netSalary = main.calNetSalary(gross, tax, pf);

    System.out.println("Base Salary: " + baseSalary);
    System.out.println("HRA: " + hra);
    System.out.println("DA: " + da);        
    System.out.println("PF: " + pf);
    System.out.println("Gross Salary: " + gross);
    System.out.println("Tax: " + tax);
    System.out.println("Net Salary: " + netSalary);
}
}