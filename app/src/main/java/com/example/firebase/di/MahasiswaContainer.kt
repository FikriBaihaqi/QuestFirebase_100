package com.example.firebase.di

import com.example.firebase.repository.NetworkMahasiswaRepository
import com.example.firebase.repository.mahasiswaRepository
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer {
    val mahasiswaRepository: mahasiswaRepository
}

class MahasiswaContainer : AppContainer {
    private val firestore : FirebaseFirestore = FirebaseFirestore.getInstance()
    override val mahasiswaRepository: mahasiswaRepository by lazy {
        NetworkMahasiswaRepository(firestore)
    }
}