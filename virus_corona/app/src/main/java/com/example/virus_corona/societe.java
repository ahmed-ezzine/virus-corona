package com.example.virus_corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class societe extends AppCompatActivity {
    CheckBox tunis,ariana,beja,benarous,bizerte,gabes,gafsa,jendouba,kairouan,kassrine,kebili,lekef,mahdia,manouba,medenine,monastir,nabeul,sfax,sidbouzid,siliana,sousse,tataouin,tozeur,zaghouan;
    Button btnsuiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_societe);
        tunis=findViewById(R.id.tunisa);
        ariana=findViewById(R.id.arianaa);
        beja=findViewById(R.id.bejaa);
        benarous=findViewById(R.id.benarousa);
        bizerte=findViewById(R.id.bizertea);
        gabes=findViewById(R.id.gabesa);
        gafsa=findViewById(R.id.gafsaa);
        jendouba=findViewById(R.id.jendoubaa);
        kairouan=findViewById(R.id.kairouana);
        kassrine=findViewById(R.id.kassrinea);
        kebili=findViewById(R.id.kebilia);
        lekef=findViewById(R.id.lekefa);
        mahdia=findViewById(R.id.mahdia);
        manouba=findViewById(R.id.manoubaa);
        medenine=findViewById(R.id.medeninea);
        monastir=findViewById(R.id.monastira);
        nabeul=findViewById(R.id.nabeula);
        sfax=findViewById(R.id.sfaxa);
        sidbouzid=findViewById(R.id.sidibouzida);
        siliana=findViewById(R.id.silianaa);
        sousse=findViewById(R.id.soussea);
        tataouin=findViewById(R.id.tataouina);
        tozeur=findViewById(R.id.tozeura);
        zaghouan=findViewById(R.id.zaghouana);
        btnsuiv=findViewById(R.id.btnsuiva);
        btnsuiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tunis.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), tunis.class);
                    startActivity(otherrr);
                }
                else if (ariana.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), ariana.class);
                    startActivity(otherrr);
                }
                else if (beja.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), beja.class);
                    startActivity(otherrr);
                }
                else if (benarous.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), benarous.class);
                    startActivity(otherrr);
                }
                else if (bizerte.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), bizerte.class);
                    startActivity(otherrr);
                }
                else if (gabes.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), gabes.class);
                    startActivity(otherrr);
                }
                else if (gafsa.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), gafsa.class);
                    startActivity(otherrr);
                }
                else if (jendouba.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), jendouba.class);
                    startActivity(otherrr);
                }
                else if (kairouan.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(),kairouan.class);
                    startActivity(otherrr);
                }
                else if (kassrine.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(),kassrine.class);
                    startActivity(otherrr);
                }
                else if (kebili.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), kebili.class);
                    startActivity(otherrr);
                }
                else if (lekef.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), lekef.class);
                    startActivity(otherrr);
                }
                else if (mahdia.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), mahdia.class);
                    startActivity(otherrr);
                }
                else if (manouba.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), manouba.class);
                    startActivity(otherrr);
                }
                else if (medenine.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), medenine.class);
                    startActivity(otherrr);
                }
                else if (monastir.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), monastir.class);
                    startActivity(otherrr);
                }
                else if (nabeul.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), nabeul.class);
                    startActivity(otherrr);
                }
                else if (sfax.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), sfax.class);
                    startActivity(otherrr);
                }
                else if (sidbouzid.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), sidibouzid.class);
                    startActivity(otherrr);
                }
                else if (siliana.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), siliana.class);
                    startActivity(otherrr);
                }
                else if (sousse.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), sousse.class);
                    startActivity(otherrr);
                }
                else if (tataouin.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), tata.class);
                    startActivity(otherrr);
                }
                else if (tozeur.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), tozeur.class);
                    startActivity(otherrr);
                }
                else if (zaghouan.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), zaghouan.class);
                    startActivity(otherrr);
                }

                else{
                    Toast.makeText(getApplicationContext(), "s'il vous plais coucher votre ville ", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

}
