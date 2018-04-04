package ma.arrosyidiyah.com.exambrowser;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by IS PROJECT 2018.
 */

public class progressDialogModel {

    static ProgressDialog progressDialog;

    public static void pdMenyiapkanDataLogin(Context context){
        progressDialog=new ProgressDialog(context, R.style.AppCompatAlertDialogStyle);
        progressDialog.setMessage("Menyiapkan Data....");
        progressDialog.setTitle("Silahkan Tunggu");
        progressDialog.show();
    }

    public static void hideProgressDialog(){
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }

}
