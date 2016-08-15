package app01.dam.isi.frsf.utn.edu.ar.app01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button btnAdivinar = (Button) findViewById(R.id.btnAdivinar);
        btnAdivinar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // AGREGO UN COMENTARIO AL ARCHIVO!!!!!!
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        EditText ingresado = (EditText) findViewById(R.id.nroIngresado);
        TextView tv = (TextView) findViewById(R.id.textViewRes);
        if(view.getId()==R.id.btnAdivinar){
            Random r = new Random();
            Integer nroSorteado = 1+r.nextInt(9);
            Integer nroIngresado = Integer.parseInt(ingresado.getText().toString());
            if(nroSorteado.equals(nroIngresado)){
                tv.setText("Nmero sorteado fue el :"+ nroSorteado+"Adivino... !!!");
            }else{
                tv.setText("Nmero sorteado fue el :"+ nroSorteado+" No acerto. Intentelo de nuevo... !!!");
            }
        }
    }
}
