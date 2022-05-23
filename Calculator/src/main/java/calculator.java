public class calculator {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 5;

        sum sum = new sum(n1,n2);
        sum.mostrarResultado();

        minus res = new minus(n1,n2);
        res.mostrarResultado();

        multiplication mul = new multiplication(n1,n2);
        mul.mostrarResultado();

        divition div = new divition(n1,n2);
        div.mostrarResultado();
    }
}
