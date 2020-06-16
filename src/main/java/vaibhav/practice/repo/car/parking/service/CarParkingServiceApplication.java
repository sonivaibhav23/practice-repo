package vaibhav.practice.repo.car.parking.service;

import org.springframework.util.CollectionUtils;
import vaibhav.practice.repo.car.parking.service.model.ParkingSlot;
import vaibhav.practice.repo.car.parking.service.model.VehicleTiming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarParkingServiceApplication {

    private static int capacity;
    private static int allocated;
    private static List<ParkingSlot> parkingSlots = new ArrayList<>();

    public static void main(String[] args) {
        // Getting vehicle details as timeIn and timeOut
        int[][] vehicleDetails = {
                {0, 8},
                {5, 20},
                {7, 15},
                {8, 50},
                {25, 40},
                {30, 40},
                {40, 45}
        };

        calculateMinimumParkingSlot(vehicleDetails);
        System.out.println("Number of minimum Parking Slots required : " + capacity);
    }

    private static void calculateMinimumParkingSlot(int[][] vehicleDetails) {
        List<VehicleTiming> vehicleTimings = convertVehicleDetailsIntoVehicleTiming(vehicleDetails);
        vehicleTimings.stream().forEach(vehicleTiming -> {
            System.out.println(
                    "Parking Vehcile With Details : " + vehicleTiming.getTimeIn() + " - " + vehicleTiming.getTimeOut());
            park(vehicleTiming);
        });
    }

    private static void park(VehicleTiming vehicleTiming) {
        if (CollectionUtils.isEmpty(parkingSlots)) {
            allotParking(vehicleTiming);
        } else {
            refreshParkingSlots(vehicleTiming.getTimeIn());
            allotParking(vehicleTiming);
        }
    }

    private static void refreshParkingSlots(int refreshTime) {
        List<ParkingSlot> clone = (List<ParkingSlot>) new ArrayList<>(parkingSlots).clone();
        parkingSlots.stream().forEach(parkingSlot -> {
            if (parkingSlot.getTimeOut() <= refreshTime) {
                System.out.println("Parking slot : " + parkingSlot.toString() + " is free.");
                clone.remove(parkingSlot);
                allocated--;
                refreshCapacity();
            }
        });
        parkingSlots = clone;
    }

    private static void allotParking(VehicleTiming vehicleTiming) {
        System.out.println("Allocating parking for vehicle : " + vehicleTiming.toString());

        ParkingSlot parkingSlot = new ParkingSlot();
        parkingSlot.setTimeIn(vehicleTiming.getTimeIn());
        parkingSlot.setTimeOut(vehicleTiming.getTimeOut());

        parkingSlots.add(parkingSlot);
        allocated++;
        refreshCapacity();
    }

    private static void refreshCapacity() {
        if (allocated > capacity) {
            capacity = allocated;
        }
    }

    private static List<VehicleTiming> convertVehicleDetailsIntoVehicleTiming(int[][] vehicleDetails) {
        return Arrays.asList(vehicleDetails).stream().map(vehicleDetail -> {
            VehicleTiming vehicleTiming = new VehicleTiming();
            vehicleTiming.setTimeIn(vehicleDetail[0]);
            vehicleTiming.setTimeOut(vehicleDetail[1]);
            return vehicleTiming;
        }).collect(Collectors.toList());
    }
}
