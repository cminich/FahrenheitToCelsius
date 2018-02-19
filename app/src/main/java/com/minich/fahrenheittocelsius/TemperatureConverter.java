package com.minich.fahrenheittocelsius;

public class TemperatureConverter
{
    // instance variables
    private int myFahrenheitTemp;

    // constructors
    public TemperatureConverter()
    {
        myFahrenheitTemp = 0;
    }

    // accessors
    public int getFahrenheitTemp()
    {
        return myFahrenheitTemp;
    }

    // modifiers
    public void setMyFahrenheitTemp(int fahrenheitTemp)
    {
        myFahrenheitTemp = fahrenheitTemp;
    }

    // interesting methods
    public int convertToCel()
    {
        return (int) ((myFahrenheitTemp - 32) * 5. / 9.);
    }

    public int convertToKelvin()
    {
        // TODO: finish
        return 0;
    }

    public String toString()
    {
        return "Fahrenheit Temp is " + myFahrenheitTemp;
    }

}
