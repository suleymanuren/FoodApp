import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.foodapp.R
import com.example.foodapp.data.FoodModel

class FoodDetailFragment : Fragment() {
    private lateinit var tvFoodName: TextView
    private lateinit var tvDescription: TextView
    private lateinit var tvImage: ImageView
    private lateinit var btnAddToCart: Button
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_food_detail, container, false) // Inflate the layout for this fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        setupViews(view)

    }
    private fun setupViews(view: View) {
        tvFoodName = view.findViewById(R.id.food_name)
        tvDescription = view.findViewById(R.id.tvDescription)
        tvImage = view.findViewById(R.id.food_image)
        btnAddToCart = view.findViewById(R.id.btnAddToCart)


        arguments?.let {
            //Get the food model from the bundle
            val foodData = it.getString("foodModel")
            foodData?.let { safeFoodData ->
                val food = FoodModel.fromJson(safeFoodData)
                tvDescription.text = food.description
                tvImage.downloadFromUrl(food.foodImage, placeholderProgressBar(tvImage.context))
                tvFoodName.text = food.foodName

                //Add the food to the cart
                btnAddToCart.setOnClickListener(){
                    val args = Bundle()
                    val bundle = bundleOf("foodModel" to safeFoodData)
                    navController.navigate(R.id.action_foodDetailFragment_to_foodListFragment, args)

                    Toast.makeText(context, "Your order has been added to the cart", Toast.LENGTH_SHORT).show()
                }

                }
            }

        }



    }


