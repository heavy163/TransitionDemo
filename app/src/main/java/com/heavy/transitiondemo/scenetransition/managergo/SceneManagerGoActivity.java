package com.heavy.transitiondemo.scenetransition.managergo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.heavy.transitiondemo.R;
import com.heavy.transitiondemo.scenetransition.managergo.autotransition.SceneAutoTransitionActivity;
import com.heavy.transitiondemo.scenetransition.managergo.changebounds.SceneChangeBoundsActivity;
import com.heavy.transitiondemo.scenetransition.managergo.changeclipbounds.SceneChangeClipBoundsActivity;
import com.heavy.transitiondemo.scenetransition.managergo.changeimagetransform.SceneChangeImageTransformBoundsActivity;
import com.heavy.transitiondemo.scenetransition.managergo.changetransform.SceneChangeTransformActivity;
import com.heavy.transitiondemo.scenetransition.managergo.combination.SceneCombinationActivity;
import com.heavy.transitiondemo.scenetransition.managergo.explode.SceneExplodeActivity;
import com.heavy.transitiondemo.scenetransition.managergo.fade.SceneFadeActivity;
import com.heavy.transitiondemo.scenetransition.managergo.slide.SceneSlideActivity;


public class SceneManagerGoActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scene_manager_go);
		mContext = this;
		initView();
		initEvent();
		initData();
	}

	private void initView() {
	}

	private void initEvent() {
		findViewById(R.id.layout_scene_go_auto_transition).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneAutoTransitionActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_change_bounds).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneChangeBoundsActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_change_transform).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneChangeTransformActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_change_clip_bounds).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneChangeClipBoundsActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_change_image_transform).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneChangeImageTransformBoundsActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_fade).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneFadeActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_slide).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneSlideActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_explode).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneExplodeActivity.class));
			}
		});
		findViewById(R.id.layout_scene_go_combination).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mContext, SceneCombinationActivity.class));
			}
		});
	}

	private void initData() {
	}

}
