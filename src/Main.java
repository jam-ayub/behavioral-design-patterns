import command.*;

public class Main {
    public static void main(String[] args) {
        var compositeCommand = new CompositeCommand();
        var resize = new ResizeCommand();
        var blackAndWhite = new BlackAndWhiteCommand();

        compositeCommand.addCommand(resize);
        compositeCommand.addCommand(blackAndWhite);

        compositeCommand.execute();
    }
}
