package com.farhan.myapplication.ui.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.farhan.myapplication.data.local.FavoriteUser
import com.farhan.myapplication.data.local.FavoriteUserDao
import com.farhan.myapplication.data.local.UserDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private var userDao: FavoriteUserDao?
    private var userDb: UserDatabase?

    init {
        userDb = UserDatabase.getDatabase(application)
        userDao = userDb?.favoriteUserDao()
    }

    fun getFavUser(): LiveData<List<FavoriteUser>>?{
        return userDao?.getFavoriteUser()
    }
}