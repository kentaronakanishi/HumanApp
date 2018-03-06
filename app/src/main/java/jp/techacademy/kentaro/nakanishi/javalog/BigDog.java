package jp.techacademy.kentaro.nakanishi.javalog;

/**
 * Created by world_000 on 2018/03/06.
 */

import android.util.Log;


class BigDog extends Dog {
    //クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name,age);
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
