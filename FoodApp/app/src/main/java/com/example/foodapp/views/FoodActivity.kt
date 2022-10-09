package com.example.foodapp.views
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.foodapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class FoodActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
      //  setupNavController()
        setupNavControllerWithBottomNavigation()
    }
private fun setupNavControllerWithBottomNavigation(){
    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
    navController = navHostFragment.navController
    val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
    setupWithNavController(bottomNavigationView, navController)
}
    private fun setupNavController() {
        // get the nav host fragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment

    }

}