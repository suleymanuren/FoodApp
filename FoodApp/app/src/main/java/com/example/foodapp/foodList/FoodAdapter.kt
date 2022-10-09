import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import com.example.foodapp.data.FoodModel


class FoodAdapter(
    private val foodList: MutableList<FoodModel>,
    private val listener: FoodsListener,
) :
    RecyclerView.Adapter<FoodAdapter.FoodsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_list, parent, false)
        return FoodsViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodsViewHolder, position: Int) {
        holder.bind(foodList[position], listener)
    }

    override fun getItemCount(): Int {
        return foodList.size // return the size of the list
    }
    class FoodsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var tvFoodImage = view.findViewById<ImageView>(R.id.food_image)
        private val tvFoodName = view.findViewById<TextView>(R.id.food_name)


        fun bind(food: FoodModel, listener: FoodsListener) {
            // bind the data to the view
            tvFoodImage.downloadFromUrl(food.foodImage, placeholderProgressBar(tvFoodImage.context))
            tvFoodName.text = food.foodName
            itemView.setOnClickListener {
                listener.onClicked(food)
            }
        }
    }
}
interface FoodsListener { // interface for the click listener
    fun onClicked(food: FoodModel)
}
