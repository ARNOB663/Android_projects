package com.example.recyclerview_assinment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_COLUMNS=2;
    private ArrayList<String>mNames=new ArrayList<>();
    private ArrayList<String>mImageUrls= new ArrayList<>();

    private ArrayList<String>mprice = new ArrayList<>();


    private RecyclerView offerRecyclerView , bestSellerRecyclerView , clothingRecyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();


        /// offer RecyclerView
        offerRecyclerView = findViewById(R.id.offerRecyclerView);
        offerRecyclerView.setHasFixedSize(true);
        offerRecyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false));

        List<Integer> imageList = new ArrayList<>();

        imageList.add(R.drawable.a);
        imageList.add(R.drawable.b);
        imageList.add(R.drawable.c);
        imageList.add(R.drawable.d);
        imageList.add(R.drawable.e);

        OfferAdapter offerAdapter = new OfferAdapter(imageList);

        offerRecyclerView.setAdapter(offerAdapter);

        // best RecyclerView
        bestSellerRecyclerView = findViewById(R.id.bestSellerRecyclerview);
        bestSellerRecyclerView.setHasFixedSize(true);
        bestSellerRecyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));

        List<BestSeller> bestSellerList = new ArrayList<>();

        bestSellerList.add(new BestSeller(R.drawable.bannnner, "Up to 20% off"));
        bestSellerList.add(new BestSeller(R.drawable.mobiles , "Up to 20% off"));
        bestSellerList.add(new BestSeller(R.drawable.watches , "Up to 20% off"));

        BestSellerAdapter bestSellerAdapter = new BestSellerAdapter(bestSellerList);

        bestSellerRecyclerView.setAdapter(bestSellerAdapter);

        // clothing RecyclerView

        clothingRecyclerView = findViewById(R.id.clothingRecyclerview);
        clothingRecyclerView.setHasFixedSize(true);
        clothingRecyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));

        List<Clothing> clothingList = new ArrayList<>();

        clothingList.add(new Clothing(R.drawable.levis_clothing , "Up to 30% off"));
        clothingList.add(new Clothing(R.drawable.women_clothing , "Up to 30% off"));
        clothingList.add(new Clothing(R.drawable.nikeshoes , "Up to 30% off"));

        ClothingAdapter clothingAdapter = new ClothingAdapter(clothingList);
        clothingRecyclerView.setAdapter(clothingAdapter);

        // best RecyclerView 2

//        bestSellerRecyclerView2 = findViewById(R.id.productRecyclerView);
//        bestSellerRecyclerView2.setHasFixedSize(true);
//        bestSellerRecyclerView2.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
//
//        bestSellerRecyclerView2.setAdapter(bestSellerAdapter);

    }

    private void initImageBitmaps(){
        initRecyclerView();

    }

    private void initRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.productRecyclerView);


        CustomAdapter adapter = new CustomAdapter(this, mNames, mImageUrls, mprice);
        recyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        mImageUrls.add("https://static-01.daraz.com.bd/p/cf4dd72b25a309fccbb16a0d08379f64.jpg");
        mNames.add("Levin Premium Quality Any 5 Pairs Low Cut No Show Sports Casual Socks / Ankle Moja For Men");
        mprice.add("৳ 1,000");

        mImageUrls.add("https://static-01.daraz.com.bd/p/9d0292a8c5ace92513dd73a46022d84f.jpg_200x200q90.jpg_.webp");
        mNames.add("GEEOO AD-7 Charging Adapter USB to Type C / Type C Female to USB Male With Data Transfer - Black");
        mprice.add("৳ 199");

        mImageUrls.add("https://static-01.daraz.com.bd/p/4b82d885ade88d3211eb2aef75a58115.png_188x188.jpg_.webp");
        mNames.add("T900 ultra Smart Watch Charger colour white wireless charger warless Charger magnetic charger");
        mprice.add("৳ 200");

        mImageUrls.add("https://static-01.daraz.com.bd/p/8b135d813596344d2fe303d29e251cd5.jpg_200x200q90.jpg_.webp");
        mNames.add("Men Crossbody Sling Bag Shoulder bag 8/12 inc");
        mprice.add("৳ 190");

mImageUrls.add("https://static-01.daraz.com.bd/p/a9f33b3cd224a050e11e3fce82f40549.jpg_200x200q90-product.jpg_.webp");
mNames.add("Stylish and Fashionable Winter and Summer Exclusive Sneakers Converse Shoes for Men");
mprice.add("৳ 495");

mImageUrls.add("https://static-01.daraz.com.bd/p/4586f443caa28ec9c91098113294ea00.jpg_200x200q90-product.jpg_.webp");
mNames.add("TP-Link Archer C54 AC1200 Wireless Dual Band Router with 2x2 MiMo and App Support");
mprice.add("৳ ৳ 2,350");

mImageUrls.add("https://static-01.daraz.com.bd/p/59ebf11fc14931946fd72b99357848cf.jpg_300x0q75.webp");
mNames.add("Asus ROG Zephyrus G15 GA503RM #LN058W# Ryzen 7 6800HS 16GB RAM,1TB SSD, RTX 3060 6GB GFX,15.6 Inch WQHD Gaming Laptop");
mprice.add("৳ 249,500");

mImageUrls.add("https://static-01.daraz.com.bd/p/886d61820a719dfc26e8acdb3eb6a2f2.jpg_188x188.jpg_.webp");
mNames.add("Apple MacBook Pro M1 Max 16 inch 10-Core CPU 32-Core GPU 64GB RAM 1TB SSD Customize Model");
mprice.add("৳ 479,900");

    }

}