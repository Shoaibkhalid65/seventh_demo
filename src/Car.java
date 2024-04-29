public class Car {
    String company;
    String model;
    int year;
    String color;
    double price;
    int mileage;
    boolean isRunning;
    String seatsColor;
    String registrationNo;

    public Car() {
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public String getSeatsColor() {
        return seatsColor;
    }

    public void setSeatsColor(String seatsColor) {
        this.seatsColor = seatsColor;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public boolean isSunRoof() {
        return isSunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        isSunRoof = sunRoof;
    }

    boolean isSunRoof;
    void showCompany(){
        System.out.println(company);
    }
    void showModel(){
        System.out.println(model);
    }
    void showYear(){
        System.out.println(year);
    }
    void showColor(){
        System.out.println(color);
    }
    void showPrice(){
        System.out.println(price);
    }
    void showMileage(){
        System.out.println(mileage);
    }
    void showIsRunning(){
        System.out.println(isRunning);
    }
    void showSeatsColor(){
        System.out.println(seatsColor);
    }
    void showRegistrationNo(){
        System.out.println(registrationNo);
    }
    void showIsSunRoof(){
        System.out.println(isSunRoof);
    }


}
