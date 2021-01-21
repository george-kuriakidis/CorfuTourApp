package android.example.corfutourapp;

public class Word {

    private String mDefaultNameId;

    private int mImageResourceId;

    public Word(String defaultNameId, int imageResourceId) {

        mDefaultNameId = defaultNameId;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultNameId() {
        return mDefaultNameId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}

