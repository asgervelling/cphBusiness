package accounts;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Account acc0 = new Account("1/5/09 11:37,Product1,1200,Visa,4234120954489197,Janet,Ottawa,Ontario,Canada,1/5/09 9:35,1/5/09 19:24,45.4166667,-75.7");
        Account acc1 = new Account("1/5/09 20:00,Product2,3600,Visa,4904344348439820,James,Burpengary,Queensland,Australia,12/10/08 19:53,1/8/09 17:58,-27.1666667,152.95");
        Account acc2 = new Account("1/3/09 13:24,Product1,1200,Visa,4737470823565213,Mehmet Fatih,Helsingor,Frederiksborg,Denmark,1/3/09 12:47,1/9/09 11:14,56.0333333,12.6166667");

        System.out.println(acc0);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
