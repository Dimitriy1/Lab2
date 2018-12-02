public class CarDoor {
    private boolean isOpenDoor;
    private boolean isOpenWindow;

    public CarDoor() {
        isOpenDoor = false;
        isOpenWindow = false;
    }

    public CarDoor(boolean isOpenDoor, boolean isOpenWindow) {
        this();
        this.isOpenDoor = isOpenDoor;
        this.isOpenWindow = isOpenWindow;
    }

    public void openTheDoor() {
        isOpenDoor = true;
    }

    public void openTheWindow() {
        isOpenWindow = true;
    }

    public void closeTheDoor() {
        isOpenDoor = false;
    }

    public void closeTheWindow() {
        isOpenWindow = false;
    }

    public void openCloseTheDoor() {
        if (isOpenDoor) {
            isOpenDoor = false;
        } else {
            isOpenDoor = true;
        }
    }

    public void openCloseTheWindow() {
        if (isOpenWindow) {
            isOpenWindow = false;
        } else {
            isOpenWindow = true;
        }
    }

    @Override
    public String toString() {
        return "[" + "isOpenDoor: " + isOpenDoor + " ,isOpenTheWindow: " + isOpenWindow + "]" ;
    }
}