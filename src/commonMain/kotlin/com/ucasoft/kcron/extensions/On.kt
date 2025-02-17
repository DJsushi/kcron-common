package com.ucasoft.kcron.extensions

import com.ucasoft.kcron.common.WeekDays

class On(private val dayOfWeek: String, private val index: Int) {
    constructor(dayOfWeek: WeekDays, index: Int) : this(dayOfWeek.shortName, index)

    override fun toString() = "$dayOfWeek#$index"
}

infix fun Int.on(index: Int) : On = On(this.toString(), index)

infix fun WeekDays.on(index: Int) : On = On(this, index)