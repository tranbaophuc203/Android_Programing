<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">


    <TextView
        android:id="@+id/textView2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#F44336"
        android:text="HỌC SINH LỚP 1"
        android:textAlignment="center"
        android:textSize="24sp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/textView3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="#8BC34A"
            android:text="Học sinh viết:"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/edta"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:minLines="7"
            android:ems="10"
            android:gravity="start|top"
            android:inputType="textMultiLine" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/textView4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="#8BC34A"
            android:text="Cô giáo sửa:"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/edtkq"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:minLines="7"
            android:ems="10"
            android:gravity="start|top"
            android:inputType="textMultiLine" />
    </LinearLayout>

    <Button
        android:id="@+id/btnsend"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="NỘP BÀI" />
</LinearLayout>