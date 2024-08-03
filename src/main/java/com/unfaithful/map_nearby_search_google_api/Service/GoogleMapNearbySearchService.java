package com.unfaithful.map_nearby_search_google_api.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.unfaithful.map_nearby_search_google_api.DTO.GoogleMapNearbySearchApiResultDTO;

import java.util.List;

public interface GoogleMapNearbySearchService {
    List<GoogleMapNearbySearchApiResultDTO> getNearbySearchPlaces(double latitude, double longitude, int radius) throws JsonProcessingException;
}
