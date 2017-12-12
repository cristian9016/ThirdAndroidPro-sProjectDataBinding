package com.example.cristiandev.thirdandroidprosprojectbinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.cristiandev.thirdandroidprosprojectbinding.adapters.MovieAdapter
import com.example.cristiandev.thirdandroidprosprojectbinding.model.Movie
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.util.*

class MainActivity : AppCompatActivity() {

    val adapter:MovieAdapter = MovieAdapter()
    val data:MutableList<Movie> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.adapter = adapter
        adapter.onMovieSelected = this::goToDetail
        adapter.onFavoriteSelected = this::saveFavorite
        loadData()
    }

    fun loadData(){
        data.add(Movie("https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2017/10/star-wars-ultimos-jedi-poster-pelicula-leia-como-personaje-central.jpg","StarWars VIII",179, Date(),"Star Wars: Los últimos Jedi, el Episodio VIII dirigido por Rian Johnson, llega a las salas de cine el 15 de diciembre y los diferentes adelantos de la película están haciendo creer a los fans de La Guerra de las Galaxias en la posibilidad de que Rey (Daisy Ridley) coquetee con el Lado Oscuro de la Fuerza. Porque, ¿y si lo que ha despertado dentro de ella no es lo que todos esperan de una heroína? De ser así, no sería de extrañar el miedo que Luke Skywalker (Mark Hamill) parece tener del potencial de su pupila. Y más si se tiene en cuenta lo que ocurrió con su sobrino y alumno Ben Solo/Kylo Ren (Adam Driver). "))
        data.add(Movie("http://es.web.img3.acsta.net/c_215_290/pictures/17/11/08/09/46/1315249.jpg","Justice League",129, Date(),"Tras la muerte de Clark Kent/Sperman a manos de Doomsday en Batman v. Superman, el justiciero Bruce Wayne/Batman evalúa sus métodos y empieza a reunir a una grupo de héroes extraordinarios para formar un grupo que luche contra el crimen, defendiendo a la tierra de todo tipo de amenazas. Junto con Diana Prince/Wonder Woman, Batman se un a la antigua estrella del fútbol americano universitario, y mejorado cibernéticamente, Vic Stone/Cyborg, al corredor Barry Allen/The Flash y al guerrero atlante el Rey Arthur Curry/Aquaman. Ellos hacen frente a Steppenwold, el heraldo y segundo de abordo de Darkseid, al que este ha enviado para recuperar tres artefactos escondidos en el planeta."))
        data.add(Movie("https://pics.filmaffinity.com/spider_man_homecoming-336093112-large.jpg","",110, Date(),"ads"))
        adapter.data = data
    }

    fun goToDetail(position:Int){
        startActivity<DetailActivity>("movie" to data[position])
    }
    fun saveFavorite(position: Int){
        toast("Favorito : ${data[position].nombre}")
    }

}
