package com.example.githubuserdicodingsubs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Item_userDetail : AppCompatActivity() {
    companion object{
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_user_detail)
        setTitle(R.string.item_title)

        var imgPhoto: ImageView = findViewById(R.id.img_user_photo)
        val tvName: TextView = findViewById(R.id.name)
        val tvUsername: TextView = findViewById(R.id.username)
        val tvCompany: TextView = findViewById(R.id.company)
        val tvLocation: TextView = findViewById(R.id.location)
        val tvRepo: TextView = findViewById(R.id.text_repo)
        val tvFollowings: TextView = findViewById(R.id.text_followings)
        val tvFollowers: TextView = findViewById(R.id.text_followers)

        val user = intent.getParcelableExtra<Github_user>(EXTRA_USER) as Github_user
        imgPhoto.setImageResource(user.avatar!!)
        tvName.text = user.name
        tvUsername.text = user.username
        tvLocation.text = user.location
        tvCompany.text = user.company
        tvFollowers.text = user.followers.toString()
        tvFollowings.text = user.following.toString()
        tvRepo.text = user.repository.toString()
    }
}