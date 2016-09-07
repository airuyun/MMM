package com.example.lesson5_layout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 要将一个layout加载成一个视图 View
		// 广泛的使用
		// 1.任意地方 只要传递一个上下文
		View view = View.inflate(this, R.layout.activity_main, null);
		// 2.Activity中是用
		getLayoutInflater().inflate(R.layout.activity_main, null);
		// 3.任意地方
		LayoutInflater.from(this).inflate(R.layout.activity_main, null);
		// 底层的 单利模式
		setContentView(view);

	}
}
