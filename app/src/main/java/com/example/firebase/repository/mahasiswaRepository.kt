package com.example.firebase.repository

import com.example.firebase.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface mahasiswaRepository {
    suspend fun getmahasiswa(): Flow<List<Mahasiswa>>

    suspend fun insetmahasiswa(mahasiswa: Mahasiswa)

    suspend fun updatemahasiswa(nim: String, mahasiswa: Mahasiswa)

    suspend fun deletemahasiswa(nim: String)

    suspend fun getmahasiswaById(nim: String): Flow<Mahasiswa>
}