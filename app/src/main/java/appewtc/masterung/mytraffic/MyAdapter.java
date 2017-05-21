package appewtc.masterung.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 5/21/2017 AD.
 */

public class MyAdapter extends BaseAdapter{

    private Context context;
    private String[] titleStrings, detailStrings;
    private int[] ints;
    private TextView titleTextView, detailTextView;
    private ImageView imageView;

    public MyAdapter(Context context,
                     String[] titleStrings,
                     String[] detailStrings,
                     int[] ints) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.listview_layout, viewGroup, false);

        //Initial View
        titleTextView = (TextView) view1.findViewById(R.id.txtTitle);
        detailTextView = (TextView) view1.findViewById(R.id.txtDetail);
        imageView = (ImageView) view1.findViewById(R.id.imvIcon);

        //Show View
        titleTextView.setText(titleStrings[i]);

        String strShortDetail = detailStrings[i].substring(0, 35) + " ...";
        detailTextView.setText(strShortDetail);

        imageView.setImageResource(ints[i]);


        return view1;
    }
}   // Main Class
