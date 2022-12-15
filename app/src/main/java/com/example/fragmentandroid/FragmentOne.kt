package com.example.fragmentandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne: Fragment(R.layout.activity_fragment_demo)

//class FragmentOne: Fragment() {
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.activity_fragment_demo, container, false)
////        return super.onCreateView(inflater, container, savedInstanceState)
//    }
//}