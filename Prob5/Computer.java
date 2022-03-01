package CS390Assignment4.Prob5;

public class Computer {

    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }
    public int getRamSize(){
        return ramSize;
    }

    public double getProcessorSpeed(){
        return processorSpeed;
    }

    public double computePower(){
        return getRamSize() * getProcessorSpeed();
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) return false;
        if(!(obj instanceof Computer)) return false;
        Computer c = (Computer) obj;

        return (
                this.manufacturer.equals(c.manufacturer)
                        && this.processor.equals(c.processor)
                        && (this.processorSpeed == c.processorSpeed)
                        && (this.ramSize == c.ramSize)
        );
    }

    @Override
    public String toString() {
        String details = "Computer manufacturer: '" + manufacturer + ", processor: '" + processor + ", ramSize: " + ramSize + ", processorSpeed: " + processorSpeed;
        return details;
    }
}
