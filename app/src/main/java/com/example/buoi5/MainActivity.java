package com.example.buoi5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements WordListAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private WordListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        adapter = new WordListAdapter(getItemList(), this);
        recyclerView.setAdapter(adapter);

    }

    private List<MyItem> getItemList() {
        List<MyItem> itemList = new ArrayList<>();

        MyItem myItem1 = new MyItem(R.drawable.man, "Mận An Phước", "Mận An Phước là giống mận được ghép từ mắt của giống Thongsamsri Thái Lan với gốc mận xanh đường Việt Nam. Mận An Phước có vị rất ngon và hàm lượng dinh dưỡng cao không thua kém các loại trái cây khác. Mận có nhiều tác dụng tốt cho sức khoẻ như: tốt cho xương khớp, cải thiện trí nhớ, hỗ trợ tiêu hoá, ngăn ngừa ung thư.");
        MyItem myItem2 = new MyItem(R.drawable.saurieng, "Sầu Riêng", " Sầu riêng là một loại trái cây lớn, có mùi khá nồng và nặng, nhưng cực kỳ giàu các chất dinh dưỡng, chẳng hạn như vitamin C, vitamin B, khoáng chất." );
        MyItem myItem3 = new MyItem(R.drawable.dautay, "Dâu Tây", "Dâu tây là một loại trái cây được rất nhiều người ưa chuộng. Dâu tây được trồng nhiều ở một số khu vực có khí hậu mát mẻ, thuận lợi. Dâu tây là một nguồn cung cấp chất chống oxy hóa và chất dinh dưỡng có tác dụng bảo vệ sức khỏe mạnh mẽ.");
        MyItem myItem4 = new MyItem(R.drawable.chuoi, "Chuối Chín Vàng", "Loại chuối già được nhiều khách hàng ưa chuộng. Chuối chứa nhiều chất dinh dưỡng như kali, chất xơ, vitamin,... Chuối ăn ngon nhất khi chín vàng, trên vỏ bắt đầu có đốm nâu, khi đó chuối sẽ rất ngọt...Cam kết đúng khối lượng, bao bì kín đáo, an toàn và bảo đảm hợp vệ sinh.");
        MyItem myItem5 = new MyItem(R.drawable.bo, "Bơ Booth", "Bơ Booth là một giống bơ cho năng suất cao và chất lượng ngon được ưa chuộng trên thị trường. Hiện đang được bà con trồng phổ biến ở các tỉnh Tây Nguyên." );
        MyItem myItem6 = new MyItem(R.drawable.duahau, "Dưa Hấu Đỏ","Dưa Hấu Đỏ Long An thuộc giống dưa có hạt, mọng nước hơn và ngọt đậm. Dưa được trồng và thu hoạch đạt tiêu chuẩn an toàn thực phẩm, đảm bảo cho người tiêu dùng..");
        itemList.add(myItem1);
        itemList.add(myItem2);
        itemList.add(myItem3);
        itemList.add(myItem4);
        itemList.add(myItem5);
        itemList.add(myItem6);
        itemList.add(myItem1);
        itemList.add(myItem2);
        itemList.add(myItem3);
        itemList.add(myItem4);
        itemList.add(myItem5);
        itemList.add(myItem6);

        return itemList;
    }

    public void onItemClick(MyItem myItem) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item", myItem.getText());
        intent.putExtra("item2", myItem.getTitle());
        //intent.putExtra("item3", myItem.getImageResId());
        startActivity(intent);
    }

}
