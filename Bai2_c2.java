package bai2_c2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai2_c2 {
    public static void main(String[] args) {
        float d,r,cv,dt;
        Scanner inp=new Scanner(System.in);
        System.out.println("chieu dai:  ");
        d=inp.nextFloat();
        System.out.println("chieu rong: ");
        r=inp.nextFloat();
        cv=2*(d+r);
        dt=d*r;
        DecimalFormat dx=new DecimalFormat("###,###.0#");
        System.out.println("dai="+d+", rong="+r+", chu vi="+dx.format(cv)+", dien tich="+dx.format(dt));
    }
    
}
