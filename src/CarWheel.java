public class CarWheel {
    private double conditionOfTire;
    private final double MAX_CONDITION_OF_TIRE = 1.0;
    private final double MIN_CONDITION_OF_TIRE = 0.0;

    public CarWheel() {
        conditionOfTire = MAX_CONDITION_OF_TIRE;
    }

    public CarWheel(double conditionOfTire) {
        if (conditionOfTire < MIN_CONDITION_OF_TIRE || conditionOfTire > MAX_CONDITION_OF_TIRE) {
            throw new IllegalArgumentException("ConditionOfTire must be from diapason such as [0.0,0.1]");
        }

        this.conditionOfTire = conditionOfTire;
    }

    public void changeWheel() {
        conditionOfTire = MAX_CONDITION_OF_TIRE;
    }

    public void wipeTheTire(double coefficient) {
        if (coefficient < MIN_CONDITION_OF_TIRE || coefficient > MAX_CONDITION_OF_TIRE) {
            throw new IllegalArgumentException("Coefficient must be from diapason such as [0.0,0.1]");
        }
        conditionOfTire -= coefficient;

        if (coefficient <= MIN_CONDITION_OF_TIRE) {
            conditionOfTire = MIN_CONDITION_OF_TIRE;
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
