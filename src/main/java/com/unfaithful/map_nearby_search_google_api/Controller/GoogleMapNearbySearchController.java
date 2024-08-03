package com.unfaithful.map_nearby_search_google_api.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.unfaithful.map_nearby_search_google_api.DTO.GoogleMapNearbySearchApiResultDTO;
import com.unfaithful.map_nearby_search_google_api.Service.GoogleMapNearbySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/google-nearby-search-api")
public class GoogleMapNearbySearchController {
    private GoogleMapNearbySearchService googleMapNearbySearchService;

    @Autowired
    public GoogleMapNearbySearchController(GoogleMapNearbySearchService googleMapNearbySearchService){
        this.googleMapNearbySearchService = googleMapNearbySearchService;
    }

    @GetMapping("/lat/{lat}/lng/{lng}/radius/{radius}")
    public List<GoogleMapNearbySearchApiResultDTO> getNearbySearchPlaces(@PathVariable(name = "lat") double latitude, @PathVariable(name = "lng") double longitude, @PathVariable int radius) throws JsonProcessingException {
        return this.googleMapNearbySearchService.getNearbySearchPlaces(latitude, longitude, radius);
    }

}
