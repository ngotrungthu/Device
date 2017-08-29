package com.example.trungthu.device;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Trung Thu on 8/29/2017.
 */

public class device_adapter extends BaseAdapter{

    private Context context;
    private int layout;
    private List<Device>deviceList;


    public device_adapter(Context context, int layout, List<Device> deviceList) {
        this.context = context;
        this.layout = layout;
        this.deviceList = deviceList;
    }

    @Override
    public int getCount() {
        return deviceList.size();
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
        LayoutInflater Inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view=Inflater.inflate(layout,null);
        //ánh xạ
        TextView txtten=(TextView)view.findViewById(R.id.tv_ten);
        TextView txtnsx=(TextView)view.findViewById(R.id.tv_nha_sanxuat);
        ImageView imghinh=(ImageView)view.findViewById(R.id.image_thietbi);
        // gán gia trị
        Device device=deviceList.get(i);
        txtten.setText(device.getTen());
        txtnsx.setText(device.getNhasanxuat());
        imghinh.setImageResource(device.getHinh());
        return view;
    }
}
