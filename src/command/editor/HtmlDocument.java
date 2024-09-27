package command.editor;

public class HtmlDocument {
    private String content;

    public void makeBold() {
        content = "<br>" + content + "</br>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
