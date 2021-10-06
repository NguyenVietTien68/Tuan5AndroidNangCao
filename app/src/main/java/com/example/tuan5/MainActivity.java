package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    RecyclerView rcv_song;
    CustomAdapter adt;
    ArrayList<Songs> lSong;
    TextView txt_namec,txt_auc, txt_timec;
    ImageView imgAnh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lSong = new ArrayList<>();
        rcv_song = findViewById(R.id.rcv_song);
        txt_namec = findViewById(R.id.txt_namec);
        txt_auc = findViewById(R.id.txt_Auc);
        txt_timec = findViewById(R.id.txt_timec);
        imgAnh = findViewById(R.id.imgc);

        lSong.add(new Songs(R.drawable.ed, "Bad Habits","Ed Sheeran","4:45"));
        lSong.add(new Songs(R.drawable.badguy, "Bad guy","Billie Eilish","3:26"));
        lSong.add(new Songs(R.drawable.thucgiac, "Thức giấc","DaLab","5:02"));
        lSong.add(new Songs(R.drawable.ba, "3170 3","W/n, Duongg, Nâu, V.A","3:55"));
        lSong.add(new Songs(R.drawable.miss, "I miss you","Czarina","4:21"));
        lSong.add(new Songs(R.drawable.sg, "Sài Gòn Đau Lòng Quá","Hứa Kim Tuyền x Hoàng Duyên","3:50"));
        lSong.add(new Songs(R.drawable.tx, "Có hẹn với thanh xuân","MONSTAR","4:28"));

        adt = new CustomAdapter(lSong,this);
        rcv_song.setHasFixedSize(true);
        rcv_song.setAdapter(adt);
        rcv_song.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
    }
    @Override
    public void click(Songs s) {
        txt_namec.setText(s.getTen());
        txt_auc.setText(s.getTen());
        txt_timec.setText(s.getTen());
        imgAnh.setImageResource(s.getHinh());
    }
}