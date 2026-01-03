package inheritance;
// Superclass
class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
// Subclass
class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
// Main class
public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Thermostat("TH-101", "ON", 24);
        device.displayStatus();
    }
}
