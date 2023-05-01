public class Temperature {
    
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        double fTemp = 84.0;
        double cTemp = temperature.toCelsius(fTemp);
        System.out.println(cTemp);

        cTemp = 37.2;
        fTemp = temperature.toFahrenheit(cTemp);
        System.out.println(fTemp);
    }
    public double toCelsius(double f){
        return (f - 32.0) / 1.8;
    }
    public double toFahrenheit(double c){
        return (c * 1.8) + 32.0;
    }
}
