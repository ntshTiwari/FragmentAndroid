package com.example.fragmentandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

//class FragmentOne: Fragment(R.layout.activity_fragment_demo)
///// they both are same
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

class FragmentOne: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_fragment_demo, container, false)
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val someInt = requireArguments().getInt("some_int")
        val newInt = requireArguments().getInt("new_int")
        view.findViewById<TextView>(R.id.textView1).text = "$someInt $newInt"
        super.onViewCreated(view, savedInstanceState)
    }
}
