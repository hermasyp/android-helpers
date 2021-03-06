package com.dg.helpers

@Suppress("unused")
object BooleanHelper
{
    @Suppress("MemberVisibilityCanBePrivate")
    fun withObject(value: Any?): Boolean?
    {
        return if (value == null)
            null
        else value as? Boolean ?: when (value)
        {
            is Int -> value != 0
            is Short -> value != 0
            else -> null
        }
    }

    fun withObject(value: Any?, defaultValue: Boolean): Boolean
    {
        return withObject(value) ?: defaultValue
    }
}
