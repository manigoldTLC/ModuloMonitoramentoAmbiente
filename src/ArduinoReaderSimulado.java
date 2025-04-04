import java.util.Random;

public class ArduinoReaderSimulado {
    private Random random;

    // Construtor
    public ArduinoReaderSimulado() {
        this.random = new Random();
    }

    // Simula a leitura dos sensores gerando valores aleatórios
    public SensorData lerDadosSensores() {
        float temperatura = 20 + random.nextFloat() * 15; // 20°C a 35°C
        int umidade = random.nextInt(101); // 0% a 100%
        int luminosidade = random.nextInt(101); // 0% a 100%

        return new SensorData(temperatura, umidade, luminosidade);
    }
}