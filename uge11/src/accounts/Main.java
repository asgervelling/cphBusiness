package accounts;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("1/5/09 11:37,Product1,1200,Visa,4234120954489197,Janet,Ottawa,Ontario,Canada,1/5/09 9:35,1/5/09 19:24,45.4166667,-75.7");
        System.out.println(acc);
    }
}
