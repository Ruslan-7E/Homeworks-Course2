package pro.sky.java.course2.hw4;

public class Train extends Transport{
    private double tripCost;
    private double tripTime;
    private String departureStation;
    private String endPoint;
    private int numOfWagons;

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String carcassColor,
                 int maxSpeed,
                 double tripCost,
                 double tripTime,
                 String departureStation,
                 String endPoint,
                 int numOfWagons,
                 String fuelType) {
        super(brand, model, productionYear, productionCountry, carcassColor, maxSpeed, fuelType);
        setTripCost(tripCost);
        setTripTime(tripTime);
        setDepartureStation(departureStation);
        setEndPoint(endPoint);
        setNumOfWagons(numOfWagons);
    }

    public double getTripCost() {
        return tripCost;
    }

    public double getTripTime() {
        return tripTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public int getNumOfWagons() {
        return numOfWagons;
    }

    public void setTripCost(double tripCost) {
        if (tripCost <= 0) {
            this.tripCost = -1;
        } else {
            this.tripCost = tripCost;
        }
    }

    public void setTripTime(double tripTime) {
        if (tripTime <= 0) {
            this.tripTime = -1;
        } else {
            this.tripTime = tripTime;
        }
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isEmpty()) {
            this.departureStation = "Not defined.";
        } else {
            this.departureStation = departureStation;
        }
    }

    public void setEndPoint(String endPoint) {
        if (endPoint == null || endPoint.isEmpty()) {
            this.endPoint = "Not defined.";
        } else {
            this.endPoint = endPoint;
        }
    }

    public void setNumOfWagons(int numOfWagons) {
        if (numOfWagons <= 0) {
            this.numOfWagons = -1;
        } else {
            this.numOfWagons = numOfWagons;
        }
    }

    @Override
    protected void refill() {
        System.out.println("Fuel type for Train: " + getBrand() + " - " + getFuelType());
    }

    public static void printTrainInfo(Train train) {
        System.out.println(train.getBrand() + ", "
                + train.getModel() + ", "
                + train.getProductionYear() + ", "
                + train.getProductionCountry() + ", "
                + train.getCarcassColor() + ", "
                + train.getMaxSpeed() + ", "
                + train.getTripCost() + ", "
                + train.getTripTime() + ", "
                + train.getDepartureStation() + ", "
                + train.getEndPoint() + ", "
                + train.getNumOfWagons() + ", "
                + train.getFuelType());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Train{" +
                "tripCost=" + tripCost +
                ", tripTime=" + tripTime +
                ", departureStation='" + departureStation + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", numOfWagons=" + numOfWagons +
                '}';
    }
}
