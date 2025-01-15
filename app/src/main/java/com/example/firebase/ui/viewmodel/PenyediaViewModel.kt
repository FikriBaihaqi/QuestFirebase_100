package com.example.firebase.ui.viewmodel

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebase.MahasiswaApplications

object PenyediaViewModel {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                mahasiswaApplications().container.mahasiswaRepository
            )
        }
        initializer {
            InsertViewModel(
                mahasiswaApplications().container.mahasiswaRepository
            )
        }

    }

}

fun CreationExtras.mahasiswaApplications(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)