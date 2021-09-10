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

//      문법 연습 (조건문)

//        나이를 확인해서 -> 성인인지 / 아닌지

        val userAge = 18
        if(userAge >= 20){
            Log.d("성인판별","성인이 맞습니다.")
        }
        else if(userAge >= 17){
            Log.d("성인판별","고등학생")
        }
        else{
            Log.d("성인판별","성인이 아닙니다.")
        }



//      문법 연습(변수)

//        변수 만들기
//        val myName :  String    // value : 상수
//        var myAge : Int         // variable : 변수

        val myName = "강중걸"

        Log.d("변수값",myName)

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