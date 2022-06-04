package com.google.firebase.quickstart.auth.abdialogfragment.ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.quickstart.auth.abdialogfragment.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedViewModel = ViewModelProvider(this).get(SharedViewModel::class.java)
        sharedViewModel.name.observe(this, Observer {
            tvname.text = it
        })



        btnDataDialog.setOnClickListener {
            DialogWithData().show(supportFragmentManager, DialogWithData.TAG)
        }
    }

}