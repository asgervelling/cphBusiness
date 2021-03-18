package vat;

public class Controller {

    private Model model;
    private View view;

    public Controller() {
        this.model = new Model();
        this.view = new View();
    }

    public void run() {
        double price = model.getPrice();
        double result = model.VAT(price);
        view.show(result);
    }
}
