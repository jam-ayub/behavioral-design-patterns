import chainOfResponsibility.*;

public class Main {
    public static void main(String[] args) {
        var request = new HttpRequest("admin", "1234");

        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authentication = new Authenticator(logger);

        var webServer = new WebServer(authentication);

        webServer.handle(request);
    }
}
