package com.kirgo.expensemanager.Utitilities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;


import java.io.InputStream;
import java.net.URL;

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap > {
    ImageView imageView;

    public DownloadImageTask (ImageView imageView) {
        this.imageView = imageView;
    }

    protected Bitmap doInBackground(String...urls) {
        String urlOfImage = urls[0];
        Bitmap logo = null;
        try{
            InputStream is = new URL(urlOfImage).openStream ();
            logo = BitmapFactory.decodeStream (is);
        }
        catch ( Exception e ) {
            e.printStackTrace ( );
        }
        return logo;
    }

    @Override
    protected void onPostExecute (Bitmap result) {
        imageView.setImageBitmap (result);
    }
}
