import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class Account {
    int amount=0;
    ArrayList<ECuenta> estados=new ArrayList<ECuenta>();

    void deposit(int amount, LocalDate fecha) {
        this.amount+=amount;
        ECuenta estado=new ECuenta(fecha,amount,0,this.amount);
        estados.add(estado);
    }

    void withdraw(int amount, LocalDate fecha) {
        this.amount-=amount;
        ECuenta estado=new ECuenta(fecha,0,amount,this.amount);
        estados.add(estado);
    }

    void transfer(int amount, Account obj){
        obj.amount+=amount;
    }

    void printStatements() {
        System.out.println("Date\tCredit\tDebit\tBalance");
        for (ECuenta estado: estados) {
            System.out.print(estado.date+"\t");
            System.out.print(estado.credit+"\t");
            System.out.print(estado.debit+"\t");
            System.out.println(estado.balance+"\t");
        }
    }

}


