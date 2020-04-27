package day03_VaraiablesContinue;

public class SalaryCulculater {


    public static void main(String[] args) {

        /*


*/

        // dataType VaraibleName = data;

        double HourlyRate = 65;
        Double stateTaxRate = 0.04;
        Double federalTaxRate = 0.22;
        byte weeklyHours = 45;
        byte totalWeeks = 48;
// salary = hourlyRate * weeklyHours * totalWeekly;
        double salary = HourlyRate * weeklyHours * totalWeeks;
        //stateTax = salary * stateTaxRate;
        double stateTax = salary * stateTaxRate;



// federalTax = salary * federalTaxRate
        double federalTax = salary *federalTaxRate;
        //salaryAfterTax = salary - stateTax - federalTax;
        double  salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("your salary is:" + salary);

        System.out.println("state tax is :"+ stateTax);// concatenation
        System.out.println("federal tax is :"+ federalTax);//concatenation

        System.out.println("total tax is :"+ (federalTax +stateTax));
        System.out.println("salary after tax $" + salaryAfterTax);


    }







}
