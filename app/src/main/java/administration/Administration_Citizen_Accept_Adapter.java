package administration;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import lachinov.royal.com.main.R;

class Administration_Citizen_Accept_Adapter extends BaseAdapter {

    private final List<Administration_Citizen_Accept_Entity> list;
    private final LayoutInflater layoutInflater;

    public Administration_Citizen_Accept_Adapter(Activity activity, List<Administration_Citizen_Accept_Entity> list) {
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
        View view = layoutInflater.inflate(R.layout.sheki_administration_citizen_accept_adapter, parent, false);
        TextView lbDay = (TextView) view.findViewById(R.id.lbDay);
        TextView lbFullName = (TextView) view.findViewById(R.id.lbFullName);
        TextView lbPosition = (TextView) view.findViewById(R.id.lbPosition);
        TextView lbHours = (TextView) view.findViewById(R.id.lbHours);

        final Administration_Citizen_Accept_Entity entity = list.get(position);
        lbDay.setText(entity.getDays());
        lbFullName.setText(entity.getFullName());
        lbPosition.setText(entity.getPosition());
        lbHours.setText(entity.getHours());

        return view;
    }
}
