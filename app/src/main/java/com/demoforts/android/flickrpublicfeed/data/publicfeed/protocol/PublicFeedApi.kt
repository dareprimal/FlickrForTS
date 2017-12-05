package com.demoforts.android.flickrpublicfeed.data.publicfeed.protocol

import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.PublicFeedJsonResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

/**
 * Created by Michal S. on 05.12.2017.
 */
interface PublicFeedApi {
    @get:Headers("format: json" )
    @get:GET("feeds/photos_public.gne")
    val publicFeed: Single<PublicFeedJsonResponse>
}