package com.example.isak


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(
            MyFriend("isak", "Laki-laki", "Isak@gmail.com,"
                , "081234567890", "Blitar")
        )
        listTeman.add(
            MyFriend("IRAWAN", "Laki-laki", "Irawan@gmail.com",
                "081234567890", "Blitar")
        )
        listTeman.add(
            MyFriend("Sanddy", "Laki-laki", "sandy@gmail.com",
                "081234567890", "papua")
        )
        listTeman.add(
            MyFriend("yohanes", "Laki-Laki", "yohanes@gmail.com",
                "081234567890", "malang")
        )
        listTeman.add(
            MyFriend("rosid", "Laki-laki", "rosiyd@gmail.com",
                "081234567890", "madiun")
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}