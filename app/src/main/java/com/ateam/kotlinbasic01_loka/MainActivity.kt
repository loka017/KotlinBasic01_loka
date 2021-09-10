package com.ateam.kotlinbasic01_loka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

//                    코드에 메모남기기-주석
//            Ctrl + /
            Log.d("메인화면로그", "클릭용 버튼 눌림")// 디버그
            Log.e("메인화면로그", "에러관련 로그")// 에러
        }

        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은 버튼이 눌림", Toast.LENGTH_SHORT).show()

        }
    }
}