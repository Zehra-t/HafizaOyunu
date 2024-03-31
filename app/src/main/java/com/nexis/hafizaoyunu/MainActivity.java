package com.nexis.hafizaoyunu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView tw_p1,tw_p2;
    ImageView ic_11,ic_12,ic_13,ic_14;
    ImageView ic_21,ic_22,ic_23,ic_24;
    ImageView ic_31,ic_32,ic_33,ic_34;

    Integer[] cardsArray={101,102,103,105,106,201,202,203,204,205,206};
    int ari1,ari2,balina1,balina2,civciv1,civciv2,dino1,dino2,kedi1,kedi2,koyun1,koyun2;
    int first_card,sec_card;
    int click_first,click_sec;
    int card_num=1;
    int turn=1;
    int player_points=0,comp_points=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tw_p1=findViewById(R.id.tw_p1);
        tw_p2=findViewById(R.id.tw_p2);

        ic_11=findViewById(R.id.ic_11);
        ic_12=findViewById(R.id.ic_12);
        ic_13=findViewById(R.id.ic_13);
        ic_14=findViewById(R.id.ic_14);
        ic_21=findViewById(R.id.ic_21);
        ic_22=findViewById(R.id.ic_22);
        ic_23=findViewById(R.id.ic_23);
        ic_24=findViewById(R.id.ic_24);
        ic_31=findViewById(R.id.ic_31);
        ic_32=findViewById(R.id.ic_32);
        ic_33=findViewById(R.id.ic_33);
        ic_34=findViewById(R.id.ic_34);

        ic_11.setTag("0");
        ic_12.setTag("1");
        ic_13.setTag("2");
        ic_14.setTag("3");
        ic_21.setTag("4");
        ic_22.setTag("5");
        ic_23.setTag("6");
        ic_24.setTag("7");
        ic_31.setTag("8");
        ic_32.setTag("9");
        ic_33.setTag("10");
        ic_34.setTag("11");
        OnYuz();
        Collections.shuffle(Arrays.asList(cardsArray));
        //2. oyuncu inaktif olunca rengini griye çevir
        tw_p2.setTextColor(Color.GRAY);

        //onclicklistener
        ic_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });

        ic_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        ic_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff((ImageView) v, theCard);
            }
        });
        


    }


    private void OnYuz() {
        ari1=R.drawable.ari1;
        ari2=R.drawable.ari2;
        balina1=R.drawable.balina1;
        balina2=R.drawable.balina2;
        civciv1=R.drawable.civciv1;
        civciv2=R.drawable.civciv2;
        dino1=R.drawable.dino1;
        dino2=R.drawable.dino2;
        kedi1=R.drawable.kedi1;
        kedi2=R.drawable.kedi2;
        koyun1=R.drawable.koyun1;
        koyun2=R.drawable.koyun2;

    }
    private int getCardResource(int cardValue) {
        switch (cardValue) {
            case 101:
                return ari1;
            case 102:
                return balina1;
            case 103:
                return civciv1;
            case 105:
                return kedi1;
            case 106:
                return koyun1;
            case 201:
                return ari2;
            case 202:
                return balina2;
            case 203:
                return civciv2;
            case 204:
                return dino1;
            case 205:
                return kedi2;
            case 206:
                return koyun2;
            default:
                return 0; // Geçersiz kart değeri
        }
    }

    private void doStuff(ImageView imageView, int cardIndex) {
        // ImageView'in özelliğini güncelleme veya başka işlemler yapma
        // cardIndex ile ilgili işlemleri gerçekleştirme
        int cardValue = cardsArray[cardIndex];
        int cardResource = getCardResource(cardValue);
        if (cardResource != 0) {
            imageView.setImageResource(cardResource);
        }

        // Hangi görüntünün seçildiğini kontrol edin ve onu geçici değişkene kaydedin
        if (card_num == 1) {
            first_card = cardsArray[cardIndex];
            if (first_card > 200) {
                first_card = first_card - 100;
            }
            card_num = 2;
            click_first = cardIndex;
            imageView.setEnabled(false);
        } else if (card_num == 2) {
            sec_card = cardsArray[cardIndex];
            if (sec_card > 200) {
                sec_card = sec_card - 100;
            }
            card_num = 1;
            click_sec = cardIndex;

            // Kartların tıklanabilirliğini devre dışı bırak
            ic_11.setEnabled(false);
            ic_12.setEnabled(false);
            ic_13.setEnabled(false);
            ic_14.setEnabled(false);
            ic_21.setEnabled(false);
            ic_22.setEnabled(false);
            ic_23.setEnabled(false);
            ic_24.setEnabled(false);
            ic_31.setEnabled(false);
            ic_32.setEnabled(false);
            ic_33.setEnabled(false);
            ic_34.setEnabled(false);

            // Eşleşme kontrolünü bir saniye sonra gerçekleştir
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Seçilen resimlerin eşit olup olmadığını kontrol et
                    calculate();

                    // Kartların tıklanabilirliğini geri aç
                    ic_11.setEnabled(true);
                    ic_12.setEnabled(true);
                    ic_13.setEnabled(true);
                    ic_14.setEnabled(true);
                    ic_21.setEnabled(true);
                    ic_22.setEnabled(true);
                    ic_23.setEnabled(true);
                    ic_24.setEnabled(true);
                    ic_31.setEnabled(true);
                    ic_32.setEnabled(true);
                    ic_33.setEnabled(true);
                    ic_34.setEnabled(true);
                }
            }, 1000);
        }
    }

    private void calculate(){
        //eğer görseller eşitse tgem'i kaldır ve nokta ekle
        if (first_card== sec_card){
            if (click_first==0){
                ic_11.setVisibility(View.INVISIBLE);
            }else if (click_first==1){
                ic_12.setVisibility(View.INVISIBLE);
            }else if (click_first==2){
                ic_13.setVisibility(View.INVISIBLE);
            }else if (click_first==3){
                ic_14.setVisibility(View.INVISIBLE);
            }else if (click_first==4){
                ic_21.setVisibility(View.INVISIBLE);
            }else if (click_first==5){
                ic_22.setVisibility(View.INVISIBLE);
            }else if (click_first==6){
                ic_23.setVisibility(View.INVISIBLE);
            }else if (click_first==7){
                ic_24.setVisibility(View.INVISIBLE);
            }else if (click_first==8){
                ic_31.setVisibility(View.INVISIBLE);
            }else if (click_first==9){
                ic_32.setVisibility(View.INVISIBLE);
            }else if (click_first==10){
                ic_33.setVisibility(View.INVISIBLE);
            }else if (click_first==11){
                ic_34.setVisibility(View.INVISIBLE);
            }

            if (click_sec==0){
                ic_11.setVisibility(View.INVISIBLE);
            }else if (click_sec==1){
                ic_12.setVisibility(View.INVISIBLE);
            }else if (click_sec==2){
                ic_13.setVisibility(View.INVISIBLE);
            }else if (click_sec==3){
                ic_14.setVisibility(View.INVISIBLE);
            }else if (click_sec==4){
                ic_21.setVisibility(View.INVISIBLE);
            }else if (click_sec==5){
                ic_22.setVisibility(View.INVISIBLE);
            }else if (click_sec==6){
                ic_23.setVisibility(View.INVISIBLE);
            }else if (click_sec==7){
                ic_24.setVisibility(View.INVISIBLE);
            }else if (click_sec==8){
                ic_31.setVisibility(View.INVISIBLE);
            }else if (click_sec==9){
                ic_32.setVisibility(View.INVISIBLE);
            }else if (click_sec==10){
                ic_33.setVisibility(View.INVISIBLE);
            }else if (click_sec==11){
                ic_34.setVisibility(View.INVISIBLE);
            }
            if (turn==1){
                player_points++;
                tw_p1.setText("P1:" +player_points);
            }else if(turn==2){
                comp_points++;
                tw_p2.setText("P2:" +comp_points);
            }
        }else {
            ic_11.setImageResource(R.drawable.icon);
            ic_12.setImageResource(R.drawable.icon);
            ic_13.setImageResource(R.drawable.icon);
            ic_14.setImageResource(R.drawable.icon);
            ic_21.setImageResource(R.drawable.icon);
            ic_22.setImageResource(R.drawable.icon);
            ic_23.setImageResource(R.drawable.icon);
            ic_24.setImageResource(R.drawable.icon);
            ic_31.setImageResource(R.drawable.icon);
            ic_32.setImageResource(R.drawable.icon);
            ic_33.setImageResource(R.drawable.icon);
            ic_34.setImageResource(R.drawable.icon);

            if (turn==1){
                turn = 2;
                tw_p1.setTextColor(Color.GRAY);
                tw_p2.setTextColor(Color.BLACK);
            }else if (turn==2){
                turn=1;
                tw_p2.setTextColor(Color.GRAY);
                tw_p1.setTextColor(Color.BLACK);
            }

        }
        ic_11.setEnabled(true);
        ic_12.setEnabled(true);
        ic_13.setEnabled(true);
        ic_14.setEnabled(true);
        ic_21.setEnabled(true);
        ic_22.setEnabled(true);
        ic_23.setEnabled(true);
        ic_24.setEnabled(true);
        ic_31.setEnabled(true);
        ic_32.setEnabled(true);
        ic_33.setEnabled(true);
        ic_34.setEnabled(true);

        sonuclar();



    }
    private void sonuclar(){
        if (    ic_11.getVisibility()== View.INVISIBLE &&
                ic_12.getVisibility()== View.INVISIBLE &&
                ic_13.getVisibility()== View.INVISIBLE &&
                ic_14.getVisibility()== View.INVISIBLE &&
                ic_21.getVisibility()== View.INVISIBLE &&
                ic_22.getVisibility()== View.INVISIBLE &&
                ic_23.getVisibility()== View.INVISIBLE &&
                ic_24.getVisibility()== View.INVISIBLE &&
                ic_31.getVisibility()== View.INVISIBLE &&
                ic_32.getVisibility()== View.INVISIBLE &&
                ic_33.getVisibility()== View.INVISIBLE &&
                ic_34.getVisibility()== View.INVISIBLE
        )
        {
            AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("OYUN BİTTİ!\nP1:"+player_points+"\nP2:"+comp_points).setCancelable(false).setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            })
                    .setNegativeButton("ÇIKIŞ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();

                        }
                    });
            AlertDialog alertDialog=alertDialogBuilder.create();
            alertDialog.show();

        }
    }







}