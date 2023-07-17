public abstract class Vehicle {

    protected String name;
    protected String colour;
    protected int capacity;

    public Vehicle(String name, String colour, int capacity) {
        this.name = name;
        this.colour = colour;
        this.capacity = capacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "colour='" + colour + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}



