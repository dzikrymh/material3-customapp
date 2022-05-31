package com.example.customapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.customapplication.databinding.ActivityMainBinding
import com.example.customapplication.ui.profile.ProfileFragment
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

        fun animate(hide: Boolean) {
            val bottom: BottomNavigationView = mainActivity.findViewById(R.id.nav_view)
            val moveY = if (hide) 3 * bottom.height else 0
            bottom.animate()
                .translationY(moveY.toFloat())
                .setStartDelay(100)
                .setDuration(400)
                .start()
        }

        fun howToOpenDrawer() {
            val drawer: DrawerLayout = mainActivity.findViewById(R.id.drawer_layout)

            drawer.open()
        }
    }
}