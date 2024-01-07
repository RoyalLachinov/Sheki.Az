package tourism

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import az.com.sheki.R

internal class TourismAdapter(activity: Activity, private val list: List<TourismModel>) :
    BaseAdapter() {
    private val layoutInflater: LayoutInflater

    init {
        layoutInflater =
            activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = layoutInflater.inflate(R.layout.item_tourism_adapter, parent, false)
        val img = view.findViewById<View>(R.id.imageTrusim) as ImageView
        val lbName = view.findViewById<View>(R.id.tursimName) as TextView
        val lbAddress = view.findViewById<View>(R.id.trusimAddress) as TextView
        val tourismModel = list[position]
        img.setImageResource(tourismModel.sekil)
        lbName.text = tourismModel.name
        lbAddress.text = tourismModel.address
        return view
    }
}
