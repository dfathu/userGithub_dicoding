package com.example.githubuserdicodingsubs

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Github_user(
    var username: String?,
    var name: String?,
    var location: String?,
    var repository: Int?,
    var company: String?,
    var followers: Int?,
    var following: Int?,
    var avatar: Int?,
) : Parcelable