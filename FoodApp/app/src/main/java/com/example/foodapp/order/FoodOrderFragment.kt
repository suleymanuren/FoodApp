import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.foodapp.R
import com.example.foodapp.data.FoodModel
import com.example.foodapp.data.mockFoodData


class FoodOrderFragment : Fragment() {
    private lateinit var tvFoodName: TextView
    private lateinit var tvOrderDetail: TextView
    private lateinit var tvOrderPrice: TextView
    private lateinit var tvImage: ImageView
    private lateinit var tvTitle : TextView
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_order_page, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()  //CLOSED FOR BOTTOM APP BAR NAVIGATION
        setupViews(view)
    }

    private fun setupViews(view: View) {

        tvFoodName = view.findViewById(R.id.food_name)
        tvOrderDetail = view.findViewById(R.id.orderDetail)
        tvImage = view.findViewById(R.id.food_image)
        tvOrderPrice = view.findViewById(R.id.orderPrice)
        tvTitle = view.findViewById(R.id.tvOrderTitle)



}}