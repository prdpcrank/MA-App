package com.example.maApp.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.maApp.NasaApplication
import com.example.maApp.R
import com.example.maApp.action.ActionPerformer
import com.example.maApp.action.MaAppAction
import com.example.maApp.action.openImageInHD
import com.example.maApp.databinding.GridImageLayoutBinding
import com.example.maApp.domain.entity.HomePageItemEntity

class MaAppDataAdapter(private val actionPerformer: ActionPerformer<MaAppAction>) :
    RecyclerView.Adapter<MaAppDataAdapter.ViewHolder>() {

    var items: MutableList<HomePageItemEntity> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            GridImageLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = items[position]
        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .placeholder(R.drawable.progress_animation)
            .error(R.drawable.ic_error)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)
            .dontAnimate()
            .dontTransform()

        Glide.with(NasaApplication.INSTANCE.applicationContext)
            .load(data.avatar)
            .apply(options)
            .into(holder.binding.gridImageIV)

        holder.binding.tvName.text = data.firstName+" "+data.lastName
        holder.binding.tvMail.text = data.email
        holder.binding.root.setOnClickListener {
            actionPerformer.performAction(openImageInHD(data.id))
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(list: List<HomePageItemEntity>) {
        this.items.clear()
        notifyDataSetChanged()
        items.addAll(list)
        notifyDataSetChanged()
    }
    class ViewHolder(val binding: GridImageLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}