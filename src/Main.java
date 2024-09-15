import general.CheckBox;
import general.TexBox;
import general.UIControl;

public class Main {
    public static void main(String[] args) {
        drawUIControl(new TexBox());
        drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl uiControl) {
        uiControl.draw();
    }
}