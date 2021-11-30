package account;

import java.text.NumberFormat;

public class Account {
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private final float interesAnual = 0.1f; // interest rate of 10%
    private long acctNumber;
    private float balance;
    public final String name;

    public Account(String owner, long account, float initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    public boolean ingresar(float amount) {
        boolean result = true;
        // comprovar que la quantitat sigui vàlida
        if (amount < 0) {
            result = false;
        } else {
            balance = balance + amount;
        }
        return result;
    }

    public boolean treureDiners(float amount, float comisio) {
        boolean isValid = false;
        // validar paràmetres
        if (isValidWithdrawl(amount, comisio)) {
            amount += comisio;
            balance = balance - amount;
            isValid = true;
        }
        return isValid;
    }

    //2
    public boolean transfer (Account compteDesti, float quantitatTransferir){
        boolean isValid = false;
        //comprovar que al balance hi hagi suficients diners i afegir-los al compte destí
        if (this.balance > quantitatTransferir){
            compteDesti.balance += quantitatTransferir;
            this.balance -= quantitatTransferir;
            isValid = true;
        }
        return isValid;
    }

    boolean isValidWithdrawl(float amount, float comisio) {
        // s'ha de comprovar que al compte hi ha prou diners
        // la suma del amount i la comissió ha de ser més petita que el balance
        return amount >= 0 && comisio >= 0 && amount+comisio <= balance;
    }

    public void afegirInteresAnual() {
        balance += (balance * interesAnual);
    }

    public float getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return acctNumber;
    }

    public String toString() {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
