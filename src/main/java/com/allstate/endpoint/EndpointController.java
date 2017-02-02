package com.allstate.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EndpointController {
    @GetMapping("/drivers/{driverId}/trips")
    public String getDriverTrips(@PathVariable String driverId) {
        return String.format("you are looking for driver id: %s", driverId);
    }

    @GetMapping("/drivers/{driverId}/trips/{tripId}")
    public String getDriverTrips(@PathVariable String driverId, @PathVariable Integer tripId) {
        return String.format("you are looking for driver id: %s and your TripId is: %d", driverId, tripId);
    }

    @GetMapping("/test/tasks/{taskId}/comments/{commentId}")
    public String getTasks(@PathVariable Map abc) {
        return String.format("my output of taskId is %s and commentId is %s", abc.get("taskId"), abc.get("commentId"));
    }

    @GetMapping("/vehicles")
    public Map<String, Integer> getIndexEndpoint(
            @RequestParam(value = "year", required = false, defaultValue = "1999") int year,
            @RequestParam(value = "doors", required = false, defaultValue = "2") int doors) {
        Map<String, Integer> map = new HashMap<>();
        map.put("year", year);
        map.put("doors", doors);
        return map;
    }
}
