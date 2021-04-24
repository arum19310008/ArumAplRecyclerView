package com.example.arumaplrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_teman.*

class TemanFragment : Fragment(){
    lateinit var listTeman: ArrayList<Teman>
    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(Teman(nama = "Erfian Arum", jkel = "Perempuan", email = "earumzahra@gmail.com",
            telp = "089603081638", alamat = "Malang" ))
        listTeman.add(Teman(nama = "Vincenzo Cassano", jkel = "Laki-laki", email = "heyvin@gmail.com",
        telp = "010-128-982-82", alamat = "Itaewon"))
        listTeman.add(Teman(nama = "Anderson", jkel = "Laki-laki", email = "hianderson@gmail.com",
            telp = "08234656225", alamat = "New York" ))
        listTeman.add(Teman(nama = "Hong Cha Young", jkel = "Perempuan", email = "heychayoung@gmail.com",
            telp = "010-992-893-111", alamat = "Gangnam-Gu" ))
        listTeman.add(Teman(nama = "Tsania", jkel = "Perempuan", email = "tsaaania@gmail.com",
            telp = "082344677542", alamat = "Malang" ))
        listTeman.add(Teman(nama = "Joshua Kim", jkel = "Laki-laki", email = "joshh11@gmail.com",
            telp = "010-8266-927", alamat = "Seoul" ))
        listTeman.add(Teman(nama = "Dave", jkel = "Laki-laki", email = "heydavee@gmail.com",
            telp = "112", alamat = "Canada" ))
    }
    private fun tampilTeman(){
        rv_listteman.layoutManager=LinearLayoutManager(activity)
        rv_listteman.adapter=TemanAdapter(activity!!, listTeman)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_teman, container, false)
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