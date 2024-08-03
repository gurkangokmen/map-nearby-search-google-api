package com.unfaithful.map_nearby_search_google_api.DAO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.unfaithful.map_nearby_search_google_api.DTO.GoogleMapNearbySearchApiResultDTO;

import java.util.List;

public interface GoogleMapNearbySearchRepository {
    List<GoogleMapNearbySearchApiResultDTO> getNearbySearchPlaces(double latitude, double longitude, int radius) throws JsonProcessingException;
}
