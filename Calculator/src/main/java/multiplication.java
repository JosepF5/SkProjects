public class multiplication extends operation{
    double multiplication;

    public multiplication(double n1, double n2) {

        super(n1, n2, '*');
        this.multiplication = n1 * n2;
        this.setRes(this.multiplication);
    }
}
