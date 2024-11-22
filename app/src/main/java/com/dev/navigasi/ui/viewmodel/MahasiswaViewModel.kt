package com.dev.navigasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.dev.navigasi.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class MahasiswaViewModel: ViewModel() {
    private val _mahasiswaStateUI=
        MutableStateFlow(Mahasiswa())


}