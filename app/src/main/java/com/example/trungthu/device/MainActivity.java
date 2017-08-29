package com.example.trungthu.device;

import android.app.admin.DeviceAdminInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewdevice;
    ArrayList <Device>deviceArrayList;
    device_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        adapter=new device_adapter(this,R.layout.mota_thiet_bi,deviceArrayList);
        listViewdevice.setAdapter(adapter);
    }

    private void anhxa() {
        listViewdevice=(ListView)findViewById(R.id.lvdevice);
        deviceArrayList=new ArrayList<>();

        deviceArrayList.add(new Device("plc DR32H","LS",R.drawable.a1));
        deviceArrayList.add(new Device("s7-1200","Siemen",R.drawable.a7));
        deviceArrayList.add(new Device("Biến tần","Delta",R.drawable.a2));
        deviceArrayList.add(new Device("Biến tần","LS",R.drawable.a3));
        deviceArrayList.add(new Device("PLc Mishubishi","Mishubishi",R.drawable.a4));
        deviceArrayList.add(new Device("PLc Delta","delta",R.drawable.a5));
    }
}
