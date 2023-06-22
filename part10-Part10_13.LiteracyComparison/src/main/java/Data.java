public class Data {
    private String country;
    private String year;
    private String gender;
    private double percent;

    public Data(String country, String year, String gender, String percent) {
        this.country = country;
        this.year = year;
        this.gender = giveGender(gender);
        this.percent = Double.parseDouble(percent);
    }

    public double getPercent() {
        return this.percent;
    }

    public String giveGender(String gender) {
        if(gender.contains("female")) {
            return "female";
        } else {
            return "male";
        }
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }
}
