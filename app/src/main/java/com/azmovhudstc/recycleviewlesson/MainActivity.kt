package com.azmovhudstc.recycleviewlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.azmovhudstc.recycleviewlesson.adapter.MovieAdpater
import com.azmovhudstc.recycleviewlesson.model.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private lateinit var arrayList:ArrayList<Movie>
   private lateinit var movieAdpater: MovieAdpater
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.layoutManager=LinearLayoutManager(this)
        movieAdpater=MovieAdpater(loadData())
        rv.adapter=movieAdpater


    }
  private  fun loadData():ArrayList<Movie>{
        arrayList= ArrayList()
        arrayList.add(Movie(R.drawable.avengers,"Avengers Marvel","Views :1500","Realse Date :16.03.2018"))
      arrayList.add(Movie(R.drawable.alice,"Alice in border Netflix","Views :12M","Realse Date :25.11.2021"))
      arrayList.add(Movie(R.drawable.ultronave,"Avengers Ultron Age Marvel","Views :1500","Realse Date :11.03.2019"))
        arrayList.add(Movie(R.drawable.avengersnfitywr,"Avengers War Marvel","Views :12M","Realse Date :12.03.2020"))
        arrayList.add(Movie(R.drawable.iroman,"Iroman 3 Marvel","15M","Realse Date :16.03.2021"))
        arrayList.add(Movie(R.drawable.arcane,"Arcane Netflix ","20M","Realse Date :16.12.2021"))
        arrayList.add(Movie(R.drawable.moonknight,"Moon Knight Marvel","Views :120M","Realse Date :12.03.2022"))
        arrayList.add(Movie(R.drawable.spiderman3,"Spiderman 3 Marvel","Views :120M","Realse Date :10.12.2021"))
        return arrayList
    }
}