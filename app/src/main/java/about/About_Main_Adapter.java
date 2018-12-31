package about;

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

public class About_Main_Adapter extends BaseAdapter {

    private final List<About_Main_Entity> list;
    private final LayoutInflater layoutInflater;

    public About_Main_Adapter(Activity activity, List<About_Main_Entity> list) {
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
        View view = layoutInflater.inflate(R.layout.sheki_about_main_adapter, parent, false);
        ImageView img = (ImageView) view.findViewById(R.id.imageAbout);
        TextView lbAbout = (TextView) view.findViewById(R.id.lbAbout);

        final About_Main_Entity entity = list.get(position);
        img.setImageResource(entity.getPicture());
        lbAbout.setText(entity.getIndicator());
        return view;
    }
}
