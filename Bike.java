public class Bike
{
    public static final int MAX_WEAR = 100;
    
    private static int bikeCount = 0;
    private String name;
    private int gears;
    private int wear;
    
    Bike(String name, int gears) {
        this.name = name;
        this.gears = gears;
        this.wear = 0;
        bikeCount++;
    }

    Bike(String name) {
        this(name, 1);
    }

    Bike() {
        this("Bike", 1);
    }
    
    public String getName() {
        return name;
    }

    public int getGears() {
        return gears;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        if(wear < 0) {
            this.wear = 0;
        }
        else if (wear > MAX_WEAR) {
            this.wear = MAX_WEAR;
        }
        else {
            this.wear = wear;
        }
    }

    public boolean canRide() {
        if(wear < MAX_WEAR);
        return true;
    }

    public void ride(int km) {
        setWear(wear + km / 10);
    }

    public void repair() {
        setWear(0);
    }

    public void swapWear(Bike other) {
        int temp = this.wear;
        setWear(other.getWear());
        other.setWear(this.wear);
    }

    public Bike moreGears(Bike other) {
        if(other > this.Bike) {
            return Bike();
        }
    }

    public String wearReport() {
        return "";
    }

    public static int getBikeCount() {
        return Bike.getBikeCount();
    }

    public String toString() {
        return name + gears + wear;
    }
}
