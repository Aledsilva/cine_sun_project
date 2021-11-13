package com.example.cinesun.ui.details

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.cinesun.R
import com.example.cinesun.databinding.ActivityDetailsBinding
import com.example.cinesun.databinding.ActivityHomeBinding
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    private lateinit var bindingDetailsBinding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_details)

    }

}