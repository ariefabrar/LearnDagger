package com.muhammadabrararief.learndagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var wheel: Wheel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val engine = Engine()
//        val wheel = Wheel()
//
//        car = Car(engine, wheel)

        val carComponent = DaggerCarComponent.create()

        carComponent.inject(this)

//        car = carComponent.getCar()
        car.driving()

//        wheel = carComponent.getWheel()
        wheel.spin()
    }
}