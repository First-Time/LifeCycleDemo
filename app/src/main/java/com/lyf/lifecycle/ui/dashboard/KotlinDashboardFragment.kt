package com.lyf.lifecycle.ui.dashboard

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lyf.lifecycle.R

class KotlinDashboardFragment : Fragment() {

    val TAG = KotlinDashboardFragment::class.java.simpleName

    private lateinit var dashboardViewModel: KotlinDashboardViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("$TAG onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("$TAG onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("$TAG onCreateView")
        dashboardViewModel =
            ViewModelProvider(this).get(KotlinDashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_kotlin_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("$TAG onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("$TAG onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        println("$TAG onStart")
    }

    override fun onResume() {
        super.onResume()
        println("$TAG onResume")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG onPause")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("$TAG onDetach")
    }
}