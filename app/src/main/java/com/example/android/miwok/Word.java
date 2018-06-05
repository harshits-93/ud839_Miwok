package com.example.android.miwok;


/**
 * {@link Word}represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = 0;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // resource id for audio
    private int mAudioResoureceId;

    /**
     * Default translation for the word
     */

    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */

    private String mMiwokTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResoureceId = audioResourceId;

    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResoureceId = audioResourceId;
    }

    // return resourse id of image

    public int getImageResourceId() {

        return mImageResourceId;
    }

    // return resourse id of audio

    public int getAudioResoureceId() {

        return mAudioResoureceId;
    }

    /**
     * Get the default translation of the word.
     */


    public String getDefaultTranslation() {
        return mDefaultTranslation;

    }

    /**
     * Get the Miwok translation of the word.
     */


    public String getMiwokTranslation() {
        return mMiwokTranslation;

    }

    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mImageResourceId=" + mImageResourceId +
                ", mAudioResoureceId=" + mAudioResoureceId +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                '}';
    }
}