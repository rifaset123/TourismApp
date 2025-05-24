package com.example.core.domain.usecase

import com.example.core.domain.model.Tourism
import com.example.core.domain.repository.ITourismRepository

// implementasi dari Use Case
class TourismInteractor(private val tourismRepository: ITourismRepository): TourismUseCase {

    override fun getAllTourism() = tourismRepository.getAllTourism()

    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = tourismRepository.setFavoriteTourism(tourism, state)
}