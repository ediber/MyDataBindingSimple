package edi.com.mydatabindingsimple;

import android.databinding.BaseObservable;
import android.databinding.Bindable;



public class MyViewModel extends BaseObservable{
    private String txt;

    @Bindable
    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
        notifyPropertyChanged(edi.com.mydatabindingsimple.BR.txt);
    }

}
