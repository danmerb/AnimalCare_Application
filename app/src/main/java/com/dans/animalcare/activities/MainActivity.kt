package com.dans.animalcare.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dans.animalcare.R
import com.dans.animalcare.adapter.LeyAdapter
import com.dans.animalcare.viewModels.ViewModelRoom

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ViewModelRoom
    lateinit var leyAdapter: LeyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
println()

        val intent =  intent?.getIntExtra("Key", 2)
























































































        Log.d("xd", intent.toString())
/*
        leyAdapter = LeyAdapter(emptyList())

        rv_leyesMainAct.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = leyAdapter
        }

        viewModel = ViewModelProviders.of(this).get(ViewModelRoom::class.java)
        viewModel.getAllLeyes()
        viewModel.listaLeyes.observe(this, Observer {listaDeLeyes->
            leyAdapter.updateList(listaDeLeyes)
           for (ley in listaDeLeyes){

               Log.v("Ley", ley.apartado)
           }
        })
        */
    }
}
