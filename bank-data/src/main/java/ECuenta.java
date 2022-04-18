import java.time.LocalDate;

public class ECuenta {
    LocalDate date;
    int credit;
    int debit;
    int balance;

    public ECuenta(LocalDate date, int credit, int debit, int balance){
        this.date=date;
        this.credit=credit;
        this.debit=debit;
        this.balance=balance;
    }
}
