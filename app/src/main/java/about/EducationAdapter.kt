package about

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import az.com.sheki.R

internal class EducationAdapter(activity: Activity, private val list: List<EducationModel>) :
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
        val view = layoutInflater.inflate(R.layout.item_about_education_adaper, parent, false)
        val lbNumber = view.findViewById<View>(R.id.lbNumber) as TextView
        val lbSchoolNumber = view.findViewById<View>(R.id.lbSchoolNumber) as TextView
        val lbAddress = view.findViewById<View>(R.id.lbAddress) as TextView
        val lbManagment = view.findViewById<View>(R.id.lbManagment) as TextView
        val lbPhone = view.findViewById<View>(R.id.lbPhone) as TextView
        val entity = list[position]
        lbNumber.text = entity.number
        lbSchoolNumber.text = entity.schoolNumber
        lbAddress.text = entity.address
        lbManagment.text = entity.management
        lbPhone.text = entity.phone
        return view
    }
}
