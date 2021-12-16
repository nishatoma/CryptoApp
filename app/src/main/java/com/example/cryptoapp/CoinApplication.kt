package com.example.cryptoapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// This class will provide Dagger Hilt info
// About our application
@HiltAndroidApp
class CoinApplication : Application()