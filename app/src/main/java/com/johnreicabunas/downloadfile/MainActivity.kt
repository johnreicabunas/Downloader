package com.johnreicabunas.downloadfile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.johnreicabunas.downloadfile.ui.theme.DownloadFileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val downloader = DownloaderImpl(this)
        downloader.downloadFile("https://www.dropbox.com/sh/ra2j29npvzrvrwh/AACvQiyq9OICs5EGyanO0AToa/14K?dl=0&preview=0000_14K_48Sample_R100.wav")
        super.onCreate(savedInstanceState)
        setContent {
            DownloadFileTheme {

            }
        }
    }
}