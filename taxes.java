import java.util.Scanner;

public class taxes{
    
    public static void main(String[] args) {
        int yearlyIncome;
        
        double tax5;
        tax5 = 0;
        
        double tax4;
        tax4 = 0;
        
        double tax3;
        tax3 = 0;
        
        double tax2;
        tax2 = 0;

        double totalTax;
        double taxBreak;
        
        int numberOfChildren;
        int childAdvantage;
        int age;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Yearly Income:");
        yearlyIncome = scan.nextInt();

        if(yearlyIncome >= 250000){
            tax5 = (yearlyIncome - 250000) * 0.5;
            yearlyIncome = 250000;
        } 
        if(yearlyIncome >= 75000){
            tax4 = (yearlyIncome - 75000) * 0.3;
            yearlyIncome = 75000;
        }
        if(yearlyIncome >= 25000){
            tax3 = (yearlyIncome - 25000) * 0.2;
            yearlyIncome = 25000;
        }
        if(yearlyIncome >= 10000){
            tax2 = (yearlyIncome - 10000) * 0.1;
            yearlyIncome = 0;
        }

        totalTax = tax2 + tax3 + tax4 + tax5;

        System.out.println("Number of Children:");
        numberOfChildren = scan.nextInt();

        childAdvantage = 0;
        if(numberOfChildren >= 1) {
            numberOfChildren = numberOfChildren - 2;
            childAdvantage = 1000;
            if(numberOfChildren > 0) {
                childAdvantage = childAdvantage + (250 * numberOfChildren);
            }
        }

        totalTax = totalTax - childAdvantage;

        System.out.println("age:");
        age = scan.nextInt();

        taxBreak = 0;
        if(age >= 80){
            taxBreak = 1;
        }
        if(72 <= age && age < 80){
            taxBreak = 0.66;
        }
        if(64 <= age && age < 72){
            taxBreak = 0.33;
        }
        if(22 <= age && age < 64){
            taxBreak = 0.0;
        }
        if(15 <= age && age < 22){
            taxBreak = 0.25;
        }
        if(0 <= age && age < 15){
            taxBreak = 0.5;
        }

        totalTax = totalTax - (totalTax * taxBreak);
        System.out.println("Your will be taxed " + totalTax);
    }
}