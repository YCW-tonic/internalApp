package com.tonic.internalapp.data

class HomeGridItem(appId: String, imgId: Int, stringId: Int) {
    private var appId: String = ""
    private var imgId: Int = 0
    private var stringId: Int = 0
    private var badge: Int = 0

    init {
        this.appId = appId
        this.imgId = imgId
        this.stringId = stringId
    }

    fun getAppId(): String {
        return appId
    }

    fun getImgId(): Int {
        return imgId
    }

    fun getStringId(): Int {
        return stringId
    }

    fun getBadge(): Int {
        return badge
    }

    fun setBadge(badge: Int) {
        this.badge = badge
    }



}