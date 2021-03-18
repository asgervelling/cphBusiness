package accounts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    LocalDateTime transactionDate;
    String product;
    double price;
    String paymentType;
    long cardNumber;
    String name;
    String city;
    String state;
    String country;
    LocalDateTime accountCreated;
    LocalDateTime lastLogin;
    double latitude;
    double longitude;

    public Account(String initString) {
        init(initString);
    }

    private void init(String initString) {
        String[] args = initString.split(",");
        setTransactionDate(args[0]);
        /*
        setProduct(args[1]);
        setPrice(args[2]);
        setPaymentType(args[3]);
        setCardNumber(args[4]);
        setName(args[5]);
        setCity(args[6]);
        setState(args[7]);
        setCountry(args[8]);
        setAccountCreated(args[9]);
        setLastLogin(args[10]);
        setLatitude(args[11]);
        setLongitude(args[12]);
         */
    }

    private void setTransactionDate(String dateStr) {
        // 1/5/09 11:37
        Pattern p = Pattern.compile("([0-9]{1,2})\\/([0-9]{1,2})\\/([0-9]{1,2}) ([0-9]{1,2}):([0-9]{1,2})");
        Matcher m = p.matcher(dateStr.trim());
        boolean matchFound = m.find();
        if (matchFound) {
            System.out.println("Found");

            String[] dateAndTime = dateStr.trim().split(" ");
            String date = dateAndTime[0];
            String time = dateAndTime[1];

            String[] dateParts = date.split("/");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            String[] timeParts = time.trim().split(":");
            int hour = Integer.parseInt(timeParts[0]);
            int minute = Integer.parseInt(timeParts[1]);

            this.transactionDate = LocalDateTime.of(year, month, day, hour, minute);


        } else {
            System.out.println("Not found");
        }

    }

    @Override
    public String toString() {
        return "\nAccount{" +
                "\ntransactionDate=" + toDateString(transactionDate) +
                ", \nproduct='" + product + '\'' +
                ", \nprice=" + price +
                ", \npaymentType='" + paymentType + '\'' +
                ", \ncardNumber=" + cardNumber +
                ", \nname='" + name + '\'' +
                ", \ncity='" + city + '\'' +
                ", \nstate='" + state + '\'' +
                ", \ncountry='" + country + '\'' +
                ", \naccountCreated=" + toDateString(accountCreated) +
                ", \nlastLogin=" + toDateString(lastLogin) +
                ", \nlatitude=" + latitude +
                ", \nlongitude=" + longitude +
                "}\n";
    }

    public String toDateString(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return String.format("%s/%s/%s %s:%s", withZero(dateTime.getDayOfMonth()),
                withZero(dateTime.getMonthValue()),
                withZero(dateTime.getYear()),
                withZero(dateTime.getHour()),
                withZero(dateTime.getMinute()));
    }

    public String withZero(int x) {
        if (x < 10 && x > -10) {
            return String.format("0%d", x);
        }
        return String.valueOf(x);
    }


}
