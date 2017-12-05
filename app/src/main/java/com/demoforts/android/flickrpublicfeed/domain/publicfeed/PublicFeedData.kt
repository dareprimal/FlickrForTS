package com.demoforts.android.flickrpublicfeed.domain.publicfeed

import com.demoforts.android.flickrpublicfeed.data.publicfeed.network.NetworkConnectionService
import com.demoforts.android.flickrpublicfeed.data.publicfeed.protocol.PublicFeedApi
import com.demoforts.android.flickrpublicfeed.data.publicfeed.response.PublicFeedItemJsonResponse
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

/**
 * Created by Michal S. on 05.12.2017.
 */
class PublicFeedData {

    fun loadData(): Single<List<PublicFeedItem>> {
        return NetworkConnectionService.generateService(PublicFeedApi::class.java)
                .publicFeed.toObservable()
                .flatMapIterable<PublicFeedItemJsonResponse>({ it.items })
                .map { publicFeedItemJsonResponse ->
                    PublicFeedItem(
                            publicFeedItemJsonResponse.title,
                            publicFeedItemJsonResponse.media.m,
                            publicFeedItemJsonResponse.getPublishedDate(),
                            publicFeedItemJsonResponse.getTags())
                }
                .toList().subscribeOn(Schedulers.io())
    }

}