package com.ashypilov.harrypotterquize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class ChangeQuizActivity : AppCompatActivity() {

    private var mUserNAme: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_quiz)
        mUserNAme = intent.getStringExtra(Constants.USER_NAME)

    }

    fun onClickPhrases(view: View) {
        val intent = Intent(this, QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USER_NAME, mUserNAme)
        intent.putExtra(Constants.QUESTIONS, Constants.QUESTIONS_PHRASES)
        startActivity(intent)
        finish()
    }

    fun onClickHarry(view: View) {

        val intent = Intent(this, QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USER_NAME, mUserNAme)
        intent.putExtra(Constants.QUESTIONS, Constants.QUESTIONS_HARRY_POTTER)
        startActivity(intent)
        finish()
    }

    fun onClickHogwarts(view: View) {

        val intent = Intent(this, QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USER_NAME, mUserNAme)
        intent.putExtra(Constants.QUESTIONS, Constants.QUESTIONS_HOGWARTS)
        startActivity(intent)
        finish()
    }

    fun onClickOther(view: View) {

        val intent = Intent(this, QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USER_NAME, mUserNAme)
        intent.putExtra(Constants.QUESTIONS, Constants.QUESTIONS_OTHER)
        startActivity(intent)
        finish()
    }


}
