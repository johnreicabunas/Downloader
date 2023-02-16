package com.johnreicabunas.downloadfile

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class DownloaderImpl(
    private val context: Context
): Downloader {

    private val downloadManger = context.getSystemService(DownloadManager::class.java)

    override fun downloadFile(url: String): Long {
        val request = DownloadManager.Request(url.toUri())
            .setMimeType("audio/*")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setTitle("freq.wav")
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "freq.wav")

        return downloadManger.enqueue(request)
    }

}