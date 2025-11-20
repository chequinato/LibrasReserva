package com.example.librasparatodos

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter(
    private val context: Context,
    private val videoIds: List<String>
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    inner class VideoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val thumbnail: ImageView = view.findViewById(R.id.thumbnail)

        init {
            view.setOnClickListener {
                val videoId = videoIds[adapterPosition]
                val intent = Intent(context, YoutubeActivity::class.java)
                intent.putExtra("VIDEO_ID", videoId)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val videoId = videoIds[position]

        // carrega a thumbnail oficial do YouTube
        val url = "https://img.youtube.com/vi/$videoId/0.jpg"

        // usa o próprio Android (sem libs externas)
        Thread {
            try {
                val stream = java.net.URL(url).openStream()
                val bmp = android.graphics.BitmapFactory.decodeStream(stream)

                holder.thumbnail.post {
                    holder.thumbnail.setImageBitmap(bmp)
                }
            } catch (_: Exception) {}
        }.start()
    }

    override fun getItemCount(): Int = videoIds.size
}
