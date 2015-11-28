package com.example.admin.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    Button button_connect;
    ImageView imageView;
    Toast toast;


    // Логирование
    private static final String Tag = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //изменение заголовка
        setTitle("Мое приложение");
        //вывести в логи отладчика
        Log.d(Tag, "Заголовок изменен!");

        imageView = (ImageView) findViewById(R.id.imageView);

        button_connect = (Button) findViewById(R.id.button_connect);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_connect:
                        toast = Toast.makeText(MainActivity.this, "В данный момент недоступно!", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
//                      imageView.setImageDrawable(getResources().getDrawable(R.drawable.bitefight));
                        break;
                }
            }
        };
        button_connect.setOnClickListener(onClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        menu.add(2, 5, 105, "пункт5").setCheckable(true);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.character_overview:
//                imageView.setVisibility(View.INVISIBLE);
                break;
            case R.id.character_cache:
                toast = Toast.makeText(MainActivity.this, "Выбран пункт меню " + getString(R.string.menu_character_cache), Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.character_tribe:
                toast = Toast.makeText(MainActivity.this, "Выбран пункт меню " + getString(R.string.menu_character_tribe), Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.character_set:
                toast = Toast.makeText(MainActivity.this, "Выбран пункт меню " + getString(R.string.menu_character_set), Toast.LENGTH_SHORT);
                toast.show();
                break;
            case 5:
                item.setChecked(!item.isChecked());
                break;

        }
        return super.onOptionsItemSelected(item);
    }
};
