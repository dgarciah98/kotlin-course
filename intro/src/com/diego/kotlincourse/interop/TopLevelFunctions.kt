@file:JvmName("UtilityClass")
package com.diego.kotlincourse.interop

import com.diego.kotlincourse.tidbits.Copyright

const val CopyrightYear = 2022
fun prefix(prefix: String, value: String): String{
    return "$prefix-$value"
}