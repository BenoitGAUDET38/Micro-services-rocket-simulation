package fr.teama.weatherservice.controllers;

import fr.teama.weatherservice.helpers.LoggerHelper;
import fr.teama.weatherservice.interfaces.IWeatherAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin
@RequestMapping(path = WeatherController.BASE_URI, produces = APPLICATION_JSON_VALUE)
public class WeatherController {
    public static final String BASE_URI = "/api/weather";

    @Autowired
    private IWeatherAnalyzer weatherAnalyzer;

    @GetMapping
    public ResponseEntity<String> getWeatherStatus() {
        ResponseEntity<String> response = weatherAnalyzer.getWeatherStatus();
        LoggerHelper.logInfo("The weather status has been get with value : " + response.getBody());
        return response;
    }
}
