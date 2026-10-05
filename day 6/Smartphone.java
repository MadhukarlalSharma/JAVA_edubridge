//   Day 6   6th Question  Multiple Interfaces


interface Camera {
    void takePhoto();
}

interface GPS {
    String getLocation();
}

class SmartPhone implements Camera, GPS {
    @Override
    public void takePhoto() {
        System.out.println("Photo taken.");
    }

    @Override
    public String getLocation() {
        return "12.9716° N, 77.5946° E";
    }
}

public class SmartPhoneDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        Camera cam = phone;
        GPS gps = phone;

        cam.takePhoto();
        System.out.println("Location: " + gps.getLocation());
    }
}