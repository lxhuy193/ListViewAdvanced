package com.example.listviewadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arr_monan : ArrayList<MonAn> = ArrayList()
        arr_monan.add(MonAn("Bánh cuốn", R.drawable.banhcuon))
        arr_monan.add(MonAn("Bánh mì hội an", R.drawable.banhmihoian))
        arr_monan.add(MonAn("Bánh tráng cuốn thịt heo", R.drawable.banhtrangcuonthitheo))
        arr_monan.add(MonAn("Bánh tráng trộn", R.drawable.banhtrangtron))
        arr_monan.add(MonAn("Bánh xèo Huế", R.drawable.banhxeohue))
        arr_monan.add(MonAn("Cánh gà chiên mắm", R.drawable.cachgachienmam))
        arr_monan.add(MonAn("Phở bò Hà Nội", R.drawable.phobohanoi))
        arr_monan.add(MonAn("Thịt kho trứng", R.drawable.thitkhotrung))
        arr_monan.add(MonAn("Vịt quay Bắc Kinh", R.drawable.vitquaybackinh))

        var lv : ListView = findViewById(R.id.listview)
//        lv.adapter = CustomAdapter(applicationContext,arr_monan) // In text se bị mờ
        lv.adapter = CustomAdapter(this, arr_monan )
    }
}