package about

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import az.com.sheki.R
import kotlinx.collections.immutable.PersistentList

class AboutAdapter(activity: Activity, private val list: PersistentList<AboutModel>) : BaseAdapter() {
    private val layoutInflater: LayoutInflater

    init {
        layoutInflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = layoutInflater.inflate(R.layout.item_about_main_adapter, parent, false)
        val img = view.findViewById<View>(R.id.imageAbout) as ImageView
        val lbAbout = view.findViewById<View>(R.id.lbAbout) as TextView
        val entity = list[position]
        img.setImageResource(entity.picture)
        lbAbout.text = entity.indicator
        return view
    }
}
