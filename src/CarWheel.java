public class CarWheel {
    private double conditionOfTire;

    public CarWheel() {
        conditionOfTire = 1.0;
    }

    public CarWheel(double conditionOfTire) {
        if (conditionOfTire < 0.0 || conditionOfTire > 1.0) {
            throw new IllegalArgumentException("ConditionOfTire must be from diapason such as [0.0,0.1]");
        }

        this.conditionOfTire = conditionOfTire;
    }

    public void changeWheel() {
        conditionOfTire = 1.0;
    }

    public void wipeTheTire(double coefficient) {
        conditionOfTire -= coefficient;

        if (coefficient <= 0.0) {
            conditionOfTire = 0.0;
        }
    }

    public double getConditionOfTire() {
        return conditionOfTire;
    }

    @Override
    public String toString() {
        return "[" + "conditionOfTire: " + conditionOfTire + "]";
    }
}