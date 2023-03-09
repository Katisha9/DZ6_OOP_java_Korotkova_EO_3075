

public class Weather {

    private String date;
    private String description;

    private String minTemp;

    private String maxTemp;

    public Weather() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return "Погода" +
                " на: " + date + '\n' +
                "Описание: " + description + '\n' +
                "Минимальная температура (Фарингейт): " + minTemp + '\n' +
                "Максимальная температура (Фарингейт): " + maxTemp + '\n';
    }
}

