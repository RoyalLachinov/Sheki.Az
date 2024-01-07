package about

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import az.com.sheki.R
import kotlinx.collections.immutable.PersistentList

internal class AgricultureAdapter(activity: Activity, private val list: PersistentList<AgricultureModel>) :
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
        val view = layoutInflater.inflate(R.layout.item_about_agriculture_adapter, parent, false)
        val entity = list[position]
        val lbNumber = view.findViewById<View>(R.id.lbNumber) as TextView
        val lbVillage = view.findViewById<View>(R.id.lbVillage) as TextView
        val lbConsumerCount = view.findViewById<View>(R.id.lbConsumerCount) as TextView
        val lbLandArea = view.findViewById<View>(R.id.lbLandArea) as TextView
        val lbTaxil = view.findViewById<View>(R.id.lbTaxil) as TextView
        val lbQargidali = view.findViewById<View>(R.id.lbQargidali) as TextView
        val lbKartof = view.findViewById<View>(R.id.lbKartof) as TextView
        val lbTerevez = view.findViewById<View>(R.id.lbTerevez) as TextView
        val lbPambiq = view.findViewById<View>(R.id.lbPambiq) as TextView
        val lbUzumBagi = view.findViewById<View>(R.id.lbUzumBagi) as TextView
        val lbDiger = view.findViewById<View>(R.id.lbDiger) as TextView
        val lbYardim = view.findViewById<View>(R.id.lbYardim) as TextView
        lbNumber.text = entity.number
        lbVillage.text = entity.village
        lbConsumerCount.text = entity.consumerCount
        lbLandArea.text = entity.landArea
        lbTaxil.text = entity.taxil
        lbQargidali.text = entity.qargidali
        lbKartof.text = entity.kartof
        lbTerevez.text = entity.terevez
        lbPambiq.text = entity.pambiq
        lbUzumBagi.text = entity.uzumbagi
        lbDiger.text = entity.diger
        lbYardim.text = entity.yardim
        return view
    }
}
