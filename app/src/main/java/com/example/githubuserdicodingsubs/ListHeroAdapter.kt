package com.example.githubuserdicodingsubs

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter(private val listGithub_user: ArrayList<Github_user>): RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_user, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (username,name,location,repository,company,followers,following, avatar) = listGithub_user[position]
        holder.imgPhoto.setImageResource(avatar!!)
        holder.tvName.text = name
        holder.tvUsername.text = "@$username"
        holder.tvDescription.text = location
        holder.tvCompany.text = company
        holder.itemView.setOnClickListener(View.OnClickListener {
            val moveWithObject = Intent(holder.itemView.context, Item_userDetail::class.java)
            moveWithObject.putExtra(Item_userDetail.EXTRA_USER, listGithub_user[position])
            holder.itemView.context.startActivity(moveWithObject)
        })
    }

    override fun getItemCount(): Int = listGithub_user.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.text_name)
        var tvUsername: TextView = itemView.findViewById(R.id.text_username)
        var tvCompany: TextView = itemView.findViewById(R.id.text_company)
        var tvDescription: TextView = itemView.findViewById(R.id.text_alamat)
    }
}