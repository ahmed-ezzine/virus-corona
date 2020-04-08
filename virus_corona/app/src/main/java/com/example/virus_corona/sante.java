package com.example.virus_corona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class sante extends AppCompatActivity {
    CheckBox tunis,ariana,beja,benarous,bizerte,gabes,gafsa,jendouba,kairouan,kassrine,kebili,lekef,mahdia,manouba,medenine,monastir,nabeul,sfax,sidbouzid,siliana,sousse,tataouin,tozeur,zaghouan;
    Button btnsuiv,btnret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sante);
        tunis=findViewById(R.id.tunis);
        ariana=findViewById(R.id.arianaa);
        beja=findViewById(R.id.beja);
        benarous=findViewById(R.id.benarousa);
        bizerte=findViewById(R.id.bizertea);
        gabes=findViewById(R.id.gabesa);
        gafsa=findViewById(R.id.gafsaa);
        jendouba=findViewById(R.id.jendoubaa);
        kairouan=findViewById(R.id.kairouana);
        kassrine=findViewById(R.id.kassrinea);
        kebili=findViewById(R.id.kebilia);
        lekef=findViewById(R.id.lekefa);
        mahdia=findViewById(R.id.mahdiaa);
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
        btnsuiv=findViewById(R.id.btnsuiv);
        btnsuiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tunis.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rtunis.class);
                    startActivity(otherrr);
                }
                else if (ariana.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rariana.class);
                    startActivity(otherrr);
                }
                else if (beja.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rbeja.class);
                    startActivity(otherrr);
                }
                else if (benarous.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rbenarous.class);
                    startActivity(otherrr);
                }
                else if (bizerte.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rbizerte.class);
                    startActivity(otherrr);
                }
                else if (gabes.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rgabes.class);
                    startActivity(otherrr);
                }
                else if (gafsa.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rgafsa.class);
                    startActivity(otherrr);
                }
                else if (jendouba.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rjandouba.class);
                    startActivity(otherrr);
                }
                else if (kairouan.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(),rkairouan.class);
                    startActivity(otherrr);
                }
                else if (kassrine.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(),rkassrine.class);
                    startActivity(otherrr);
                }
                else if (kebili.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rkebili.class);
                    startActivity(otherrr);
                }
                else if (lekef.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rlekef.class);
                    startActivity(otherrr);
                }
                else if (mahdia.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rmahdia.class);
                    startActivity(otherrr);
                }
                else if (manouba.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rmanouba.class);
                    startActivity(otherrr);
                }
                else if (medenine.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rmedenine.class);
                    startActivity(otherrr);
                }
                else if (monastir.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rmonastir.class);
                    startActivity(otherrr);
                }
                else if (nabeul.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rnabeul.class);
                    startActivity(otherrr);
                }
                else if (sfax.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rsfax.class);
                    startActivity(otherrr);
                }
                else if (sidbouzid.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rsidibouzid.class);
                    startActivity(otherrr);
                }
                else if (siliana.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rsiliana.class);
                    startActivity(otherrr);
                }
                else if (sousse.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rsousse.class);
                    startActivity(otherrr);
                }
                else if (tataouin.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rtataouin.class);
                    startActivity(otherrr);
                }
                else if (tozeur.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rtozeur.class);
                    startActivity(otherrr);
                }
                else if (zaghouan.isChecked()){
                    Intent otherrr = new Intent(getApplicationContext(), rzaghouan.class);
                    startActivity(otherrr);
                }
                else{
                    Toast.makeText(getApplicationContext(), "s'il vous plais coucher votre ville ", Toast.LENGTH_LONG).show();

                }
            }
        });
        btnret=findViewById(R.id.btnret);
        btnret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherrr = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(otherrr);
            }
        });
    }
}
