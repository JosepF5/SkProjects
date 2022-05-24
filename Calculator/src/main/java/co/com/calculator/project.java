package co.com.calculator;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class project {

        static Integer divide2(Integer x, Integer y) {
            if (x < y) return 0;
            if(y==0){
                throw new ArithmeticException("divided by zero");
            } else if (x > 0 && y>0) {
                return 1 + divide2(x-y, y);
            } else if (x < 0 && y>0) {
                return -1 + divide2(x+y, y);
            } else if (x > 0 && y<0) {
                return -1 + divide2(x+y, y);
            } else if (x < 0 && y<0) {
                return 1 + divide2(x-y, y);
            }
            return 0;
        }

        public static void main(String[] args) {
            //sum
            Maths o=(x,y)-> x+y;
            System.out.println(o.operation(3,2));
            //minus
            Maths p=(x,y)-> x-y;
            System.out.println(p.operation(5,10));
            //multiply
            Maths t=(x,y)-> IntStream.iterate(x, v->v)
                    .limit(y)
                    .reduce((acm,n)->o.operation(acm,n))
                    .getAsInt();
            System.out.println(t.operation(5,6));
            //divide
            Maths r=(x,y)-> divide2(x,y);
            System.out.println(r.operation(80,10));
        }
}

