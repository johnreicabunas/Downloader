package com.johnreicabunas.downloadfile

interface Downloader {

    fun downloadFile(url: String): Long
}