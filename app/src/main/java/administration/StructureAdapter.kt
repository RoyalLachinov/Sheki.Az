package administration

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import az.com.sheki.R

class StructureAdapter(activity: Activity, private val list: List<StructureModel>) : BaseAdapter() {
    private val layoutInflater: LayoutInflater

    init {
        layoutInflater =
            activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view =
            layoutInflater.inflate(R.layout.item_structure_adapter, parent, false)
        val lbSectionPosition = view.findViewById<View>(R.id.lbSection_Position) as TextView
        val lbFullName = view.findViewById<View>(R.id.lbFullName) as TextView
        val lbPhone = view.findViewById<View>(R.id.lbPhone) as TextView
        val entity = list[position]
        lbSectionPosition.text = entity.position
        lbFullName.text = entity.fullName
        lbPhone.text = entity.phone
        return view
    }
}
