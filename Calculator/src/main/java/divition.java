public class divition extends operation{
    double div = 0;

    public divition(double n1, double n2) {

        super(n1, n2, '/');
        if(n2==0) System.out.println("Cant be divided by zero");
        else this.div = n1 / n2;
        this.setRes(this.div);
    }
}
