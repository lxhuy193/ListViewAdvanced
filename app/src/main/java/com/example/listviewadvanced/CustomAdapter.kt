package com.example.listviewadvanced

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter (var context : Context, var monan_arr : ArrayList<MonAn>) : BaseAdapter() {
    // So luong dong co the ve len cho TextView?
    override fun getCount(): Int {
        return monan_arr.size
    }
    //Tro ra cac thuoc tinh trong doi tuong do
    override fun getItem(position: Int): Any {
        return monan_arr.get(position)
    }
    // Tro ve id thuoc tinh ben trong doi tuong
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    class ViewHolder (row : View){
        //Khai ban cac bien tu View layout ra
        var tv_tenmonan : TextView
        var iv_hinhanhmonan : ImageView

        init {
            tv_tenmonan = row.findViewById<TextView>(R.id.tv_tenMonAn)
            iv_hinhanhmonan = row.findViewById<ImageView>(R.id.iv_hinhMonAn)
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var view : View?
        var viewholder : ViewHolder
        if (convertView == null){
            var layoutInflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.monan_line,null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        } else {
            view = convertView
            viewholder = convertView.tag as ViewHolder
        }

        var monan : MonAn = getItem(position) as MonAn
        viewholder.tv_tenmonan.text = monan.ten
        viewholder.iv_hinhanhmonan.setImageResource(monan.hinhanh)
        return view
    }
}