package com.demoforts.android.flickrpublicfeed.domain.publicfeed

import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.MediaJsonResponse
import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.PublicFeedItemJsonResponse
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import java.util.*

/**
 * Created by Michal S. on 05.12.2017.
 * Tests for PublicFeedItemJsonResponse.getPublishedDate()
 */
class DataConverterTest : StringSpec() {
    init {
        "Null as published date should return null" {
            val response = responseWithDate(null);
            val actualDate = response.getPublishedDate()

            actualDate shouldBe null
        }

        "Correct date format should return valid date" {
            val response = responseWithDate("2017-12-02T00:34:54Z")
            val actualDate: Date? = response.getPublishedDate()
            val expectedTime = 1512171294000

            actualDate shouldBe Date(expectedTime)
        }

        "Incorrect date format should return null" {
            val response = responseWithDate("20171202T00:34:54Z")
            val actualDate: Date? = response.getPublishedDate()

            actualDate shouldBe null
        }
    }

    private fun responseWithDate(publishedDate: String?): PublicFeedItemJsonResponse {
        return PublicFeedItemJsonResponse("title", publishedDate, "tags", MediaJsonResponse("m"))
    }
}