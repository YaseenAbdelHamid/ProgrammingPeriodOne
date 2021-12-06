package bankrekening;

public class DemoBankRekening {
    public static void main(String[] args) {
        BankRekening greg = new BankRekening("Gregory Persoons", "BE15 6474 3001 5840");
        System.out.println(greg);
        greg.storting(3000);
        System.out.println(greg);
        if (greg.opname(2000)) {
            // opname geeft true terug
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }
        if (greg.opname(1500)) {
            // opname geeft false terug
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }
        BankRekening carl = new BankRekening("Carl Deleu", "BE45 8477 0157 5478", 35652);
        System.out.println("\n" + carl);
        carl.storting(6487);
        System.out.println("De rekening " + carl.getIban() + " op naam van " + carl.getHouder() + " heeft een saldo van €" + carl.getSaldo());
    }
}