package com.example.aisyah_3tif.Message

import android.R.id.message
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.bumptech.glide.Glide
import com.example.aisyah_3tif.Home.pertemuan_5.FifthActivity
import com.example.aisyah_3tif.databinding.ItemMessageBinding
import com.google.android.material.snackbar.Snackbar

class MessageAdapter(
    context: Context,
    private val  Messages: List<MessageModel>
) : ArrayAdapter<MessageModel>(context, 0, Messages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: ItemMessageBinding = ItemMessageBinding.inflate(LayoutInflater.from(context), parent, false)
        val view = binding.root

        val data = Messages[position]

        Glide.with(context)
            .load(data.avatarUrl)
            .into(binding.avatarImg)

        binding.textSender.text = data.senderName
        binding.textMessage.text = data.messageText
        binding.textWaktu.text = data.waktu

        view.setOnClickListener {
            val i= Intent(context, FifthActivity::class.java) //inisialisasi intent
            i.putExtra("nama", data.senderName)//untuk memindahka data ke tujuan
            context.startActivity(i)

            Snackbar.make(
                parent,
                "Pesan dari ${data.senderName}: ${data.messageText}, pada ${data.waktu}",
                Snackbar.LENGTH_SHORT
            ).show()
        }

        return view
    }
}
