class WeatherForecast
{
    static byte forecastID = 1;          
    static short windSpeed = 15;             
    static int tempCelsius = 30;              
    static long humidityCount = 6050L;     
    static float rainChance = 12.5f;            
    static double pressure = 1013.25;     
    static char conditionCode = 'S';       
    static boolean isAlert = false;            
    static String todayCondition = "Sunny";
    static String[] nextDays = {"Rainy", "Cloudy", "Sunny", "Stormy"};
    public static void main(String[] args) {
        forecastID = 2;
        windSpeed = 25;
        tempCelsius = 22;
        humidityCount = 7550L;
        rainChance = 65.0f;
        pressure = 1009.75;
        conditionCode = 'R';
        isAlert = true;
        todayCondition = "Rainy";
        System.out.println("Forecast ID: " + forecastID);
        System.out.println("Temperature: " + tempCelsius);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Humidity: " + humidityCount);
        System.out.println("Rain Chance: " + rainChance);
        System.out.println("Pressure: " + pressure);
        System.out.println("Condition Code: " + conditionCode);
        System.out.println("Alert: " + isAlert);
        System.out.println("Today's Weather: " + todayCondition);
        System.out.println("Next Days Forecast: " + nextDays[2]);
    }
}
