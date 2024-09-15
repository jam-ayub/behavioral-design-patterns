package general;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        System.out.println("email sent!");
        disconnect();
    }

    private void connect() {
        System.out.println("connected.");
    }

    private void authenticate() {
        System.out.println("authenticated.");
    }

    private void disconnect() {
        System.out.println("disconnected.");
    }
}
