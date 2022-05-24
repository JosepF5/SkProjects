package co.com.calculator;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class project {
        static Double multiply(Double x, Double y) {
            if (y > 0) {
                return x + multiply(x, y - 1);
            } else if (y < 0) {
                return -x + multiply(x, y + 1);
            }
            return Double.parseDouble("0");
        }

        static Double divide(Double x, Double y) {
            if(y==0){
                throw new ArithmeticException("divided by zero");
            } else if (x > 0 && y>0) {
                return 1 + divide(x-y, y);
            } else if (x < 0 && y>0) {
                return -1 + divide(x+y, y);
            } else if (x > 0 && y<0) {
                return -1 + divide(x+y, y);
            } else if (x < 0 && y<0) {
                return 1 + divide(x-y, y);
            }

            return Double.parseDouble("0");
        }

        public static void main(String[] args) {
            Double a=Double.parseDouble("-12") ;
            Double b=Double.parseDouble("3") ;;

            //sum
            Maths o=(x,y)-> x+y;
            System.out.println(o.operation(a,b));
            //minus
            Maths p=(x,y)-> x-y;
            System.out.println(p.operation(a,b));
            //multiply
            Maths q=(x,y)-> multiply(x,y);
            System.out.println(q.operation(a,b));
            //divide
            Maths r=(x,y)-> divide(x,y);
            System.out.println(r.operation(a,b));

        /*
        BigDouble a=BigDouble.valueOf(30);
        BigDouble b=BigDouble.valueOf(12);

        Maths sum=(x,y)-> x.add(y);
        System.out.println(sum.operation(a,b));
        Maths minus=(x,y)-> x.subtract(y);
        System.out.println(minus.operation(a,b));
        Maths multiply=(x,y)-> x.multiply(y);
        System.out.println(multiply.operation(a,b));
        Maths divide=(x,y)-> x.divide(y);
        System.out.println(divide.operation(a,b));
        */
        }
}

