package com.example.foodapp.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodModel(
    val foodName: String,
    @ColumnInfo(name = "flag")
    @SerializedName("flag")
    val foodImage: String,
    val description: String,
    val orderDetail: String,
    val orderPrice: String,

) : Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }
    companion object {
        fun fromJson(jsonValue: String): FoodModel {
            return Gson().fromJson(jsonValue, FoodModel::class.java)
        }
    }
}

val mockFoodData = mutableListOf(
    FoodModel(
        "Burger",
        "https://www.linkpicture.com/q/Burger-1.png",
        "A hamburger, or simply burger, is a food consisting of fillings—usually a patty of ground meat, typically beef—placed inside a sliced bun or bread roll. Hamburgers are often served with cheese, lettuce, tomato, onion, pickles, bacon, or chilis; condiments such as ketchup, mustard, mayonnaise, relish, or a \"special sauce\", often a variation of Thousand Island dressing; and are frequently placed on sesame seed buns. A hamburger patty topped with cheese is called a cheeseburger."+"\n"+"The term burger can also be applied to the meat patty on its own, especially in the United Kingdom, where the term patty is rarely used, or the term can even refer simply to ground beef. Since the term hamburger usually implies beef, for clarity burger may be prefixed with the type of meat or meat substitute used, as in beef burger, turkey burger, bison burger, portobello burger, or veggie burger. In Australia and New Zealand, a piece of chicken breast on a bun is known as a chicken burger, which would generally not be considered to be a burger in the United States; where it would generally be called a chicken sandwich, but in Australian English and New Zealand English a sandwich requires sliced bread (not a bun), so it would not be considered a sandwich.",

"Order Detail: 1 Burger, 1 Fries, 1 Drink",
        "Price: 10$"
    ),
    FoodModel(
        "Pizza",
        "https://www.linkpicture.com/q/Pizza-1.png",
        "pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot."
                +"\n"+"One of the simplest and most traditional pizzas is the Margherita, which is topped with tomatoes or tomato sauce, mozzarella, and basil. Popular legend relates that it was named for Queen Margherita, wife of Umberto I, who was said to have liked its mild fresh flavour and to have also noted that its topping colours—green, white, and red—were those of the Italian flag.",

        "Order Detail: 1 Pizza, 1 Drink",
        "Price: 15$"),
    FoodModel(
        "Barbeque",
        "https://www.linkpicture.com/q/BBQ-1.png",
        "Barbeque, an outdoor meal, usually a form of social entertainment, at which meats, fish, or fowl, along with vegetables, are roasted over a wood or charcoal fire. The term also denotes the grill or stone-lined pit for cooking such a meal, or the food itself, particularly the strips of meat. The word barbecue came into English via the Spanish, who adopted the term from the Arawak Indians of the Caribbean, to whom the barbacoa was a grating of green wood upon which strips of meat were placed to cook or to dry over a slow fire."
    +"\n"+"\n"+"\n"+"Barbecuing is popular throughout the United States, especially in the South, where pork is the favoured meat, and in the Southwest, where beef predominates. Other foods barbecued are lamb or kid, chicken, sausages, and, along the Gulf and Atlantic coasts, seafood. Basting and marinating sauces reflect regional tastes, with vinegar-based sauces in the Carolinas, tomato-based in the West and Midwest, and the spiciest versions in the Southwest.",

        "Order Detail: 1 BBQ, 1 Drink",
        "Price: 20$"),
    FoodModel(
        "Vegan",
        "https://www.linkpicture.com/q/Vegan.png",
        "As one of the main types of vegetarian diets, a vegan diet involves abstaining from eating any meat or animal products. This includes meat and poultry, as well as fish and shellfish. Vegans also avoid other foods derived from animals, including honey, dairy products, and gelatin.",

        "Order Detail: 1 Vegan, 1 Drink",
        "Price: 25$"),
    FoodModel(
        "Amala",
        "https://www.linkpicture.com/q/Amala.png",
        "Amla are small, round berries with light-green skin. The skin is almost translucent, with 6 to 8 faint yellow striations, making the Amla appear to be segmented. The skin is tough, yet thin with a flesh that is crisp and juicy with a taste both sour and bitter. The flesh of an Amla is also somewhat astringent." +  "\n"+  "\n"+ "\n"+"In the center of the berry lies a hexagonal-shaped stone with 6 small seeds.",
        "Order Detail: 1 Amala, 1 Drink",
        "Price: 30$"),
    FoodModel(
        "Rice",
        "https://www.linkpicture.com/q/Amala-1.png",
        "Rice, (Oryza sativa), edible starchy cereal grain and the grass plant (family Poaceae) by which it is produced. Roughly one-half of the world population, including virtually all of East and Southeast Asia, is wholly dependent upon rice as a staple food; 95 percent of the world's rice crop is eaten by humans." +
                "\n"+
                "\n"+
                "\n"+
                "Rice is cooked by boiling, or it can be ground into a flour. It is eaten alone and in a great variety of soups, side dishes, and main dishes in Asian, Middle Eastern, and many other cuisines. Other products in which rice is used are breakfast cereals, noodles, and such alcoholic beverages as Japanese sake.",
        "Order Detail: 1 Rice, 1 Drink",
        "Price: 5$"),

)
