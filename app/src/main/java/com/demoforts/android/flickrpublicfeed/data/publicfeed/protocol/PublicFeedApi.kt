package com.demoforts.android.flickrpublicfeed.data.publicfeed.protocol

import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.PublicFeedJsonResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

/**
 * Created by Michal S. on 05.12.2017.
 */
interface PublicFeedApi {
    @get:GET("feeds/photos_public.gne?format=json&nojsoncallback=1")
    val publicFeed: Single<PublicFeedJsonResponse>
}