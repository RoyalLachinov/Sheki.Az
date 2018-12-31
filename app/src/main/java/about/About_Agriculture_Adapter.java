package about;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import lachinov.royal.com.main.R;

class About_Agriculture_Adapter extends BaseAdapter {

    private final List<About_Agriculture_Entity> list;
    private final LayoutInflater layoutInflater;

    public About_Agriculture_Adapter(Activity activity, List<About_Agriculture_Entity> list) {
        this.list = list;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.sheki_about_agri_culture_adapter, parent, false);

        TextView lbNumber = (TextView) view.findViewById(R.id.lbNumber);
        TextView lbVillage = (TextView) view.findViewById(R.id.lbVillage);
        TextView lbConsumerCount = (TextView) view.findViewById(R.id.lbConsumerCount);
        TextView lbLandArea = (TextView) view.findViewById(R.id.lbLandArea);
        TextView lbTaxil = (TextView) view.findViewById(R.id.lbTaxil);
        TextView lbQargidali = (TextView) view.findViewById(R.id.lbQargidali);
        TextView lbKartof = (TextView) view.findViewById(R.id.lbKartof);
        TextView lbTerevez = (TextView) view.findViewById(R.id.lbTerevez);
        TextView lbPambiq = (TextView) view.findViewById(R.id.lbPambiq);
        TextView lbUzumBagi = (TextView) view.findViewById(R.id.lbUzumBagi);
        TextView lbDiger = (TextView) view.findViewById(R.id.lbDiger);
        TextView lbYardim = (TextView) view.findViewById(R.id.lbYardim);

        final About_Agriculture_Entity entity = list.get(position);
        lbNumber.setText(entity.getNumber());
        lbVillage.setText(entity.getVillage());
        lbConsumerCount.setText(entity.getConsumerCount());
        lbLandArea.setText(entity.getLandArea());
        lbTaxil.setText(entity.getTaxil());
        lbQargidali.setText(entity.getQargidali());
        lbKartof.setText(entity.getKartof());
        lbTerevez.setText(entity.getTerevez());
        lbPambiq.setText(entity.getPambiq());
        lbUzumBagi.setText(entity.getUzumbagi());
        lbDiger.setText(entity.getDiger());
        lbYardim.setText(entity.getYardim());

        return view;
    }
}
