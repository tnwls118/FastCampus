package modal;

public class carDTO {
    private String carName;
    private String carModel;
    private String carColor;
    private int km;
    private int num;

    public void carDTO() {
        this.carName = carName;
        this.carModel = carModel;
        this.carColor = carColor;
        this.km = km;
        this.num = num;
    }

    @Override
    public String toString() {
        return "carnum:" + num + "\ncarname:" + carName + "\ncarmodel:" + carModel + "\ncarcolor:" + carColor + "\ncarkm:" + km;
    }

    public String getCarName(String bmw) {
        return carName;
    }

    public String getCarModel(String 세단) {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getKm() {
        return km;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
