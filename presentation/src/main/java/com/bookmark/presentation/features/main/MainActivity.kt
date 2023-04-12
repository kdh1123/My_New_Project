package com.bookmark.presentation.features.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.bookmark.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, com.bookmark.presentation.R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.executePendingBindings()

        initNavigation()
    }

    private fun initNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(com.bookmark.presentation.R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        binding.navBar
            .setupWithNavController(navController)
    }
}