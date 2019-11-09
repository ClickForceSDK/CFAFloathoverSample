package force.click.com.cfafloathoversample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;

import com.clickforce.ad.AdFloatHover;
import com.clickforce.ad.Listener.AdFloatHoverListener;

public class MainActivity extends AppCompatActivity {
    private AdFloatHover adFloatHover;
    private ScrollView sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sc = (ScrollView) findViewById(R.id.scrollview);

        adFloatHover = (AdFloatHover) findViewById(R.id.adfloathover);
        adFloatHover.getAd(10175);
        adFloatHover.setScrollview(sc);
        adFloatHover.outputDebugInfo = true;
        adFloatHover.setOnAdFloatHoverListener(new AdFloatHoverListener() {
            @Override
            public void onSuccessToAdFloatHover() {
                adFloatHover.show();
                Log.d("ClickForce","onSuccessToAdFloatHover");
            }

            @Override
            public void onFailToAdFloatHover() {
                Log.d("ClickForce","onFailToAdFloatHover");
            }

            @Override
            public void onClickToAAdFloatHover() {
                Log.d("ClickForce","onClickToAAdFloatHover");
            }

            @Override
            public void onCloseToAdFloatHover() {
                Log.d("ClickForce","onCloseToAdFloatHover");
            }
        });


    }
}
