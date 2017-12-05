package com.demoforts.android.flickrpublicfeed.ui.publicfeed.databinding

import com.demoforts.android.flickrpublicfeed.domain.publicfeed.getTags
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Created by Michal S. on 05.12.2017.
 */
class TagsListToStringConverter :  StringSpec() {
    init {
        "Empty tags list should return empty string" {
            val tags: List<String> = ArrayList(0)
            val actualString = max3tagsToString(tags)

            actualString shouldBe ""
        }

        "One tag in list should return string with it" {
            val tags: ArrayList<String> = ArrayList(1)
            tags.add("Tag1")
            val actualString = max3tagsToString(tags)

            actualString shouldBe "Tag1 "
        }

        "Three tags in list should return string with them" {
            val tags: ArrayList<String> = ArrayList(1)
            tags.add("Tag1")
            tags.add("Tag2")
            tags.add("Tag3")
            val actualString = max3tagsToString(tags)

            actualString shouldBe "Tag1 Tag2 Tag3 "
        }

        "Four tags in list should return string with three" {
            val tags: ArrayList<String> = ArrayList(1)
            tags.add("Tag1")
            tags.add("Tag2")
            tags.add("Tag3")
            tags.add("Tag4")
            val actualString = max3tagsToString(tags)

            actualString shouldBe "Tag1 Tag2 Tag3 "
        }

    }

}