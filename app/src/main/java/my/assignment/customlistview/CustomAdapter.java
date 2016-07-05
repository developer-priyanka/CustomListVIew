package my.assignment.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 7/5/16.
 */

public class CustomAdapter extends BaseAdapter {
     ArrayList<Contacts> data;
    Context context;
    private static LayoutInflater inflater=null;


    public CustomAdapter(MainActivity mainActivity, ArrayList contactList) {
        // TODO Auto-generated constructor stub
        data=contactList;
        context=mainActivity;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv1;
        TextView tv2;

    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_view, null);
        holder.tv1=(TextView) rowView.findViewById(R.id.namext);
        holder.tv2=(TextView) rowView.findViewById(R.id.numtxt);

        holder.tv1.setText(data.get(position).getmName());
        holder.tv2.setText(data.get(position).getmPhone());


        return rowView;
    }
}
