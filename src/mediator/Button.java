package mediator;

public class Button extends UIControl {
    private boolean isEnaled;

    public Button(DialogBox owner) {
        super(owner);
    }

    public boolean isEnaled() {
        return isEnaled;
    }

    public void setEnaled(boolean enaled) {
        isEnaled = enaled;
        owner.changed(this);
    }
}
