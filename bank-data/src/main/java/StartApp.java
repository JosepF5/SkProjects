import java.time.LocalDate;

public class StartApp {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000, LocalDate.of( 2021 , 1 , 10 ));
        account.deposit(2000, LocalDate.of( 2021 , 1 , 13 ));
        account.withdraw(500, LocalDate.of( 2021 , 1 , 14 ));
        account.printStatements();
    }
}
