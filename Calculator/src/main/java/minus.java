public class minus extends operation{
    double minus;

    public minus(double n1, double n2) {

        super(n1, n2, '-');
        this.minus = n1 - n2;
        this.setRes(this.minus);
    }
}