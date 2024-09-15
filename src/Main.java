import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("aaa");
        history.push(editor.createState());

        editor.setContent("bbb");
        history.push(editor.createState());

        editor.setContent("ccc");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}