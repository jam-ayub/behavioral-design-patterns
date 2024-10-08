package general;

public abstract class UIControl extends BaseUIControl{

    public void enable() {
        System.out.println("enabled.");
    }

    public void focus() {
        System.out.println("focused");
    }

    public void setPosition() {
        System.out.println("position set.");
    }

    public abstract void draw();
}
