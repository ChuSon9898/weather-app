package com.example.weather_app.domain.usecase.bookmark

import com.example.weather_app.domain.repository.room.BookmarkRepository
import javax.inject.Inject

class GetDataByLocationUseCase @Inject constructor (private val repository: BookmarkRepository) {
    operator fun invoke(sLocation: String) = repository.getDataByLocation(sLocation)
}