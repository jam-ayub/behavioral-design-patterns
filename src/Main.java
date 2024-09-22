import command.AddCustomerCommand;
import command.CustomerService;
import command.framwork.Button;

public class Main {
    public static void main(String[] args) {
        var customerService = new CustomerService();

        var addCustomerCommand = new AddCustomerCommand(customerService);

        var button = new Button(addCustomerCommand);

        button.click();
    }
}
