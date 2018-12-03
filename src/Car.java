import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private final int DATE_OF_CREATION;
    private Engine typeOfEngine;
    private int passengerCapacity;
    private double currentSpeed;
    private double maxSpeed;
    private int accelerationRate;
    private List<CarDoor> carDoors = new ArrayList<>(Arrays.asList(new CarDoor(),
            new CarDoor(), new CarDoor(), new CarDoor()));
    private List<CarWheel> carWheels = new ArrayList<>(Arrays.asList(new CarWheel(),
            new CarWheel(), new CarWheel(), new CarWheel()));
    private List<Passenger> passengers = new ArrayList<>();

    public Car(int dateOfCreation) {
        DATE_OF_CREATION = dateOfCreation;
    }

    public Car(int dateOfCreation,
               Engine typeOfEngine,
               int passengerCapacity,
               double currentSpeed,
               double maxSpeed,
               int accelerationRate) {
        this(dateOfCreation);
        this.typeOfEngine = typeOfEngine;
        this.passengerCapacity = passengerCapacity;

        if (passengers.size() == 0 || carWheels.size() < 4) {
            this.currentSpeed = 0;
        } else {
            this.currentSpeed = currentSpeed;
        }

        this.maxSpeed = maxSpeed;
        this.accelerationRate = accelerationRate;
    }

    public void changeCurrentSpeed(int currentSpeed) {
        if (passengers.size() == 0 || carWheels.size() < 4) {
            this.currentSpeed = 0;
        } else {
            this.currentSpeed = currentSpeed;
        }
    }

    public int getNumberOfPassengersRightNow() {
        return passengers.size();
    }

    public CarWheel getCarWheel(int index) {
        if (index >= carWheels.size()) {
            throw new IndexOutOfBoundsException("The index of wheel is more than current capacity");
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("The index of wheel is less than 0");
        }

        return carWheels.get(index);
    }

    public CarDoor getCarDoor(int index) {
        if (index >= carDoors.size()) {
            throw new IndexOutOfBoundsException("The index of door is more than current capacity");
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("The index of door is less than 0");
        }

        return carDoors.get(index);
    }

    public void removeAllWheels() {
        carWheels = new ArrayList<>();
    }

    public void addWheels(int numbOfWheels) {
        for (int i = 0; i < numbOfWheels; i++) {
            carWheels.add(new CarWheel());
        }
    }

    public double getCurrentMaxSpeed() {
        if (passengers.size() == 0 || carWheels.size() < 4) {
            return 0.0;
        }
        double minConditionOfTire = carWheels.get(0).getConditionOfTire();
        for (CarWheel carWheel : carWheels) {
            if (carWheel.getConditionOfTire() < minConditionOfTire) {
                minConditionOfTire = carWheel.getConditionOfTire();
            }
        }

        return maxSpeed * minConditionOfTire;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        }
    }

    public void removePassenger(int index) {
        if (index >= passengers.size()) {
            throw new IndexOutOfBoundsException("The index of passenger is more than current capacity");
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("The index of passenger is less than 0");
        }

        passengers.remove(index);
    }

    public void removeAllPassenger() {
        passengers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "dateOfCreation : " + DATE_OF_CREATION + "\n"
                + "typeOfEngine : " + typeOfEngine + "\n"
                + "passengerCapacity : " + passengerCapacity + "\n"
                + "numberOfPassengersRightNow : " + getNumberOfPassengersRightNow() + "\n"
                + "currentSpeed : " + currentSpeed + "\n"
                + "maxSpeed : " + maxSpeed + "\n"
                + "currentMaxSpeed; : " + getCurrentMaxSpeed() + "\n"
                + "accelerationRate : " + accelerationRate + "\n"
                + "carDoors : " + Arrays.toString(carDoors.toArray(new CarDoor[carDoors.size()])) + "\n"
                + "carWheels : " + Arrays.toString(carWheels.toArray(new CarWheel[carWheels.size()])) + "\n"
                + "passengers : " + Arrays.toString(passengers.toArray(new Passenger[passengers.size()]));
    }
}
