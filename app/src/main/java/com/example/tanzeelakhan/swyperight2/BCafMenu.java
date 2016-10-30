package com.example.tanzeelakhan.swyperight2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;



public class BCafMenu extends AppCompatActivity {

    private TextView bcafbf;
    private TextView bcafdin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcaf_menu);

        bcafbf = (TextView) findViewById(R.id.bcafbf);
        bcafdin = (TextView) findViewById(R.id.bcafdin);

        bcafbf.setText("Breakfast\n" +
                "Cold Cereal\n" +
                "Ham & Cheese Croissant\n" +
                "Spinach & Cheese Crossiant\n" +
                "Steel-Cut Oatmeal Cup\n" +
                "Yogurt Cup\n" +
                "Berry Yogurt Bowl\n" +
                "Fresh Fruit Cup\n" +
                "Mango Pineapple Parfait\n" +
                "Yogurt Bowl w/ Banana, Pistachio & Pomagranate Seeds\n");

        bcafdin.setText("Lunch/Dinner\n" +
                "Avocado BLT\n" +
                "BBQ Beef Brisket\n" +
                "Ham & Swiss\n" +
                "Roast Beef & Cheddar\n" +
                "Roasted Turkey & Provolone\n" +
                "Tuna\n" +
                "Vegan BBQ\n");

//            try {
//                Document doc = Jsoup.connect("http://google.com").get();
//                Element html = doc.select("html").first();
//                Log.d("html", html.text());
////                URL url = new URL("http://menu.ha.ucla.edu/foodpro/bruincafe.asp");
////                BufferedReader reader = null;
////                StringBuilder builder = new StringBuilder();
////                reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
////                for (String line; (line = reader.readLine()) != null;) {
////                    builder.append(line.trim());
////                }
////                if (reader != null)  { reader.close(); }
////
////
////                String start = "<html>";
////                String end = "</html>";
////                String part = builder.substring(builder.indexOf(start) + start.length());
////                String question = part.substring(0, part.indexOf(end));
//////                System.out.println(question);
////                Log.d("question", question);
//            } catch (Exception e) {
//
//            }





    }
}
