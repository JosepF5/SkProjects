package co.com.sofka.challengeDDD;

import co.com.sofka.challengeDDD.domain.sale.commands.CreateSale;
import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class CreateSaleUseCaseTest {
    @Test
    void createSaleWithAllTheParameters() {
        //Arrange
        var command=new CreateSale(
                SaleID.of("xxxx"),
                new Payment(123456)
        );

    }
}
