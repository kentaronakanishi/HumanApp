package jp.techacademy.kentaro.nakanishi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;        //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //名前を徳川綱吉、年齢42歳でHumanのインスタンスを作る
        Human human = new Human("徳川綱吉",42, "生類憐れみ");
        human.say();
        human.think();

        Human human2 = new Human("徳川吉宗",35, "暴れん坊");
        human2.say();
        human2.think();

        Human human3 = new Human("徳川慶喜",27, "大政奉還");
        human3.say();
        human3.think();

    }
}
