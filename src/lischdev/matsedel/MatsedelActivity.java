package lischdev.matsedel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

 
public class MatsedelActivity extends Activity {
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		WebView web = (WebView) findViewById(R.id.webView);
		web.loadUrl("http://stonehammer.dyndns.org/matsedel/index.php?idag");        
        
   
    }
    public void changePage(View view) {
    	switch(view.getId()) {
    	case R.id.idag:
    		refresh("idag");
    		break;
    	case R.id.vecka:
    		refresh("vecka");
    		break;
    	case R.id.termin:
    		refresh("alla");
    		break;
    	}
    }
    public void refresh(String page) {
		WebView web = (WebView) findViewById(R.id.webView);
		if(web.getUrl().toString() != "http://stonehammer.dyndns.org/matsedel/index.php?" + page) {
			web.loadUrl("http://stonehammer.dyndns.org/matsedel/index.php?" + page);			
		}

		
    }
}