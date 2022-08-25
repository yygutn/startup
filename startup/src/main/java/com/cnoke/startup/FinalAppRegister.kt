package com.cnoke.startup

import android.content.Context
import android.content.res.Configuration
import com.cnoke.startup.application.IApplication

/**
 * @author huanghui
 * @date on 2021/12/27
 * @title
 * @describe
 */
internal class FinalAppRegister{

    private val applist : MutableList<IApplication> = mutableListOf()

    init {
        init()
    }

    private fun init() {
    }

    fun register(app : IApplication) {
        applist.add(app)
    }

    fun attachBaseContext(context: Context) {
        for (it in applist) {
            it.attachBaseContext(context)
        }
    }

    fun onCreate() {
        for (it in applist) {
            it.onCreate()
        }
    }

    fun onTerminate() {
        for (it in applist) {
            it.onTerminate()
        }
    }

    fun onLowMemory() {
        for (it in applist) {
            it.onLowMemory()
        }
    }

    fun onTrimMemory(level: Int) {
        for (it in applist) {
            it.onTrimMemory(level)
        }
    }

    fun onConfigurationChanged(newConfig: Configuration) {
        for (it in applist) {
            it.onConfigurationChanged(newConfig)
        }
    }
}