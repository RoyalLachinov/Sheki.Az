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

public class Administration_Structure_Adapter extends BaseAdapter {

    private final List<Administration_Structure_Entity> list;
    private final LayoutInflater layoutInflater;

    public Administration_Structure_Adapter(Activity activity, List<Administration_Structure_Entity> list) {
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

        View view = layoutInflater.inflate(R.layout.sheki_administration__structure__adapter, parent, false);
        TextView lbSection_Position = (TextView) view.findViewById(R.id.lbSection_Position);
        TextView lbFullName = (TextView) view.findViewById(R.id.lbFullName);
        TextView lbPhone = (TextView) view.findViewById(R.id.lbPhone);

        final Administration_Structure_Entity entity = list.get(position);
        lbSection_Position.setText(entity.getPosition());
        lbFullName.setText(entity.getFullName());
        lbPhone.setText(entity.getPhone());

        return view;
    }
}
