package ru.gb.gb_popular_libs.lession1.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gb.gb_popular_libs.lession1.databinding.ActivityMainBinding
import ru.gb.gb_popular_libs.lession1.presenter.MainPresenter
import ru.gb.gb_popular_libs.lession1.utils.Numbers

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setButtonClickListener()
    }

    private fun setButtonClickListener() {
        binding.btnCounter1.setOnClickListener {
            presenter.counterClick(Numbers.ONE)
        }
        binding.btnCounter2.setOnClickListener {
            presenter.counterClick(Numbers.TWO)
        }
        binding.btnCounter3.setOnClickListener {
            presenter.counterClick(Numbers.THREE)
        }
    }

    override fun setButton1Text(text: String) {
        binding.btnCounter1.text = text
    }

    override fun setButton2Text(text: String) {
        binding.btnCounter2.text = text
    }

    override fun setButton3Text(text: String) {
        binding.btnCounter3.text = text
    }
}