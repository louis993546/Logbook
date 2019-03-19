package io.github.louistsaitszho.logbook

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LateinitObservable<T : Any>(private val afterSet: ((T?, T) -> Unit)? = null) : ReadWriteProperty<Any, T> {
    private lateinit var currentValue: T

    override fun getValue(thisRef: Any, property: KProperty<*>): T = currentValue

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        val oldValue = if (::currentValue.isInitialized) currentValue else null
        currentValue = value
        afterSet?.invoke(oldValue, currentValue)
    }
}