package vaibhav.practice.repo.car.parking.service.model;

import java.util.Objects;

public class ParkingSlot {

    private String vehicleNumber;
    private int timeIn;
    private int timeOut;

    @Override
    public String toString() {
        return timeIn + " - " + timeOut;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSlot that = (ParkingSlot) o;
        return timeIn == that.timeIn &&
                timeOut == that.timeOut;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNumber, timeIn, timeOut);
    }

    @Override
    protected VehicleTiming clone() throws CloneNotSupportedException {
        VehicleTiming that = new VehicleTiming();
        that.setTimeIn(this.timeIn);
        that.setTimeOut(this.timeOut);
        return that;
    }
}
