package com.baz.app

import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState: Bundle?)
        
        // একটি টেক্সটভিউ তৈরি করা হচ্ছে স্ক্রিনে আউটপুট দেখানোর জন্য
        val textView = TextView(this)
        textView.textSize = 20f
        textView.gravity = Gravity.CENTER
        
        // আপনার কাঙ্ক্ষিত কোডের আউটপুট টেক্সট
        val outputText = "hey Baazigar\n\tHlw Bazzz\n\"Who am i\"\nF\nU\nC\nK\n"
        
        textView.text = outputText
        setContentView(textView)
    }
}
