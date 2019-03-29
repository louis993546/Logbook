package io.github.louistsaitszho.logbook.utils

import android.util.Log
import io.github.louistsaitszho.logbook.BuildConfig
import org.koin.core.logger.Level
import org.koin.core.logger.Logger
import org.koin.core.logger.MESSAGE
import timber.log.Timber

//The 1 true king: Timber
fun getTree(): Timber.Tree = if (BuildConfig.DEBUG) Timber.DebugTree() else releaseTree

val releaseTree = object : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        //TODO move this to crashlytics
        when (priority) {
            Log.VERBOSE -> Log.v(tag, message, t)
            Log.DEBUG -> Log.d(tag, message, t)
            Log.INFO -> Log.i(tag, message, t)
            Log.WARN -> Log.w(tag, message, t)
            Log.ERROR -> Log.e(tag, message, t)
            else -> Log.wtf(tag, "lv $priority: $message", t)
        }
    }

}

//All the other libraries's interface on logging -> map to timber
val koinTimberLogger = object : Logger() {
    val TAG = "Koin"
    override fun log(level: Level, msg: MESSAGE) {
        Timber.tag(TAG).apply {
            when (level) {
                Level.DEBUG -> this.d(msg)
                Level.INFO -> this.i(msg)
                Level.ERROR -> this.e(msg)
            }
        }
    }
}