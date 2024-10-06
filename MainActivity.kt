class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3) // 3 columns for grid view

        val imageList = fetchImagesFromDeviceOrOnline()
        imageAdapter = ImageAdapter(imageList)
        recyclerView.adapter = imageAdapter
    }

    private fun fetchImagesFromDeviceOrOnline(): List<String> {
        // Retrieve image URLs from online source or from device storage
        return listOf("url_or_path1", "url_or_path2", "url_or_path3") // Example placeholder
    }
}
