package com.example.cristiandev.thirdandroidprosprojectbinding



import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cristiandev.thirdandroidprosprojectbinding.databinding.ActivityDetailBinding
import com.example.cristiandev.thirdandroidprosprojectbinding.model.Movie
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    lateinit var binding:ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_detail)
        val movie: Movie = intent.getParcelableExtra("movie")
        binding.movie = movie

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
