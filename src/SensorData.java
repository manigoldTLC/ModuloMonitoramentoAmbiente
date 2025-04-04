public class SensorData {
    private float temperatura;
    private int umidade;
    private int luminosidade;

    // Construtor para inicializar os valores
    public SensorData(float temperatura, int umidade, int luminosidade) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.luminosidade = luminosidade;
    }

    // Getters para acessar os valores dos sensores
    public float getTemperatura() {
        return temperatura;
    }

    public int getUmidade() {
        return umidade;
    }

    public int getLuminosidade() {
        return luminosidade;
    }

    @Override
    public String toString() {
        return "Temperatura: " + temperatura + "°C | Umidade: " + umidade + "% | Luminosidade: " + luminosidade + "%";
    }
}