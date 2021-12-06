package bankrekening;

public class BankRekening {
    private String houder;
    private String iban;
    private double saldo;


    public BankRekening(String houder, String iban) {
        this.houder = houder;
        this.iban = iban;
        this.saldo = 0.0;
    }

    public BankRekening(String houder, String iban, double beginSaldo) {
        this(houder, iban);
        this.saldo = beginSaldo;
    }

    public void storting(double hoeveelheid) {
        this.saldo += hoeveelheid;
    }

    public boolean opname(double hoeveelheid) {
        if (saldo >= hoeveelheid) {
            this.saldo -= hoeveelheid;
            return true;
        }
        return false;
    }

    public String getHouder() {
        return houder;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("De rekening %s op naam van %s heeft een saldo van € %.2f", iban, houder, saldo);
    }
}

