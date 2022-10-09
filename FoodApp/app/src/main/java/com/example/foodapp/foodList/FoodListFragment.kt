
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import com.example.foodapp.data.FoodModel
import com.example.foodapp.data.mockFoodData

class FoodListFragment : Fragment(), FoodsListener {

    private lateinit var rvFoodList: RecyclerView
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_food_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController() //CLOSED FOR BOTTOM APP BAR NAVIGATION
        rvFoodList = view.findViewById(R.id.rvFoodList)
        setupAdapter()

    }

    private fun setupAdapter() {
        rvFoodList.adapter = FoodAdapter(mockFoodData, this@FoodListFragment) // pass the list and the listener
    }

    override fun onClicked(food: FoodModel) {
        // navigate to the food details fragment
        navController.navigate(R.id.action_foodListFragment_to_foodDetailFragment, Bundle().apply {
            putString("foodModel", food.toJson())
        })
    }
}