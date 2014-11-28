package edu.np.ece.mapg.s10147868mpi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	TextView TextView1;
	EditText etNumber;
	Button btGuess;
	int myNumber =	8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etNumber = (EditText) this.findViewById(R.id.etNumber);
        btGuess = (Button) this.findViewById(R.id.btGuess);
        
        btGuess.setOnClickListener(
        		new OnClickListener(){

					@Override
					public void onClick(View arg0) {
						String str = etNumber.getText().toString();
						try
						{
							
						int num = Integer.parseInt(str);
						
					if (num == myNumber)
					{
						Toast.makeText(getBaseContext(), "Bingo! Correct number.", Toast.LENGTH_LONG).show();
					}
					else
					{
						Toast.makeText(getBaseContext(), "Try again!", Toast.LENGTH_LONG).show();
					}
						
						}
						catch(NumberFormatException e)
						{
							System.out.println("Exception: " + e.getMessage());
							Toast.makeText(getBaseContext(), "Please enter a number", Toast.LENGTH_LONG).show();
						}
					}}
        );
    }
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
