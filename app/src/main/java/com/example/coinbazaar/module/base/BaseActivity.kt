package com.example.coinbazaar.module.base

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.coinbazaar.MainActivity

open class BaseActivity : AppCompatActivity() {
    private var actionBarTitle: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun closeActivity() {
        finish()
    }

    fun hideActionBar() {
        supportActionBar?.hide()
    }

    protected fun fragmentManager(): FragmentManager {
        return supportFragmentManager
    }

    protected fun fragmentTransaction(): FragmentTransaction {
        return fragmentManager().beginTransaction()
    }


    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()
    }

    //Add navigate transation
    fun navigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }


    companion object {
        const val NONE = -1
        val TAG = BaseActivity::class.java.name
    }
}