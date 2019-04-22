
package com.example.czi_list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import com.example.czi_list.listViewClasses.SH;


public class scavHuntAdapter extends ArrayAdapter<SH> {

    private static final String TAG = "scavHuntAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView name;
        TextView birthday;
        TextView sex;
    }

    /**
     * Default constructor for the PersonListAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public scavHuntAdapter(Context context, int resource, ArrayList<SH> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the persons information
        String name = getItem(position).getTitle();
        String birthday = "hi";
        String sex = "test2";

        //Create the person object with the information
        SH person = new SH("chris", "beau", name , "jimmy");

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.textView1);
            holder.birthday = (TextView) convertView.findViewById(R.id.textView2);
            holder.sex = (TextView) convertView.findViewById(R.id.textView3);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        holder.name.setText(person.getTitle());
        holder.birthday.setText(person.getId());
        holder.sex.setText(person.getOwnerId());

        Animation animation = null;
        animation = AnimationUtils.loadAnimation(mContext, R.anim.fade_in);
        convertView.startAnimation(animation);

        /*
        switch (MainActivity.animationItem) {
            case R.id.fade;
            animation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
            convertView.startAnimation(animation);
            break;
        }*/




        convertView.startAnimation(animation);

        return convertView;
    }


}