package com.junxiangyuan.utils;

import java.io.File;

import android.content.Context;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.utils.StorageUtils;

public class ImageTools {
	public static ImageLoader mImageLoader;
	public ImageTools(Context mContext) {
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
				mContext).build();
		ImageLoader.getInstance().init(config);
		File cacheDir = StorageUtils.getOwnCacheDirectory(mContext.getApplicationContext(), "imageloader/Cache");  
	}
	
	public ImageLoader getInstance() {
		return ImageLoader.getInstance();
	}
}
