package sg.edu.rp.c346.id21012377.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.ToggleButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ETamt;
    EditText ETamtP;
    EditText ETd;
    Button BTr;
    Button BTs;
    ToggleButton TBsvs;
    ToggleButton TBgst;
    RadioGroup rgPayment;
    TextView ttlBill;
    TextView IndiePay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ETamt =findViewById(R.id.editTextAmt);
        ETamtP =findViewById(R.id.editTextNoOfPax);
        ETd =findViewById(R.id.editTextDisc);
        BTr = findViewById(R.id.buttonReset);
        BTs =findViewById(R.id.buttonSplit);
        TBsvs =findViewById(R.id.toggleButtonSVS);
        TBgst =findViewById(R.id.toggleButtonGST);
        rgPayment = findViewById(R.id.Payment);
        ttlBill = findViewById(R.id.textViewTtl);
        IndiePay = findViewById(R.id.textViewEP);

        BTs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int checkRID = rgPayment.getCheckedRadioButtonId();
                double svs =0.93;
                double gst = 0.9;
                double d = 1.0;
                if(checkRID == R.id.radioButtonCash){
                    if(TBgst.isChecked() == true && TBsvs.isChecked() == true){
                        double Amt = Double.parseDouble(ETamt.getText().toString())*(d - (Double.parseDouble(ETd.getText().toString())/100));
                        double Famt1 = (Amt*svs);
                        double Famt = (Famt1*gst);
                        double Pamt = (Famt / (Integer.parseInt(ETamtP.getText().toString())));
                        String val1 =String.format("%.2f",Famt);
                        String val2 =String.format("%.2f",Famt);
                        String fval1 =String.valueOf(val1);
                        String fval2 =String.valueOf(val2);
                        ttlBill.setText("The Bill is: $" + val1);
                        IndiePay.setText("Each pays: $" + val2);

                    }else if (TBgst.isChecked() == true && TBsvs.isChecked() == false){
                        double Amt = Double.parseDouble(ETamt.getText().toString()) * (1 - (Double.parseDouble(ETd.getText().toString())/100));
                        double Famt = (Amt*gst);
                        double Pamt = (Famt / (Integer.parseInt(ETamtP.getText().toString())));
                        String val1 =String.format("%.2f",Famt);
                        String val2 =String.format("%.2f",Famt);
                        String fval1 =String.valueOf(val1);
                        String fval2 =String.valueOf(val2);
                        ttlBill.setText("The Bill is: $" + val1);
                        IndiePay.setText("Each pays: $" + val2);

                    }else if(TBgst.isChecked() == false && TBsvs.isChecked() == true){
                        double Amt = Double.parseDouble(ETamt.getText().toString()) * (1 - (Double.parseDouble(ETd.getText().toString())/100));
                        double Famt = (Amt*svs);
                        double Pamt = (Famt / (Integer.parseInt(ETamtP.getText().toString())));
                        String val1 =String.format("%.2f",Famt);
                        String val2 =String.format("%.2f",Famt);
                        String fval1 =String.valueOf(val1);
                        String fval2 =String.valueOf(val2);
                        ttlBill.setText("The Bill is: $" + val1);
                        IndiePay.setText("Each pays: $" + val2);

                    }else{

                    }
                }else{
                    if(TBgst.isChecked() == true && TBsvs.isChecked() == true){
                        double Amt = Double.parseDouble(ETamt.getText().toString()) * (1 - (Double.parseDouble(ETd.getText().toString())/100));
                        double Famt1 = (Amt*svs);
                        double Famt = (Famt1*gst);
                        double Pamt = (Famt / (Integer.parseInt(ETamtP.getText().toString())));
                        String val1 =String.format("%.2f",Famt);
                        String val2 =String.format("%.2f",Famt);
                        String fval1 =String.valueOf(val1);
                        String fval2 =String.valueOf(val2);
                        ttlBill.setText("The Bill is: $" + val1);
                        IndiePay.setText("Each paynow: $" + val2 +" to 97283455");

                    }else if (TBgst.isChecked() == true && TBsvs.isChecked() == false){
                        double Amt = Double.parseDouble(ETamt.getText().toString()) * (1 - (Double.parseDouble(ETd.getText().toString())/100));
                        double Famt = (Amt*gst);
                        double Pamt = (Famt / (Integer.parseInt(ETamtP.getText().toString())));
                        String val1 =String.format("%.2f",Famt);
                        String val2 =String.format("%.2f",Famt);
                        String fval1 =String.valueOf(val1);
                        String fval2 =String.valueOf(val2);
                        ttlBill.setText("The Bill is: $" + val1);
                        IndiePay.setText("Each paynow: $" + val2 +" to 97283455");

                    }else if(TBgst.isChecked() == false && TBsvs.isChecked() == true){
                        double Amt = Double.parseDouble(ETamt.getText().toString()) * (1 - (Double.parseDouble(ETd.getText().toString())/100));
                        double Famt = (Amt*svs);
                        double Pamt = (Famt / (Integer.parseInt(ETamtP.getText().toString())));
                        String val1 =String.format("%.2f",Famt);
                        String val2 =String.format("%.2f",Famt);
                        String fval1 =String.valueOf(val1);
                        String fval2 =String.valueOf(val2);
                        ttlBill.setText("The Bill is: $" + val1);
                        IndiePay.setText("Each paynow: $" + val2 +" to 97283455");



                    }

                }

            }
        });

        BTr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ETamt.getText().clear();
                ETamtP.getText().clear();
                ETd.getText().clear();
            }
        });
    }
}