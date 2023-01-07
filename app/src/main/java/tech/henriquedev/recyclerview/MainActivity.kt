package tech.henriquedev.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("United States")
        countryNameList.add("Brazil")
        countryNameList.add("Argentina")

        detailsList.add("This is the United States Flag")
        detailsList.add("This is the Brazil Flag")
        detailsList.add("This is the Argentina Flag")

        imageList.add(R.drawable.flag_usa)
        imageList.add(R.drawable.flag_brazil)
        imageList.add(R.drawable.flag_argentina)

        adapter = CountriesAdapter(countryNameList, detailsList, imageList, this@MainActivity)

        recyclerView.adapter = adapter
    }
}