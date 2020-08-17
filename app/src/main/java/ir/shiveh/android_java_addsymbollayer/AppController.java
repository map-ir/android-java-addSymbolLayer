package ir.shiveh.android_java_addsymbollayer;

import android.app.Application;
import ir.map.sdk_map.Mapir;

public class AppController extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //TODO Please add your API_KEY
        Mapir.getInstance(this, "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjY2N2U4NWU3NDNjMmVlMGU0OTYwNzU2NDQ2ZjUxNTA0ZmRjY2ZjMjBhMDE4YWFmZWM5NWYyYTllNTZiZWNiNjRhYTQxM2VlMGQ5MTU0YzQ0In0.eyJhdWQiOiI5NDQ5IiwianRpIjoiNjY3ZTg1ZTc0M2MyZWUwZTQ5NjA3NTY0NDZmNTE1MDRmZGNjZmMyMGEwMThhYWZlYzk1ZjJhOWU1NmJlY2I2NGFhNDEzZWUwZDkxNTRjNDQiLCJpYXQiOjE1OTc2NTA3NDksIm5iZiI6MTU5NzY1MDc0OSwiZXhwIjoxNTk5MjA1OTQ5LCJzdWIiOiIiLCJzY29wZXMiOlsiYmFzaWMiXX0.ATEYU5cUokd3EldKtWuHVlNwrlRy_fzZw6ztALxEma_m1_8CGq_DFGyHvY5Icqiei81HDueOGNXyd4ToR6R1xkj8qkg_-qUI0rCvY9YWnz_Ns4Q2eOZBz1lvdpArffdCXA77NkxYoUbrLbdx1WVIYJonVcdnan5gK4nZOJyRpM_TRYL5CdSOxpFu47J8nR22PbLKOhAbAGBBs-RSxvvpSqXydFP1aUExHLFTGtKIcFGQ2X_Gq51Fb79ZNl3H5nTBWj-HLdU4le1EUafu2h62cEPjAsK921ufJY-5DoO5IMCz6YusI93zPNiXtgH0_pCbpEM-7Isq-g34tnPA-8-3WQ");
    }
}
