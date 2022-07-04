package com.yugi.recyclerviewnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yugi.recyclerviewnumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var numberList = displayFibonacci(100)
        println(numberList)
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        binding.rvNumbers.adapter=NumbersRecyclerView(numberList)
    }
}

fun displayFibonacci(size:Int):List<Int>{
    var numbers = listOf<Int>()
    var first = 0
    var firstsecond = 1
    var positions = 0

    while (positions < size){
        first = firstsecond
        var sum = first + firstsecond
        firstsecond = sum

        positions++

        numbers+=firstsecond
    }
    return numbers
}
}