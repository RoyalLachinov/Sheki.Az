package tourism;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import lachinov.royal.com.main.R;

class Trusim_Adapter extends BaseAdapter {
    private final List<Trusim_Entity>list;
    private final LayoutInflater layoutInflater;

    public Trusim_Adapter(Activity activity, List<Trusim_Entity> list) {
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
        View view = layoutInflater.inflate(R.layout.sheki_trusim_adapter, parent, false);
        ImageView img = (ImageView) view.findViewById(R.id.imageTrusim);
        TextView lbName = (TextView) view.findViewById(R.id.tursimName);
        TextView lbAddress = (TextView) view.findViewById(R.id.trusimAddress);

        final Trusim_Entity trusim_entity = list.get(position);
        img.setImageResource(trusim_entity.getSekil());
        lbName.setText(trusim_entity.getName());
        lbAddress.setText(trusim_entity.getAddress());

        return view;

    }
}
