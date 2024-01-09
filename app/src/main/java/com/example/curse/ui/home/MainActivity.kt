package com.example.curse.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.curse.R
import com.example.curse.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var bilding:ActivityMainBinding
    private lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bilding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bilding.root)
        initUI()
    }

    private fun initUI() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHost: NavHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentNavContainer) as NavHostFragment
        navController = navHost.navController
        bilding.bottomNavView.setupWithNavController(navController)
    }
}