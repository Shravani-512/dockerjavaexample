// TrafficLight.java
public class TrafficLight {
    
    // Define the states of the traffic light
    enum Light {
        RED, YELLOW, GREEN
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        Light currentLight = Light.RED;  // Start with Red light

        while (true) {
            // Print the current light state
            System.out.println("Current Light: " + currentLight);
            
            // Pause for a while (simulate real-time light change)
            Thread.sleep(2000); // 2 seconds

            // Transition to the next light
            switch (currentLight) {
                case RED:
                    currentLight = Light.GREEN; // After Red -> Green
                    break;
                case GREEN:
                    currentLight = Light.YELLOW; // After Green -> Yellow
                    break;
                case YELLOW:
                    currentLight = Light.RED; // After Yellow -> Red
                    break;
            }
        }
    }
}
