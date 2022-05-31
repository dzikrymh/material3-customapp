package com.example.customapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.customapplication.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivity = this

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navDrawer: NavigationView = binding.navDrawer
        val navView: BottomNavigationView = binding.navView

        navView.setupWithNavController(navController)
        navDrawer.setupWithNavController(navController)
    }

    private val navController by lazy {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        navHostFragment.navController
    }

    companion object {
        lateinit var mainActivity: MainActivity

        fun howToOpenDrawer() {
            val drawer: DrawerLayout = mainActivity.findViewById(R.id.drawer_layout)

            drawer.open()
        }
    }
}