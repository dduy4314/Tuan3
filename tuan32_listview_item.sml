<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:layoutDescription="@xml/tuan32_listview_item_scene"
    android:orientation="horizontal"
    >
    <ImageView
        android:src="@color/black"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:id="@+id/t32ItemHinh"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <TextView
            android:textSize="30dp"
            android:text="Ten"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/t32ItemTen"/>
        <TextView
            android:textSize="30dp"
            android:text="Tuoi"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/t32ItemTuoi"/>

    </LinearLayout>
</LinearLayout>
