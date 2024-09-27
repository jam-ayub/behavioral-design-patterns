import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var bolbCommand = new BoldCommand(document, history);
        bolbCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
