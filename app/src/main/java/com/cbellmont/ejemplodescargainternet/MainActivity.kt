package com.cbellmont.ejemplodescargainternet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

interface MainActivityInterface {
    suspend fun onFilmsReceived(listFilms : List<Film>)
}

// IMPORTANT: Passing the activity to a the receiver is not a good practice, it may cause issues
// with the activity-s lifecycle. We are doing it just to keep the focus on the target of this example
class MainActivity : AppCompatActivity(), MainActivityInterface {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch{
            GetAllFilms.send(this@MainActivity)
        }
    }

    override suspend fun onFilmsReceived(listFilms : List<Film>) {
        tvFilms.text = ""
        withContext(Dispatchers.Main){
            listFilms.forEach {
                tvFilms.append(it.toString())
            }
        }

    }
}