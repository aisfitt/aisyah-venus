package com.example.aisyah_3tif.Message

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.aisyah_3tif.Message.tutorial.TutorialMessageActivity
import com.example.aisyah_3tif.R
import com.example.aisyah_3tif.databinding.FragmentHomeBinding
import com.example.aisyah_3tif.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {
    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    private val messageList = listOf(
        MessageModel("Alya", "Halo! Apa kabar?", "https://avatarapi.runflare.run/public/1",  "20:00"),
        MessageModel("Budi", "Sudah makan?", "https://avatarapi.runflare.run/public/2",  "19:00"),
        MessageModel("Citra", "Jangan lupa tugasnya ya!", "https://avatarapi.runflare.run/public/3",  "22:00"),
        MessageModel("Dika", "Besok kita rapat jam 9", "https://avatarapi.runflare.run/public/4",  "21:00"),
        MessageModel("Eka", "Nice job kemarin!", "https://avatarapi.runflare.run/public/5",  "18:00"),
        MessageModel("Fajar", "Lagi ngapain?", "https://avatarapi.runflare.run/public/6",  "10:00"),
        MessageModel("Gita", "Boleh minta tolong?", "https://avatarapi.runflare.run/public/7",  "13:00"),
        MessageModel("Hana", "Lihat email ya", "https://avatarapi.runflare.run/public/8",  "20:00"),
        MessageModel("Irfan", "Oke noted", "https://avatarapi.runflare.run/public/9", "20:00"),
        MessageModel("Joko", "Sampai jumpa besok", "https://avatarapi.runflare.run/public/10",  "20:00")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            title = "Message"

            setHasOptionsMenu(true)
        }
        val adapter = MessageAdapter(requireContext(), messageList)
        binding.listMessageItems.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.message_toolbar_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_tutorial -> {
                val intent = Intent(requireContext(), TutorialMessageActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}