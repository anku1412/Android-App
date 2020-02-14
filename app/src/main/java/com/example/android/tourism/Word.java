package com.example.android.tourism;

/**
 * Created by Owner on 8/5/2017.
 */

  public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int imageresourceid=no_image_provided;
    private static final int no_image_provided=-1;

    public Word(String defaultTranslation, String miwokTranslation){

        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;

}
    public Word(String defaultTranslation, String miwokTranslation, int resourceid){

        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        imageresourceid=resourceid;
    }

public String getmDefaultTranslation(){
    return mDefaultTranslation;
}
public String getMiwokTranslation()
{
    return mMiwokTranslation;
}
public int getresourceid(){return imageresourceid;}
    public boolean hasboolean(){
        return (imageresourceid!=no_image_provided);
    }
}
