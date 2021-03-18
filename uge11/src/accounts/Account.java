package accounts;

import java.time.LocalDateTime;
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
    }

    private boolean isDateTime(String dateStr) {
        Pattern p = Pattern.compile("([0-9]{1,2})\\/([0-9]{1,2})\\/([0-9]{1,2}) ([0-9]{1,2}):([0-9]{1,2})");
        Matcher m = p.matcher(dateStr.trim());
        return m.find();
    }

    private LocalDateTime createLocaltDateTime(String s) {
        if (isDateTime(s)) {
            String[] dateAndTime = s.trim().split(" ");
            String date = dateAndTime[0];
            String time = dateAndTime[1];

            String[] dateParts = date.split("/");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            String[] timeParts = time.trim().split(":");
            int hour = Integer.parseInt(timeParts[0]);
            int minute = Integer.parseInt(timeParts[1]);

            return LocalDateTime.of(year, month, day, hour, minute);
        }
        return null;
    }

    private void setTransactionDate(String dateStr) {
        this.transactionDate = createLocaltDateTime(dateStr);
    }

    private void setProduct(String productStr) {
        this.product = productStr.trim();
    }

    private void setPrice(String priceStr) {
        this.price = Double.parseDouble(priceStr.trim());
    }

    private void setPaymentType(String paymentTypeStr) {
        this.paymentType = paymentTypeStr.trim();
    }

    private void setCardNumber(String cardNumberStr) {
        this.cardNumber = Long.parseLong(cardNumberStr.trim());
    }

    private void setName(String name) {
        this.name = name.trim();
    }

    private void setCity(String city) {
        this.city = city.trim();
    }

    private void setState(String state) {
        this.state = state.trim();
    }

    private void setCountry(String country) {
        this.country = country.trim();
    }

    private void setAccountCreated(String dateStr) {
        this.accountCreated = createLocaltDateTime(dateStr);
    }

    private void setLastLogin(String dateStr) {
        this.lastLogin = createLocaltDateTime(dateStr);
    }

    private void setLatitude(String latStr) {
        this.latitude = Double.parseDouble(latStr.trim());
    }

    private void setLongitude(String longStr) {
        this.longitude = Double.parseDouble(longStr.trim());
    }

    @Override
    public String toString() {
        return name + "\n{" +
                "\ntransactionDate:\t" + toDateString(transactionDate) +
                ", \nproduct:\t\t\t" + product +
                ", \nprice:\t\t\t\t" + price +
                ", \npaymentType:\t\t" + paymentType +
                ", \ncardNumber:\t\t\t" + cardNumber +
                ", \nname:\t\t\t\t" + name +
                ", \ncity:\t\t\t\t" + city +
                ", \nstate:\t\t\t\t" + state +
                ", \ncountry:\t\t\t" + country +
                ", \naccountCreated:\t\t" + toDateString(accountCreated) +
                ", \nlastLogin:\t\t\t" + toDateString(lastLogin) +
                ", \nlatitude:\t\t\t" + latitude +
                ", \nlongitude:\t\t\t" + longitude +
                "\n}\n";
    }

    private String toDateString(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return String.format("%s/%s/%s %s:%s", withZero(dateTime.getDayOfMonth()),
                withZero(dateTime.getMonthValue()),
                withZero(dateTime.getYear()),
                withZero(dateTime.getHour()),
                withZero(dateTime.getMinute()));
    }

    private String withZero(int x) {
        if (x < 10 && x > -10) {
            return String.format("0%d", x);
        }
        return String.valueOf(x);
    }

}
