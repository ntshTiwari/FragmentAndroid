package com.example.fragmentandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /// beacuse of this it will only get created at the start, and not everytime
        if(savedInstanceState == null){
            val bundle = bundleOf("some_int" to 0, "new_int" to 1)

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FragmentOne>(R.id.fragment_container_view, args = bundle)
            }
        }
    }
}