package com.example.weather_app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class FavoriteViewModel() : ViewModel(){

    private val _favoriteList = MutableLiveData<MutableList<FavoriteModel>>()
    val favoriteList: LiveData<MutableList<FavoriteModel>>
        get() = _favoriteList


    init {
        val example : MutableList<FavoriteModel> = mutableListOf(
            FavoriteModel(0, "나의 위치", "서울특별시", "-7°", "최고 -2°  최저 -8°"),
            FavoriteModel(1, "동작구", "오후 16:00", "-8°", "최고 -2°  최저 -8°"),
            FavoriteModel(2, "어쩌구", "오후 16:00", "-6°", "최고 -2°  최저 -8°")
        )

        _favoriteList.value = example
    }

}

class FavoriteViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoriteViewModel::class.java)) {
            return FavoriteViewModel() as T
        } else {
            throw IllegalArgumentException("Not found ViewModel class.")
        }
    }
}
