package com.lyf.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.lyf.lifecycle.fragment.basic.java.JavaFragmentActivity
import com.lyf.lifecycle.fragment.drawer.java.JavaNavigationDrawerActivity
import kotlinx.android.synthetic.main.activity_main.*

class KotlinMainActivity : AppCompatActivity() {

    lateinit var TAG: String

    fun showDialog(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("提示")
            .setMessage("这个一个普通对话框")
            .setCancelable(true)
            .setPositiveButton("确定") { dialog, _ ->
                Toast.makeText(this@KotlinMainActivity, "你点击了确定", Toast.LENGTH_SHORT)
                dialog?.dismiss()
            }
            .setNegativeButton("取消") { dialog, _ ->
                Toast.makeText(this@KotlinMainActivity, "你点击了取消", Toast.LENGTH_SHORT);
                dialog?.dismiss()
            }.show()

    }

    fun jump2(view: View) {
        startActivity(Intent(this, KotlinSecondActivity::class.java))
    }

    fun jump3(view: View) {
        startActivity(Intent(this, KotlinFullscreenActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TAG = localClassName
        println("$TAG onCreate")

        tv_activity4.setOnClickListener {
            startActivity(Intent(this, JavaFullscreenActivity::class.java))
        }

        tv_activity5.setOnClickListener {
            startActivity(Intent(this, KotlinBottomNavigationActivity::class.java))
        }

        tv_activity6.setOnClickListener {
            startActivity(Intent(this, JavaBottomNavigationActivity::class.java))
        }

        tv_activity7.setOnClickListener {
            startActivity(Intent(this, JavaNavigationDrawerActivity::class.java))
        }

        tv_activity8.setOnClickListener {
            startActivity(Intent(this, JavaFragmentActivity::class.java))
        }
    }

    override fun onRestart() {
        super.onRestart()
        println("$TAG onRestart")
    }

    override fun onStart() {
        super.onStart()
        println("$TAG onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        println("$TAG onRestoreInstanceState")
        if (savedInstanceState != null) {
            val params = savedInstanceState.getString("KotlinMainActivity")
            println("$TAG on $params")
        }
    }

    override fun onResume() {
        super.onResume()
        println("$TAG onResume")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("KotlinMainActivity", "KotlinMainActivity")
        println("$TAG onSaveInstanceState")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG onDestroy")
    }
}
