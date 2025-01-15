package com.example.firebase.repository

import com.example.firebase.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface mahasiswaRepository {
    suspend fun getmahasiswa(): Flow<List<Mahasiswa>>

    suspend fun insertmahasiswa(mahasiswa: Mahasiswa)

    suspend fun updatemahasiswa(mahasiswa: Mahasiswa)

    suspend fun deletemahasiswa(nim: String)

    suspend fun getmahasiswaById(nim: String): Flow<Mahasiswa>
}