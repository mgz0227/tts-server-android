package com.github.mgz0227.tts_server_android.data.entities.replace

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.github.mgz0227.tts_server_android.constant.ReplaceExecution
import com.github.mgz0227.tts_server_android.data.entities.AbstractListGroup

@Entity("replaceRuleGroup")
@kotlinx.serialization.Serializable
data class ReplaceRuleGroup(
    @PrimaryKey
    override val id: Long = System.currentTimeMillis(),
    override var name: String,
    override var order: Int = 0,

    @kotlinx.serialization.Transient
    override var isExpanded: Boolean = false,

    @ColumnInfo(defaultValue = ReplaceExecution.BEFORE.toString())
    var onExecution: Int = ReplaceExecution.BEFORE,
) : AbstractListGroup