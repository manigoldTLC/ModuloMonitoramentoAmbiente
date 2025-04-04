public class Main {
    public static void main(String[] args) {
        ArduinoReaderSimulado arduino = new ArduinoReaderSimulado();

        // Simula a leitura dos sensores 5 vezes
        for (int i = 0; i < 5; i++) {
            SensorData dados = arduino.lerDadosSensores();

            // Exibe os valores dos sensores utilizando os getters
            System.out.println("Leitura " + (i + 1) + ":");
            System.out.println("Temperatura: " + String.format("%.1f", dados.getTemperatura()) + "°C");
            System.out.println("Umidade: " + dados.getUmidade() + "%");
            System.out.println("Luminosidade: " + dados.getLuminosidade() + "%");
            System.out.println("-------------------------");

            try {
                Thread.sleep(2000); // Aguarda 2 segundos antes da próxima leitura
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}