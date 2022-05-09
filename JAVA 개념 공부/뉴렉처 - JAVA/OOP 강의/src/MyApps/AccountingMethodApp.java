class Accounting {
    public double valueOfSupply;
    public  double vatRate;
    public  double expenseRate;
    public  void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("Vat : " + getVat());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
    }

    public double getDividend3() {
        double dividend3 = getIncome() * 0.2;
        return dividend3;
    }

    public double getDividend2() {
        return getIncome() * 0.3;
    }

    public double getDividend1() {
        return getIncome() * 0.5;
    }

    public double getIncome() {
       return valueOfSupply - getExpense();
    }

    public double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public double getTotal() {
        double total = valueOfSupply + getVat();
        return total;
    }

    public double getVat() {
        return valueOfSupply * vatRate; //메소드를 만드는 부분
    }

    public class AccountingMethodApp {

        public static void main(String[] args) {

            //instance
            Accounting a1 = new Accounting();
            a1.valueOfSupply = 10000.0;
            a1.vatRate = 0.1;
            a1.expenseRate = 0.3;
            a1.print();

            Accounting a2 = new Accounting();
            a2.valueOfSupply = 20000.0;
            a2.vatRate = 0.05;
            a2.expenseRate = 0.2;
            a2.print();

            a1.print();

        }
    }
}
