package com.dev.navigasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dev.navigasi.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MahasiswaViewModel : ViewModel() {

    // MutableStateFlow untuk internal
    private val _mahasiswaStateUI = MutableStateFlow(Mahasiswa())

    // StateFlow untuk diekspos (read-only)
    val mahasiswaUiState: StateFlow<Mahasiswa> = _mahasiswaStateUI

    // Fungsi untuk menyimpan atau memperbarui data Mahasiswa
    fun saveDataMahasiswa(mahasiswa: Mahasiswa) {
        viewModelScope.launch {
            _mahasiswaStateUI.value = mahasiswa
        }
    }
}
