package com.example.animation_demo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView img_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img_01 = (ImageView) findViewById(R.id.img_01);

        findViewById(R.id.bt_jianbian).setOnClickListener(this);
        findViewById(R.id.bt_suofang).setOnClickListener(this);
        findViewById(R.id.bt_weiyi).setOnClickListener(this);
        findViewById(R.id.bt_xuanzhuan).setOnClickListener(this);
        findViewById(R.id.bt_daima).setOnClickListener(this);
        findViewById(R.id.bt_tiaozhuan).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){


    ///////////XML  中实现动画效果 ////// //////////////

            case R.id.bt_jianbian:{


            //  加载 XML 文件中配置的动画效果
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha);

                img_01.startAnimation(animation);

            }break;

            case R.id.bt_suofang:{

                //  加载 XML 文件中配置的动画效果
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
                img_01.startAnimation(animation);

            }break;

            case R.id.bt_weiyi:{

                //  加载 XML 文件中配置的动画效果
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
                img_01.startAnimation(animation);

            }break;

            case R.id.bt_xuanzhuan:{

                //  加载 XML 文件中配置的动画效果
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
                img_01.startAnimation(animation);

            }break;

////////////////////////////////////////////////////  以上是  XML  中实现动画效果


 ///////////////代码中实现//////////////

            case R.id.bt_daima:{


             //渐变效果
//                AlphaAnimation animation = new AlphaAnimation(0, 1);
//                animation.setDuration(3000);
//                img_01.startAnimation(animation);


             //位移效果
//                TranslateAnimation animation = new TranslateAnimation(0, 100, 0, 100);
//                animation.setDuration(3000);
//                img_01.startAnimation(animation);


             //旋转效果

                //获取图片的长和宽
                int height = img_01.getHeight();
                int width = img_01.getWidth();

                RotateAnimation animation = new RotateAnimation(0, 720, height, width);
                animation.setDuration(3000);
                img_01.startAnimation(animation);



              //缩放效果
//                ScaleAnimation animation = new ScaleAnimation(0, 10, 0, 10, 0, 0);
//                animation.setDuration(3000);
//                img_01.startAnimation(animation);


            }break;

    /////////////////////////////////////////////


//////////////////////////  跳转页面////////////////////

            case R.id.bt_tiaozhuan:{

                Intent it = new Intent(this, SecondActivity.class);
                startActivity(it);
                finish();
                overridePendingTransition(R.anim.in_anim,R.anim.out_anim);


            }break;

        }


    }
}
