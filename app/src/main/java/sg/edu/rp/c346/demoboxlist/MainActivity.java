package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColourList;
    ArrayList<Colour> alColour;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColourList = findViewById(R.id.lvColour);
        alColour = new ArrayList<>();
        alColour.add(new Colour("Blue"));
        alColour.add(new Colour("Brown"));
        alColour.add(new Colour("Orange"));

        caColour = new CustomAdapter(this, R.layout.newlayout, alColour);
        lvColourList.setAdapter(caColour);
    }
}
