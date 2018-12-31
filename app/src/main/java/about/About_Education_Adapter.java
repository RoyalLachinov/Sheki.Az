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

class About_Education_Adapter extends BaseAdapter {

    private final List<About_Education_Entity> list;
    private final LayoutInflater layoutInflater;

    public About_Education_Adapter(Activity activity, List<About_Education_Entity> list) {
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
        View view = layoutInflater.inflate(R.layout.sheki_about__education__adaper, parent, false);
        TextView lbNumber = (TextView) view.findViewById(R.id.lbNumber);
        TextView lbSchoolNumber = (TextView) view.findViewById(R.id.lbSchoolNumber);
        TextView lbAddress = (TextView) view.findViewById(R.id.lbAddress);
        TextView lbManagment = (TextView) view.findViewById(R.id.lbManagment);
        TextView lbPhone = (TextView) view.findViewById(R.id.lbPhone);

        final About_Education_Entity entity = list.get(position);
        lbNumber.setText(entity.getNumber());
        lbSchoolNumber.setText(entity.getSchoolNumber());
        lbAddress.setText(entity.getAddress());
        lbManagment.setText(entity.getManagment());
        lbPhone.setText(entity.getPhone());

        return view;
    }
}
