public class Hospital {
    public static int lowerBound = 32;
    public static int upperBound = 40;
    public static double minTemperatureHealthy = 36.2;
    public static double maxTemperatureHealthy = 36.9;

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperature = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            patientsTemperature[i] = ((float) Math.random() * (upperBound - lowerBound)) + lowerBound;
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        float sumTemperature = 0;
        int countHealthy = 0;
        String strArray = "";
        for (float array : temperatureData) {
            strArray += Math.round(array * 10f) / 10f + " ";
            sumTemperature += array;
            countHealthy += (array >= (float) minTemperatureHealthy && array <= (float) maxTemperatureHealthy ? 1 : 0);
        }

        String report =
                "Температуры пациентов: " + strArray.trim() +
                        "\nСредняя температура: " + Math.round(sumTemperature / temperatureData.length * 100f) / 100f +
                        "\nКоличество здоровых: " + countHealthy;

        return report;
    }
}
