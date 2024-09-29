package mediator;

public class Button extends UIControl {
    private boolean isEnaled;

    public boolean isEnaled() {
        return isEnaled;
    }

    public void setEnaled(boolean enaled) {
        isEnaled = enaled;
        notifyEventHandelers();
    }
}
