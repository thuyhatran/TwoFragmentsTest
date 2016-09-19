package example.thuya.com.fragmenttest2_2fragments;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private   EditText Text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button B1 = (Button) findViewById(R.id.button1);
        Button B2 = (Button) findViewById(R.id.button2);



        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .add(R.id.container1, new Fragment_One())
                        .addToBackStack("f1")  //will save/put into stack each activity and can go back by BACK button
                        .commit();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .add(R.id.container2, new Fragment_Two())
                        .addToBackStack("f2")
                        .commit();


                Text2 = (EditText) findViewById(R.id.editText2);
                if (Text2 != null)
                    Text2.setText("Frag2 changed me");
            }
        });


    }
}
