package chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername().equals("admin") &&
                request.getPassword().equals("1234"));

        System.out.println("Authentication");

        return !isValid;
    }
}
