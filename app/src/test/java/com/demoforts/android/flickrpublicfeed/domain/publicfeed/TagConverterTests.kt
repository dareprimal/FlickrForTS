package com.demoforts.android.flickrpublicfeed.domain.publicfeed

import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.MediaJsonResponse
import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.PublicFeedItemJsonResponse
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Created by Michal S. on 05.12.2017.
 * Tests for PublicFeedItemJsonResponse.getTags()
 */
class TagConverterTest : StringSpec() {
    init {
        "Empty tags' string should return empty list" {
            val response = responseWithTags("")
            val actualTags = response.getTags()

            actualTags.size shouldBe 0
        }

        "Specific tags' string should return them as a list list" {
            val response = responseWithTags("tag1 tag2 tag3")
            val actualTags = response.getTags()

            actualTags.get(0) shouldBe "tag1"
            actualTags.get(1) shouldBe "tag2"
            actualTags.get(2) shouldBe "tag3"
            actualTags.size shouldBe 3
        }

        "Tags' string with one tag should return only this tag" {
            val response = responseWithTags("singleTag")
            val actualTags = response.getTags()

            actualTags.get(0) shouldBe "singleTag"
            actualTags.size shouldBe 1
        }
    }

    private fun responseWithTags(tags: String): PublicFeedItemJsonResponse {
        return PublicFeedItemJsonResponse("title", null, tags, MediaJsonResponse("m"))
    }
}