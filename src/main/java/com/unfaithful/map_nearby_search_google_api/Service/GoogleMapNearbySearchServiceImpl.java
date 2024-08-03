package com.unfaithful.map_nearby_search_google_api.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.unfaithful.map_nearby_search_google_api.DAO.GoogleMapNearbySearchRepository;
import com.unfaithful.map_nearby_search_google_api.DTO.GoogleMapNearbySearchApiResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoogleMapNearbySearchServiceImpl implements GoogleMapNearbySearchService{
    private final GoogleMapNearbySearchRepository googleMapNearbySearchRepository;

    @Autowired
    public GoogleMapNearbySearchServiceImpl(GoogleMapNearbySearchRepository googleMapNearbySearchRepository) {
        this.googleMapNearbySearchRepository = googleMapNearbySearchRepository;
    }
    @Override
    public List<GoogleMapNearbySearchApiResultDTO> getNearbySearchPlaces(double latitude, double longitude, int radius) throws JsonProcessingException {
        return this.googleMapNearbySearchRepository.getNearbySearchPlaces(latitude, longitude, radius);
    }
}
