package ru.gb.gb_popular_libs.lession1.presenter

import ru.gb.gb_popular_libs.lession1.view.MainView
import ru.gb.gb_popular_libs.lession1.model.CountersModel
import ru.gb.gb_popular_libs.lession1.utils.Numbers

class MainPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun counterClick(buttonCounterNumber: Numbers) {
        when (buttonCounterNumber) {
            Numbers.ONE -> view.setButton1Text(model.next(0).toString())
            Numbers.TWO -> view.setButton2Text(model.next(1).toString())
            Numbers.THREE -> view.setButton3Text(model.next(2).toString())
        }
    }
}