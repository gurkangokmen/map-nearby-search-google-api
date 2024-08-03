package com.unfaithful.map_nearby_search_google_api.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoogleMapNearbySearchApiResponseDTO {
    private List<GoogleMapNearbySearchApiResultDTO> results;
}
