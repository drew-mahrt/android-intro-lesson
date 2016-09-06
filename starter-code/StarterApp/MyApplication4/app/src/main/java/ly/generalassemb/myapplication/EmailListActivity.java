package ly.generalassemb.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EmailListActivity extends AppCompatActivity {
    ArrayList<String> arr1, arr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_list);

        arr1 = new ArrayList<>();
        arr2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr1.add("Item "+i);
            arr2.add("Sub-item "+i);
        }


        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return arr1.size();
            }

            @Override
            public Object getItem(int position) {
                return arr1.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View v = convertView;
                if (convertView == null) {
                    LayoutInflater li = (LayoutInflater) EmailListActivity.this
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = li.inflate(android.R.layout.simple_list_item_2, null);
                }

                TextView tv1 = (TextView) v.findViewById(android.R.id.text1);
                TextView tv2 = (TextView) v.findViewById(android.R.id.text2);

                tv1.setText(arr1.get(position));
                tv2.setText(arr2.get(position));

                return v;
            }
        };

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setText("Clicked "+position);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                return false;
            }
        });
    }
}
