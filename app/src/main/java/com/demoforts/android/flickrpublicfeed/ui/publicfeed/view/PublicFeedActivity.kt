package com.demoforts.android.flickrpublicfeed.ui.publicfeed.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demoforts.android.flickrpublicfeed.R
import com.demoforts.android.flickrpublicfeed.databinding.ActivityPublicFeedBinding
import com.demoforts.android.flickrpublicfeed.ui.publicfeed.viewmodel.PublicFeedListViewModel

class PublicFeedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val publicFeedViewModel = ViewModelProviders.of(this).get(PublicFeedListViewModel::class.java)
        val binding = DataBindingUtil.setContentView<ActivityPublicFeedBinding>(this, R.layout.activity_public_feed)
        binding.listViewModel = publicFeedViewModel
    }
}
