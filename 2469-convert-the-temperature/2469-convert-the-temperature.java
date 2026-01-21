class Solution {
    public double[] convertTemperature(double celsius) {
        double[] array = new double[2];
        array[0] = celsius + 273.15;
        array[1] = celsius * 1.80 + 32.00;
        return array;
    }
}