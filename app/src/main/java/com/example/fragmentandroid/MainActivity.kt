package com.example.fragmentandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace

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

        findViewById<Button>(R.id.button1).setOnClickListener {
            replaceFragment()
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            rollback()
        }
    }

    fun replaceFragment() {
        /// this way we create a transaction
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace<FragmentReplaced>(R.id.fragment_container_view, "We can add a random tag like this")
            /// this way we save this transaction
            addToBackStack("replacement")
        }
    }

    fun rollback() {
        /// we can restore transactions like this
        supportFragmentManager.saveBackStack("replacement")
    }

    /// we can get a fragment by tag
//    val fragment: FragmentReplaced =
//        supportFragmentManager.findFragmentByTag("We can add a random tag like this") as FragmentReplaced
}