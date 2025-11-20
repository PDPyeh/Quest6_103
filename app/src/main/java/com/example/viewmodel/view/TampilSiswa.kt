package com.example.viewmodel.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.viewmodel.R
import com.example.viewmodel.model.Siswa

@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
){
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama), second = "Contoh Nama"),
        Pair(first = stringResource(id = R.string.gender), second = "Lainnya"),
        Pair(first = stringResource(id = R.string.alamat), second = "Yogyakarta")
    )
}