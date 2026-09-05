/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
        assertEquals(373.15, converter.celsiusToKelvin(100), 0.01);
    }

    @Test
    void testRoundTrip() {
        double original = 37.5;
        double converted = converter.fahrenheitToCelsius(converter.celsiusToFahrenheit(original));
        assertEquals(original, converted, 0.01);
    }
}