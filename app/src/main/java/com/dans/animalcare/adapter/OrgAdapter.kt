package com.dans.animalcare.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dans.animalcare.Constants
import com.dans.animalcare.R
import com.dans.animalcare.database.entities.org_entity
import kotlinx.android.synthetic.main.cardiew_orgs.view.*

class OrgAdapter(var orgs: List<org_entity>) : RecyclerView.Adapter<OrgAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardiew_orgs, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return orgs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(orgs[position])
        holder.setItemClickListener(View.OnClickListener {
            Constants.organizacion = orgs[position]
            Navigation.findNavController(it).navigate(R.id.action_fragmento_Organizacion_to_frag_info_orgs)
        })
    }

    fun updateList(newOrg: List<org_entity>) {
        newOrg.forEach {
            println("Nueva org")
            println(newOrg.get(0).nombre_org)
        }
        this.orgs = newOrg
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setItemClickListener(onClickListener: View.OnClickListener) {
            itemView.setOnClickListener{view -> onClickListener.onClick(view) }
        }

        fun bind(org: org_entity) = with(itemView) {

            Glide.with(this)
                .load(org.img_org)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imgv_org )


            this.tv_nombreOrga.text = org.nombre_org

        }
    }
}
