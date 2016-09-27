package com.example.andorid.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    // Declare variables
    private String mDefaultTranslation, mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    /**
     * Constructor
     * @param defaultTranslation default text
     * @param miwokTranslation miwok text
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Other constructor
     * @param defaultTranslation default text
     * @param miwokTranslation miwok text
     * @param audioResourceId image resource
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Other constructor with audio
     * @param defaultTranslation default text
     * @param miwokTranslation miwok text
     * @param imageResourceId image resource
     * @param audioResourceId audio resource
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Method to get default text
     * @return default text
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Method to get miwok text
     * @return miwok text
     */
    public String getMiwokTranslation() { return mMiwokTranslation; }

    /**
     * Metdhod to get image resource id
     * @return image resource
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Method to get audio resource id
     * @return audio resource
     */
    public int getAudioResourceId() { return mAudioResourceId; }

    /**
     * Return whether has image or not
     * @return boolean
     */
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }


    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
