package sg.edu.rp.c346.id21001096.l07_demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    Button btn;
    ListView lv;
    ArrayList <String> alColours;
    ArrayAdapter<String> aaColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.edt);
        btn = findViewById(R.id.btn);
        lv = findViewById(R.id.lv);

        alColours = new ArrayList<>();

        //add
        alColours.add("Red");
        alColours.add("Orange");

        aaColour = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, alColours);

        lv.setAdapter(aaColour);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colour = edt.getText().toString();
//      enhancment, add edt text          int pos = Integer.parseInt(edt.getText().toString());
                alColours.add( colour);
                aaColour.notifyDataSetChanged();
            }
        });

//        lv.setOnClickListener(new AdapterView.OnItemClickListener()
//
//        );

    }
}