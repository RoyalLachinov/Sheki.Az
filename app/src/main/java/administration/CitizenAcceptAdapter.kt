package administration

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import az.com.sheki.R

internal class CitizenAcceptAdapter(
    activity: Activity,
    private val list: List<CitizenAcceptModel>
) : BaseAdapter() {
    private val layoutInflater: LayoutInflater

    init {
        layoutInflater =
            activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = layoutInflater.inflate(
            R.layout.item_citizen_accept_adapter,
            parent,
            false
        )
        val lbDay = view.findViewById<View>(R.id.lbDay) as TextView
        val lbFullName = view.findViewById<View>(R.id.lbFullName) as TextView
        val lbPosition = view.findViewById<View>(R.id.lbPosition) as TextView
        val lbHours = view.findViewById<View>(R.id.lbHours) as TextView
        val entity = list[position]
        lbDay.text = entity.days
        lbFullName.text = entity.fullName
        lbPosition.text = entity.position
        lbHours.text = entity.hours
        return view
    }
}
