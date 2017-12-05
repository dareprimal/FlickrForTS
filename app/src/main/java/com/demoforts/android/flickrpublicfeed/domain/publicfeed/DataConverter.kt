package com.demoforts.android.flickrpublicfeed.domain.publicfeed

import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.PublicFeedItemJsonResponse
import java.text.DateFormat
import java.text.ParseException
import java.util.Date

/**
 * Created by Michal S. on 05.12.2017.
 * Converters for json data strings to final structure
 */
fun PublicFeedItemJsonResponse.getPublishedDate(): Date? {
    val datePattern = "yyyy-MM-dd'T'HH:mm:ss'Z'"
    val dateFormater: DateFormat = java.text.SimpleDateFormat(datePattern, java.util.Locale.getDefault())
    published?.let {
        return try {
            dateFormater.parse(it)
        } catch (e: ParseException) {
            null
        }
    }
    return null
}

fun PublicFeedItemJsonResponse.getTags(): List<String> {
    val tagsSeparator = " "
    return tags.split(tagsSeparator.toRegex()).dropLastWhile { it.isEmpty() }.toList()
}