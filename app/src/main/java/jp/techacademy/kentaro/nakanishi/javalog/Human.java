package jp.techacademy.kentaro.nakanishi.javalog;

import android.util.Log;

/**
 * Created by world_000 on 2018/03/06.
 */

public class Human extends Animal implements Thinkable{
     //クラス変数
        static String to_jp = "ヒト";
    //ヒトクラス特別の変数
    String hobby;
        //引数付きコンストラクタ
        public Human(String name, int age, String hobby) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }

        //クラス関数
        public static void introduce(){
            Log.d("javatest", "これはヒトクラスです。");
        }


        //メンバ関数
        public void say() {
            Log.d("javatest","私の名前は"+this.name + "です。　年は" + this.age + "歳です。");
        }

        @Override
        public void think(){
            Log.d("javatest", "私は"+this.hobby+"について考える。");
        }
    }
