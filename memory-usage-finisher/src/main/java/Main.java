public class Main {
    public static void main(String[] args) {
        while (true) {
            MemoryUsageFinisher.checkMemoryUsage();
            try {
                Thread.sleep(5000); // Verificar a cada 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
