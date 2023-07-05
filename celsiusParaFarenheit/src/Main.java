public class Main {

    public static void main(String[] args) {
        double celsius = 22;
        double farenheit = (celsius * 1.8) + 32;
        int farenheitInt = (int) farenheit;

        // Print utilizando text block e .formatted
        System.out.println("""
                           Temperatura em Farenheit: %.1f°
                           Temperatura em Farenheit com casting para inteiro: %d°
                           """.formatted(farenheit, farenheitInt));

    }
}