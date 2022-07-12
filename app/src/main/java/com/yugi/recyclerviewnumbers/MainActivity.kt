package com.yugi.recyclerviewnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yugi.recyclerviewnumbers.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var numberList = displayFibonacci(100)
        println(numberList)

        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
//        binding.rvNumbers.adapter=NumbersRecyclerView()
    }
}
fun main(){
 displayFibonacci(100)
}

fun displayFibonacci(size:Int):MutableList<BigInteger>{
    var fibList= mutableListOf(BigInteger.ZERO,BigInteger.ONE)
    while (fibList.size<size){
        var last=fibList.get(fibList.lastIndex)
        var secondLast=fibList.get(fibList.lastIndex-1)
        var next=last+secondLast
        fibList.add(next)
    }
    println(fibList.size)
    println(fibList)
    return fibList

}

