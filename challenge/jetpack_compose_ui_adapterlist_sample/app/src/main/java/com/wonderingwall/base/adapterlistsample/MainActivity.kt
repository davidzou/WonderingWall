package com.wonderingwall.base.adapterlistsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {
            Text("Hello World")
        }
//        AdapterList(
//                data = (1..20).map { it }.toList()
//        ) {
//            if (it % 2 == 0) {
//                Text("$it Even", style = TextStyle(fontSize = 40.sp, color = Color.Gray))
//            } else {
//                Text(text = "$it Odd", style = TextStyle(fontSize = 70.sp))
//            }
//        }
    }
}
